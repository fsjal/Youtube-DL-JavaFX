package com.penta.ytdl.component;

import com.penta.ytdl.controller.MainController;
import com.penta.ytdl.controller.MainController_Factory;
import com.penta.ytdl.model.Parser;
import com.penta.ytdl.model.Parser_Factory;
import com.penta.ytdl.repository.CommandRepository_Factory;
import com.penta.ytdl.viewmodel.MainViewModel;
import com.penta.ytdl.viewmodel.MainViewModel_Factory;
import dagger.internal.DoubleCheck;
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
public final class DaggerMainControllerComponent implements MainControllerComponent {
  private Provider<Parser> parserProvider;

  private Provider<MainViewModel> mainViewModelProvider;

  private Provider<MainController> mainControllerProvider;

  private DaggerMainControllerComponent() {

    initialize();
  }

  public static Builder builder() {
    return new Builder();
  }

  public static MainControllerComponent create() {
    return new Builder().build();
  }

  @SuppressWarnings("unchecked")
  private void initialize() {
    this.parserProvider = DoubleCheck.provider(Parser_Factory.create());
    this.mainViewModelProvider = DoubleCheck.provider(MainViewModel_Factory.create(CommandRepository_Factory.create(), parserProvider));
    this.mainControllerProvider = DoubleCheck.provider(MainController_Factory.create(mainViewModelProvider));
  }

  @Override
  public MainController getController() {
    return mainControllerProvider.get();
  }

  public static final class Builder {
    private Builder() {
    }

    public MainControllerComponent build() {
      return new DaggerMainControllerComponent();
    }
  }
}
