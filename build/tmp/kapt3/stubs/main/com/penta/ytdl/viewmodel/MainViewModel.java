package com.penta.ytdl.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fJ\u0019\u0010\u0011\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u001d\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000bR\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000bR\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006 "}, d2 = {"Lcom/penta/ytdl/viewmodel/MainViewModel;", "", "repository", "Lcom/penta/ytdl/repository/CommandRepository;", "parser", "Lcom/penta/ytdl/model/Parser;", "(Lcom/penta/ytdl/repository/CommandRepository;Lcom/penta/ytdl/model/Parser;)V", "error", "Lcom/penta/mvvm/core/LiveData;", "", "getError", "()Lcom/penta/mvvm/core/LiveData;", "eta", "getEta", "formats", "", "Lcom/penta/ytdl/domain/Format;", "getFormats", "name", "getName", "progress", "", "getProgress", "size", "getSize", "speed", "getSpeed", "download", "", "command", "Lcom/penta/ytdl/model/Command;", "(Lcom/penta/ytdl/model/Command;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Youtube-DL"})
@javax.inject.Singleton()
public final class MainViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.penta.mvvm.core.LiveData<java.lang.String> error = null;
    @org.jetbrains.annotations.NotNull()
    private final com.penta.mvvm.core.LiveData<java.lang.String> name = null;
    @org.jetbrains.annotations.NotNull()
    private final com.penta.mvvm.core.LiveData<java.lang.String> size = null;
    @org.jetbrains.annotations.NotNull()
    private final com.penta.mvvm.core.LiveData<java.lang.String> speed = null;
    @org.jetbrains.annotations.NotNull()
    private final com.penta.mvvm.core.LiveData<java.lang.String> eta = null;
    @org.jetbrains.annotations.NotNull()
    private final com.penta.mvvm.core.LiveData<java.lang.Integer> progress = null;
    @org.jetbrains.annotations.NotNull()
    private final com.penta.mvvm.core.LiveData<java.util.List<com.penta.ytdl.domain.Format>> formats = null;
    private final com.penta.ytdl.repository.CommandRepository repository = null;
    private final com.penta.ytdl.model.Parser parser = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.penta.mvvm.core.LiveData<java.lang.String> getError() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.penta.mvvm.core.LiveData<java.lang.String> getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.penta.mvvm.core.LiveData<java.lang.String> getSize() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.penta.mvvm.core.LiveData<java.lang.String> getSpeed() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.penta.mvvm.core.LiveData<java.lang.String> getEta() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.penta.mvvm.core.LiveData<java.lang.Integer> getProgress() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.penta.mvvm.core.LiveData<java.util.List<com.penta.ytdl.domain.Format>> getFormats() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object download(@org.jetbrains.annotations.NotNull()
    com.penta.ytdl.model.Command command, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getFormats(@org.jetbrains.annotations.NotNull()
    com.penta.ytdl.model.Command command, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @javax.inject.Inject()
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    com.penta.ytdl.repository.CommandRepository repository, @org.jetbrains.annotations.NotNull()
    com.penta.ytdl.model.Parser parser) {
        super();
    }
}