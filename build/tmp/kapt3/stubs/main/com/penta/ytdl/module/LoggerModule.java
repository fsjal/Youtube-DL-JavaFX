package com.penta.ytdl.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004H\u0007\u00a8\u0006\u0006"}, d2 = {"Lcom/penta/ytdl/module/LoggerModule;", "", "()V", "provideLogger", "Ljava/util/logging/Logger;", "kotlin.jvm.PlatformType", "Youtube-DL"})
@dagger.Module()
public final class LoggerModule {
    
    @dagger.Provides()
    public final java.util.logging.Logger provideLogger() {
        return null;
    }
    
    public LoggerModule() {
        super();
    }
}