package com.penta.ytdl.component

import com.penta.ytdl.controller.MainController
import com.penta.ytdl.viewmodel.MainViewModel
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component
interface MainViewModelComponent {

    fun getMainViewModel(): MainViewModel

    fun getCommandComponentFactory(): CommandComponent.Factory
}