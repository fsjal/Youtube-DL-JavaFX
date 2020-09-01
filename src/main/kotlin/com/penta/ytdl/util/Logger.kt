package com.penta.ytdl.util

import java.io.File
import java.text.SimpleDateFormat
import java.util.*
import java.util.logging.*
import java.util.logging.Formatter
import java.util.logging.Logger
import javax.inject.Inject

open class Logger @Inject constructor(private val logger: Logger) {

    init {
        File(FOLDER_NAME).let { if (!it.exists()) it.mkdir() } // create folder
//        LogManager.getLogManager().reset()
        logger.addHandler(FileHandler("$FOLDER_NAME/logs.txt", true).apply { formatter = LogFormatter() })
        logger.addHandler(ConsoleHandler())
        logger.level = Level.FINE
    }

    fun addHandler(handler: Handler) = logger.addHandler(handler)

    fun info(message: String?) = logger.info(message)

    fun warning(message: String?) = logger.warning(message)

    fun critical(message: String?) = logger.severe(message)

    fun fine(message: String?) = logger.fine(message)

    companion object {
        const val FOLDER_NAME = "log"
    }

    private class LogFormatter : Formatter() {

        override fun format(record: LogRecord) = record.run {
            "[$level] - ${SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(Date(millis))}: $message\n"
        }
    }
}