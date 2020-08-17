package com.penta.ytdl.module

import dagger.Module
import dagger.Provides
import java.io.File

@Module
class CommandModule {

    @Provides
    fun provideProcessBuilder(commandString: String, file: File) = ProcessBuilder(commandString.split(' ')).apply {
        redirectErrorStream(true)
        directory(file)
    }

    @Provides
    fun provideProcess(processBuilder: ProcessBuilder): Process = processBuilder.start()
}