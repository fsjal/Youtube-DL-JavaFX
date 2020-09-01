package com.penta.ytdl.component;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0004J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0005"}, d2 = {"Lcom/penta/ytdl/component/MainControllerComponent;", "", "getController", "Lcom/penta/ytdl/controller/MainController;", "Factory", "Youtube-DL"})
@dagger.Component()
@javax.inject.Singleton()
public abstract interface MainControllerComponent {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.penta.ytdl.controller.MainController getController();
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/penta/ytdl/component/MainControllerComponent$Factory;", "", "create", "Lcom/penta/ytdl/component/MainControllerComponent;", "parent", "Ljava/awt/Component;", "Youtube-DL"})
    @dagger.Component.Factory()
    public static abstract interface Factory {
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.penta.ytdl.component.MainControllerComponent create(@org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        java.awt.Component parent);
    }
}