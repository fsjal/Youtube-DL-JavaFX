package com.penta.ytdl.repository

import com.penta.ytdl.model.Command
import javax.inject.Inject

class CommandRepository @Inject constructor() {

    fun run(command: Command) = command.lines
}