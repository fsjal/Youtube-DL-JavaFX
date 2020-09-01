package com.penta.ytdl.controller

import com.penta.ytdl.App
import com.penta.ytdl.component.DaggerMainViewModelComponent
import com.penta.ytdl.component.MainViewModelComponent
import com.penta.ytdl.domain.Format
import com.penta.ytdl.domain.Media
import com.penta.ytdl.resource.Images
import com.penta.ytdl.util.Dialog
import com.penta.ytdl.util.databinding.DataBinding
import com.penta.ytdl.util.databinding.JComboBoxDataBinding
import com.penta.ytdl.view.MainView
import com.penta.ytdl.viewmodel.MainViewModel
import kotlinx.coroutines.*
import java.awt.Component
import java.awt.Toolkit
import java.awt.datatransfer.DataFlavor
import java.io.File
import javax.inject.Inject
import javax.inject.Singleton
import javax.swing.*
import javax.swing.event.PopupMenuEvent
import javax.swing.event.PopupMenuListener
import javax.swing.table.DefaultTableModel
import javax.swing.table.TableCellRenderer
import javax.swing.text.NumberFormatter
import kotlin.properties.Delegates

@Singleton
class MainController @Inject constructor(
        private val parent: Component,
        private val viewModel: MainViewModel
) :
        MainView(),
        CoroutineScope by MainScope(),
        MainViewModelComponent by DaggerMainViewModelComponent.create() {

    private val isExtractAudio by DataBinding<Boolean>("isSelected", extractAudioField)
    private val start by DataBinding<Number>("value", startField)
    private val end by DataBinding<Number>("value", endField)
    private val currentFormat by DataBinding<Format>("selectedItem", formatsField)
    private var url by DataBinding<String>("text", urlField)
    private var formatsList by JComboBoxDataBinding<Format>(formatsField)
    private var formatVisible by DataBinding<Boolean>("isPopupVisible", formatsField)
    private var downloadText by DataBinding<String>("text", downloadButton)
    private var isWorking by Delegates.observable(false) { _, _, value ->
        downloadText = if (value) "Stop" else "Download"
    }
    private val model: DefaultTableModel = downloadList.model as DefaultTableModel
    private val commandStr get() = "youtube-dl " +
            (if (isExtractAudio == true) "-x --audio-format m4a " else "") +
            (if (start != 0) "--playlist-start $start " else "") +
            (if (end != 0) "--playlist-end $end " else "") +
            (if (currentFormat != null) "-f ${currentFormat?.code} " else "") +
            url
    private val formatStr get() = "youtube-dl -F $url"

    init {
        initWidgets()
        initObservers()
    }

    private fun initWidgets() {
        urlField.componentPopupMenu = JPopupMenu().apply {
            add(JMenuItem("Paste", ImageIcon(this@MainController.javaClass.getResource(Images.PASTE)))).apply {
                addActionListener {
                    url = Toolkit.getDefaultToolkit().systemClipboard.getData(DataFlavor.stringFlavor) as String
                }
            }
        }
        downloadButton.addActionListener { if (!isWorking) onDownload() else coroutineContext[Job]?.cancelChildren() }
        startField.model = SpinnerNumberModel(0, 0, Int.MAX_VALUE, 1)
        endField.model = SpinnerNumberModel(0, 0, Int.MAX_VALUE, 1)
        ((startField.editor as JSpinner.NumberEditor).textField.formatter as NumberFormatter).allowsInvalid = false
        ((endField.editor as JSpinner.NumberEditor).textField.formatter as NumberFormatter).allowsInvalid = false
        formatsField.addPopupMenuListener(object : PopupMenuListener {

            private var currentUrl = ""

            override fun popupMenuWillBecomeVisible(e: PopupMenuEvent?) {
                if (currentUrl == url) return
                url?.let { currentUrl = it }
                val command = getCommandComponentFactory().create(formatStr, File(".")).getCommand()
                launch { viewModel.getFormats(command) }
            }

            override fun popupMenuWillBecomeInvisible(e: PopupMenuEvent?) {

            }

            override fun popupMenuCanceled(e: PopupMenuEvent?) {

            }

        })
        initTable()
    }

    private fun initTable() {
        with(downloadList) {
            model = this@MainController.model.apply {
                with(Media) { setColumnIdentifiers(arrayOf(NAME, SIZE, SPEED, ETA, PROGRESS)) }
            }

            downloadList.columnModel.run {
                getColumn(0).preferredWidth = 400
                getColumn(1).preferredWidth = 30
                getColumn(2).preferredWidth = 30
                getColumn(3).preferredWidth = 30
                getColumn(4).preferredWidth = 50
                getColumn(4).cellRenderer = ProgressRenderer()
            }
        }
    }

    private fun initObservers() = with(viewModel) {
        name.observe { model.addRow(arrayOf(it)) }
        size.observe { model.setValueAt(it, model.rowCount - 1, 1) }
        speed.observe { model.setValueAt(it, model.rowCount - 1, 2) }
        eta.observe { model.setValueAt(it, model.rowCount - 1, 3) }
        progress.observe { model.setValueAt(it, model.rowCount - 1, 4) }
        formats.observe {
            formatsList = it
            formatVisible = false
            formatVisible = true
        }
        error.observe { Dialog.alert(App.NAME, it, JOptionPane.ERROR_MESSAGE, parent) }
    }

    private fun onDownload() {
        Dialog.directoryChooser(parent) { currentDirectory = File("D:/Downloads") }?.let {
            val command = getCommandComponentFactory().create(commandStr, it).getCommand()
            isWorking = true
            launch(Dispatchers.IO) { viewModel.download(command) }.invokeOnCompletion { isWorking = false }
        }
    }

    private class ProgressRenderer : JProgressBar(), TableCellRenderer {

        init {
            paintString = true
        }

        override fun getTableCellRendererComponent(table: JTable?, value: Any?, isSelected: Boolean, hasFocus: Boolean,
                                                   row: Int, column: Int) =
                this.apply {
                    value?.let { this.value = value as Int }
                }
    }
}