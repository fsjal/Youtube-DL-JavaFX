package com.penta.ytdl.util.databinding

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class DataBinding<T>(private val propertyName: String, private val widget: Any) : ReadWriteProperty<Any, T?> {

    private val getPropertyName get() =
        if (propertyName.startsWith("is")) propertyName else "get${propertyName.capitalize()}"
    private val setPropertyName get() = "set" +
        if (propertyName.startsWith("is")) propertyName.substring(2) else propertyName

    override fun getValue(thisRef: Any, property: KProperty<*>) = getMethod(widget.javaClass)?.run {
        declaredMethods.find { it.name.contains(getPropertyName, true) && it.parameterCount == 0 }?.invoke(widget)
    } as T?

    override fun setValue(thisRef: Any, property: KProperty<*>, value: T?) {
        getMethod(widget.javaClass)?.run {
            declaredMethods.find { it.name.contains(setPropertyName, true) && it.parameterCount == 1 }?.invoke(widget, value)
        }
    }

    private fun getMethod(klass: Class<*>?): Class<*>? = klass?.run {
        if (declaredMethods.any { it.name.contains(getPropertyName, true) }) this else getMethod(superclass)
    }
}