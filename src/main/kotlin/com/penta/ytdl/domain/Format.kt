package com.penta.ytdl.domain

data class Format(val code: Int, val extension: String, val resolution: String) {

    override fun toString() = "$extension - [$resolution]"
}