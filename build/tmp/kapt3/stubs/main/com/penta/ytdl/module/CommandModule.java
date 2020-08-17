package com.penta.ytdl.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007\u00a8\u0006\f"}, d2 = {"Lcom/penta/ytdl/module/CommandModule;", "", "()V", "provideProcess", "Ljava/lang/Process;", "processBuilder", "Ljava/lang/ProcessBuilder;", "provideProcessBuilder", "commandString", "", "file", "Ljava/io/File;", "Youtube-DL"})
@dagger.Module()
public final class CommandModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final java.lang.ProcessBuilder provideProcessBuilder(@org.jetbrains.annotations.NotNull()
    java.lang.String commandString, @org.jetbrains.annotations.NotNull()
    java.io.File file) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final java.lang.Process provideProcess(@org.jetbrains.annotations.NotNull()
    java.lang.ProcessBuilder processBuilder) {
        return null;
    }
    
    public CommandModule() {
        super();
    }
}