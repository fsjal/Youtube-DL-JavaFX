package com.penta.ytdl.view

import com.penta.ytdl.component.DaggerMainControllerComponent
import com.penta.ytdl.component.MainControllerComponent
import javax.swing.JFrame

class MainWindow :
        JFrame(),
        MainControllerComponent by DaggerMainControllerComponent.create() {

    init {
        title = "Youtube-DL Client"
        contentPane = getController().root
        defaultCloseOperation = EXIT_ON_CLOSE
        pack()
        setLocationRelativeTo(null)
        isVisible = true
    }
}