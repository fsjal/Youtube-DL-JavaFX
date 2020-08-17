package com.penta.ytdl.component

import com.penta.ytdl.controller.MainController
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component
interface MainControllerComponent {

    fun getController(): MainController
}