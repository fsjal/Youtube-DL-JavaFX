package com.penta.ytdl.model

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import java.io.BufferedReader
import java.io.InputStreamReader
import javax.inject.Inject

class Command @Inject constructor(private val process: Process) {

    val lines = flow {
        BufferedReader(InputStreamReader(process.inputStream)).use { input ->
            var line: String?
            while (input.readLine().also { line = it } != null) {
                line?.let {
                    emit(it)
                }
            }
            close()
        }
    }.flowOn(Dispatchers.IO)

    fun close() = process.destroy()

}