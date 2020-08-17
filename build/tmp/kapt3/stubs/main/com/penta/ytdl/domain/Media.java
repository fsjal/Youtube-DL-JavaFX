package com.penta.ytdl.domain;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0016\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\bR\u001a\u0010\u0007\u001a\u00020\u0003X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001a\u0010\u0006\u001a\u00020\u0003X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\fR\u001a\u0010\u0005\u001a\u00020\u0003X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\n\"\u0004\b\u0014\u0010\f\u00a8\u0006\u0016"}, d2 = {"Lcom/penta/ytdl/domain/Media;", "", "name", "", "size", "speed", "progress", "eta", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEta", "()Ljava/lang/String;", "setEta", "(Ljava/lang/String;)V", "getName", "setName", "getProgress", "setProgress", "getSize", "setSize", "getSpeed", "setSpeed", "Companion", "Youtube-DL"})
public class Media {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String name;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String size;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String speed;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String progress;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String eta;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String NAME = "Name";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SIZE = "Size";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SPEED = "Speed";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PROGRESS = "Progress";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ETA = "Time Left";
    public static final com.penta.ytdl.domain.Media.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSize() {
        return null;
    }
    
    public final void setSize(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getSpeed() {
        return null;
    }
    
    public void setSpeed(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getProgress() {
        return null;
    }
    
    public void setProgress(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getEta() {
        return null;
    }
    
    public void setEta(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public Media(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String size, @org.jetbrains.annotations.NotNull()
    java.lang.String speed, @org.jetbrains.annotations.NotNull()
    java.lang.String progress, @org.jetbrains.annotations.NotNull()
    java.lang.String eta) {
        super();
    }
    
    public Media() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/penta/ytdl/domain/Media$Companion;", "", "()V", "ETA", "", "NAME", "PROGRESS", "SIZE", "SPEED", "Youtube-DL"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}