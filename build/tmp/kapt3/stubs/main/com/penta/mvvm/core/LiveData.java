package com.penta.mvvm.core;

import java.lang.System;

@ViewModelScope()
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u000e\u001a\u00020\nH\u0002J\u001a\u0010\u000f\u001a\u00020\n2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\tR\u0010\u0010\u0005\u001a\u00028\u0000X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0006R \u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u00008F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u0004\u00a8\u0006\u0011"}, d2 = {"Lcom/penta/mvvm/core/LiveData;", "T", "", "value", "(Ljava/lang/Object;)V", "data", "Ljava/lang/Object;", "observers", "", "Lkotlin/Function1;", "", "getValue", "()Ljava/lang/Object;", "setValue", "notifyObservers", "observe", "observer", "Youtube-DL"})
public final class LiveData<T extends java.lang.Object> {
    private T data;
    private final java.util.List<kotlin.jvm.functions.Function1<T, kotlin.Unit>> observers = null;
    
    public final T getValue() {
        return null;
    }
    
    public final void setValue(T value) {
    }
    
    public final void observe(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, kotlin.Unit> observer) {
    }
    
    private final void notifyObservers() {
    }
    
    @javax.inject.Inject()
    public LiveData(T value) {
        super();
    }
}