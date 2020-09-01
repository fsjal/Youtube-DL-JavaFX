package com.penta.ytdl.view

import com.penta.ytdl.App
import com.penta.ytdl.component.DaggerMainControllerComponent
import com.penta.ytdl.resource.Images
import javax.imageio.ImageIO
import javax.swing.JFrame

class MainWindow : JFrame() {

    init {
        title = App.NAME
        contentPane = DaggerMainControllerComponent.factory().create(this).getController().root
        iconImage = ImageIO.read(javaClass.getResource(Images.APP))
        defaultCloseOperation = EXIT_ON_CLOSE
        pack()
        setLocationRelativeTo(null)
        isVisible = true
    }
}