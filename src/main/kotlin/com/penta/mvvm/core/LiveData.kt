package com.penta.mvvm.core

import java.util.*
import javax.inject.Inject

@ViewModelScope
class LiveData<T> @Inject constructor(value: T) {

    private var data: T = value
    private val observers: MutableList<(T) -> Unit> = ArrayList()
    var value: T
        get() = data
        set(value) {
            data = value;
            notifyObservers()
        }

    fun observe(observer: (T) -> Unit) {
        observers.add(observer)
        //observer.invoke(value)
    }

    private fun notifyObservers() {
        observers.forEach { it.invoke(value) }
    }
}