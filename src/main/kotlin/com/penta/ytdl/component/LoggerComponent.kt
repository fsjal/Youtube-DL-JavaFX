package com.penta.ytdl.component

import com.penta.ytdl.module.LoggerModule
import com.penta.ytdl.util.Logger
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [LoggerModule::class])
interface LoggerComponent {

    fun getLogger(): Logger
}