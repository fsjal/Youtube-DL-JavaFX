package com.penta.ytdl.util;

import java.lang.System;

/**
 * Utility class for showing dialogs
 */
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J,\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bJ6\u0010\f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bJ5\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0019\b\u0002\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00040\u0011\u00a2\u0006\u0002\b\u0013H\u0086\b\u00f8\u0001\u0000J4\u0010\u0014\u001a\n \u0015*\u0004\u0018\u00010\u00060\u00062\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\u0016"}, d2 = {"Lcom/penta/ytdl/util/Dialog;", "", "()V", "alert", "", "title", "", "message", "type", "", "parent", "Ljava/awt/Component;", "confirm", "option", "directoryChooser", "Ljava/io/File;", "init", "Lkotlin/Function1;", "Ljavax/swing/JFileChooser;", "Lkotlin/ExtensionFunctionType;", "input", "kotlin.jvm.PlatformType", "Youtube-DL"})
public final class Dialog {
    public static final com.penta.ytdl.util.Dialog INSTANCE = null;
    
    /**
     * Shows a simple alert dialog
     */
    public final void alert(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String message, int type, @org.jetbrains.annotations.Nullable()
    java.awt.Component parent) {
    }
    
    /**
     * Shows a confirm dialog
     */
    public final int confirm(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String message, int option, int type, @org.jetbrains.annotations.Nullable()
    java.awt.Component parent) {
        return 0;
    }
    
    /**
     * Shows a dialog with input widget
     */
    public final java.lang.String input(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String message, int type, @org.jetbrains.annotations.Nullable()
    java.awt.Component parent) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.io.File directoryChooser(@org.jetbrains.annotations.Nullable()
    java.awt.Component parent, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super javax.swing.JFileChooser, kotlin.Unit> init) {
        return null;
    }
    
    private Dialog() {
        super();
    }
}