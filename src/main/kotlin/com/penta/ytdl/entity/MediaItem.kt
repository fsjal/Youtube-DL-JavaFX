package com.penta.ytdl.entity

import com.penta.ytdl.domain.Media
import javax.swing.table.TableModel
import kotlin.properties.Delegates

class MediaItem(name: String, size: String, private val index: Int, private val model: TableModel) : Media(name, size) {

    override var progress by Delegates.observable("0%", { _, _, value ->
        model.setValueAt(value, index, 2)
    })

    override var eta by Delegates.observable("") { _, _, value ->
        model.setValueAt(value, index, 1)
    }

    override var speed by Delegates.observable("") { _, _, value ->
        model.setValueAt(value, index, 1)
    }
}