package com.penta.ytdl.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0016\u0018\u0000 \u000f2\u00020\u0001:\u0002\u000f\u0010B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0010\u0010\t\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\f\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\r\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\u000e\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/penta/ytdl/util/Logger;", "", "logger", "Ljava/util/logging/Logger;", "(Ljava/util/logging/Logger;)V", "addHandler", "", "handler", "Ljava/util/logging/Handler;", "critical", "message", "", "fine", "info", "warning", "Companion", "LogFormatter", "Youtube-DL"})
public class Logger {
    private final java.util.logging.Logger logger = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FOLDER_NAME = "log";
    public static final com.penta.ytdl.util.Logger.Companion Companion = null;
    
    public final void addHandler(@org.jetbrains.annotations.NotNull()
    java.util.logging.Handler handler) {
    }
    
    public final void info(@org.jetbrains.annotations.Nullable()
    java.lang.String message) {
    }
    
    public final void warning(@org.jetbrains.annotations.Nullable()
    java.lang.String message) {
    }
    
    public final void critical(@org.jetbrains.annotations.Nullable()
    java.lang.String message) {
    }
    
    public final void fine(@org.jetbrains.annotations.Nullable()
    java.lang.String message) {
    }
    
    @javax.inject.Inject()
    public Logger(@org.jetbrains.annotations.NotNull()
    java.util.logging.Logger logger) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\u0007"}, d2 = {"Lcom/penta/ytdl/util/Logger$LogFormatter;", "Ljava/util/logging/Formatter;", "()V", "format", "", "record", "Ljava/util/logging/LogRecord;", "Youtube-DL"})
    static final class LogFormatter extends java.util.logging.Formatter {
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String format(@org.jetbrains.annotations.NotNull()
        java.util.logging.LogRecord record) {
            return null;
        }
        
        public LogFormatter() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/penta/ytdl/util/Logger$Companion;", "", "()V", "FOLDER_NAME", "", "Youtube-DL"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}