package com.penta.ytdl.viewmodel

import com.penta.mvvm.core.LiveData
import com.penta.ytdl.domain.Format
import com.penta.ytdl.domain.Media
import com.penta.ytdl.model.Command
import com.penta.ytdl.model.Parser
import com.penta.ytdl.repository.CommandRepository
import kotlinx.coroutines.flow.collect
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class MainViewModel @Inject constructor(
        private val repository: CommandRepository,
        private val parser: Parser
) {

    val error = LiveData("")
    val name = LiveData("")
    val size = LiveData("")
    val speed = LiveData("")
    val eta = LiveData("")
    val progress = LiveData(0)
    val formats = LiveData<List<Format>>(emptyList())

    suspend fun download(command: Command) {
            repository.run(command).collect {
                parser.error(it)?.let { e -> error.value = e }
                parser.getName(it)?.let { newName -> name.value = newName }
                parser.getStats(it)?.let { values ->
                    size.value = values[Media.SIZE] ?: "0.0Kio"
                    speed.value = values[Media.SPEED] ?: "0KiB/s"
                    eta.value = values[Media.ETA]?.let { if (it.trim() == "00:00") "Finished" else it } ?: "0s"
                    progress.value = values[Media.PROGRESS]?.toFloat()?.toInt() ?: 0
                }
            }
    }

    suspend fun getFormats(command: Command) {
        val formats = mutableListOf<Format>()
        repository.run(command).collect {
            parser.getFormat(it)?.let {
                formats += Format(it["code"]!!.toInt(), it["extension"]!!, it["resolution"]!!)
            }
        }
        this@MainViewModel.formats.value = formats
    }
}