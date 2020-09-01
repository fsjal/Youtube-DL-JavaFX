package com.penta.ytdl.controller;

import com.penta.ytdl.viewmodel.MainViewModel;
import dagger.internal.Factory;
import java.awt.Component;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MainController_Factory implements Factory<MainController> {
  private final Provider<Component> parentProvider;

  private final Provider<MainViewModel> viewModelProvider;

  public MainController_Factory(Provider<Component> parentProvider,
      Provider<MainViewModel> viewModelProvider) {
    this.parentProvider = parentProvider;
    this.viewModelProvider = viewModelProvider;
  }

  @Override
  public MainController get() {
    return newInstance(parentProvider.get(), viewModelProvider.get());
  }

  public static MainController_Factory create(Provider<Component> parentProvider,
      Provider<MainViewModel> viewModelProvider) {
    return new MainController_Factory(parentProvider, viewModelProvider);
  }

  public static MainController newInstance(Component parent, MainViewModel viewModel) {
    return new MainController(parent, viewModel);
  }
}
