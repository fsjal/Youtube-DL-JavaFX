package com.penta.ytdl.module

import dagger.Module
import dagger.Provides
import java.util.logging.Logger

@Module
class LoggerModule {

    @Provides
    fun provideLogger() = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME)
}