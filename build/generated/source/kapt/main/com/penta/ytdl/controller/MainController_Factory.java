package com.penta.ytdl.controller;

import com.penta.ytdl.viewmodel.MainViewModel;
import dagger.internal.Factory;
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
  private final Provider<MainViewModel> viewModelProvider;

  public MainController_Factory(Provider<MainViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  @Override
  public MainController get() {
    return newInstance(viewModelProvider.get());
  }

  public static MainController_Factory create(Provider<MainViewModel> viewModelProvider) {
    return new MainController_Factory(viewModelProvider);
  }

  public static MainController newInstance(MainViewModel viewModel) {
    return new MainController(viewModel);
  }
}
