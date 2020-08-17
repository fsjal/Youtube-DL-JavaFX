package com.penta.ytdl.component;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0004J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0005"}, d2 = {"Lcom/penta/ytdl/component/CommandComponent;", "", "getCommand", "Lcom/penta/ytdl/model/Command;", "Factory", "Youtube-DL"})
@dagger.Subcomponent(modules = {com.penta.ytdl.module.CommandModule.class})
public abstract interface CommandComponent {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.penta.ytdl.model.Command getCommand();
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/penta/ytdl/component/CommandComponent$Factory;", "", "create", "Lcom/penta/ytdl/component/CommandComponent;", "commandStr", "", "destination", "Ljava/io/File;", "Youtube-DL"})
    @dagger.Subcomponent.Factory()
    public static abstract interface Factory {
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.penta.ytdl.component.CommandComponent create(@org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        java.lang.String commandStr, @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        java.io.File destination);
    }
}