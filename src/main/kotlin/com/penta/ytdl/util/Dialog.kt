package com.penta.ytdl.util

import com.penta.ytdl.App
import java.awt.Component
import java.io.File
import javax.swing.JFileChooser
import javax.swing.JOptionPane.*

/**
 * Utility class for showing dialogs
 */
object Dialog {

    /**
     * Shows a simple alert dialog
     */
    fun alert(title: String, message: String, type: Int = INFORMATION_MESSAGE, parent: Component? = null) =
        showMessageDialog(parent, message, title, type)

    /**
     * Shows a confirm dialog
     */
    fun confirm(title: String, message: String, option: Int = CANCEL_OPTION, type: Int = QUESTION_MESSAGE, parent: Component? = null) =
        showConfirmDialog(parent, message, title, option, type)

    /**
     * Shows a dialog with input widget
     */
    fun input(title: String, message: String, type: Int = INFORMATION_MESSAGE, parent: Component? = null) =
        showInputDialog(parent, message, title, type)

    inline fun directoryChooser(parent: Component? = null, init: JFileChooser.() -> Unit = {}) = JFileChooser()
            .apply(init)
            .run {
                dialogTitle = App.APP_NAME
                fileSelectionMode = JFileChooser.DIRECTORIES_ONLY
                if (showOpenDialog(parent) == JFileChooser.APPROVE_OPTION) selectedFile else null
            }
}