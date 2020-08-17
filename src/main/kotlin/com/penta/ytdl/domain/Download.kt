package com.penta.ytdl.domain

data class Download(
    val url: String,
    val extension: String? = null,
    val resolution: String? = null,
    val start: String? = null,
    val end: String? = null,
    val isAudioOny: Boolean = false
)