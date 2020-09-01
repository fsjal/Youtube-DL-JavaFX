package com.penta.ytdl

import com.penta.ytdl.view.MainWindow
import javax.swing.UIManager

class App {

    companion object {
        const val NAME = "Youtube-DL"

        @JvmStatic
        fun main(args: Array<String>) {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName())
            MainWindow()
        }
    }
}