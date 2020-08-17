package com.penta.ytdl.domain

open class Media(
    var name: String = "",
    var size: String = "",
    open var speed: String = "",
    open var progress: String = "0%",
    open var eta: String = ""
) {

    companion object {
        const val NAME = "Name"
        const val SIZE = "Size"
        const val SPEED = "Speed"
        const val PROGRESS = "Progress"
        const val ETA = "Time Left"
    }
}