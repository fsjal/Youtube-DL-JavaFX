package com.penta.ytdl.model

import com.penta.ytdl.domain.Media
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class Parser @Inject constructor() {

    fun getName(input: String) = "^\\[download\\] Destination: (.*)$".toRegex()
            .find(input)
            ?.groupValues
            ?.get(1)

    fun getStats(input: String) = "\\[download\\]\\s+(.*?)% of\\s+(.*?) at\\s+(.*?) ETA\\s+(.*)".toRegex()
            .find(input)
            ?.groupValues
            ?.run {
                mapOf(
                    Media.PROGRESS to get(1),
                    Media.SIZE to get(2),
                    Media.SPEED to get(3),
                    Media.ETA to get(4)
                )
            }

    fun detectDownload(input: String) = "Downloading.+webpage$".toRegex().find(input) != null

    fun error(input: String) = "ERROR: (.*)".toRegex().find(input)?.groupValues?.get(1)

    fun getFormat(input: String) = "(\\d+?)\\s+(.+?)\\s+(.+?)\\s".toRegex().find(input)?.groupValues?.let {
        mapOf(
                "code" to it[1].trim(),
                "extension" to it[2].trim(),
                "resolution" to it[3].trim()
                )
    }

}