package com.penta.ytdl.util.databinding

import javax.swing.DefaultComboBoxModel
import javax.swing.JComboBox
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class JComboBoxDataBinding<T>(widget: JComboBox<T>) : ReadWriteProperty<Any, List<T>> {

    private val model = widget.model as DefaultComboBoxModel<T>

    override fun getValue(thisRef: Any, property: KProperty<*>) = (0..model.size).map { model.getElementAt(it) }

    override fun setValue(thisRef: Any, property: KProperty<*>, value: List<T>) {
        model.removeAllElements()
        model.addAll(value)
    }
}