package com.penta.ytdl.component;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/penta/ytdl/component/MainViewModelComponent;", "", "getCommandComponentFactory", "Lcom/penta/ytdl/component/CommandComponent$Factory;", "getMainViewModel", "Lcom/penta/ytdl/viewmodel/MainViewModel;", "Youtube-DL"})
@dagger.Component()
@javax.inject.Singleton()
public abstract interface MainViewModelComponent {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.penta.ytdl.viewmodel.MainViewModel getMainViewModel();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.penta.ytdl.component.CommandComponent.Factory getCommandComponentFactory();
}