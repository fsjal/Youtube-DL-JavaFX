package com.penta.ytdl.component

import com.penta.ytdl.controller.MainController
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component
interface MainControllerComponent {

    fun getController(): MainController

    @Component.Factory
    interface Factory {

        fun create(@BindsInstance parent: java.awt.Component): MainControllerComponent
    }
}