package com.penta.ytdl.component;

import com.penta.ytdl.controller.MainController;
import com.penta.ytdl.controller.MainController_Factory;
import com.penta.ytdl.model.Parser;
import com.penta.ytdl.model.Parser_Factory;
import com.penta.ytdl.repository.CommandRepository_Factory;
import com.penta.ytdl.viewmodel.MainViewModel;
import com.penta.ytdl.viewmodel.MainViewModel_Factory;
import dagger.internal.DoubleCheck;
import dagger.internal.InstanceFactory;
import dagger.internal.Preconditions;
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
public final class DaggerMainControllerComponent implements MainControllerComponent {
  private Provider<Component> parentProvider;

  private Provider<Parser> parserProvider;

  private Provider<MainViewModel> mainViewModelProvider;

  private Provider<MainController> mainControllerProvider;

  private DaggerMainControllerComponent(Component parentParam) {

    initialize(parentParam);
  }

  public static MainControllerComponent.Factory factory() {
    return new Factory();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Component parentParam) {
    this.parentProvider = InstanceFactory.create(parentParam);
    this.parserProvider = DoubleCheck.provider(Parser_Factory.create());
    this.mainViewModelProvider = DoubleCheck.provider(MainViewModel_Factory.create(CommandRepository_Factory.create(), parserProvider));
    this.mainControllerProvider = DoubleCheck.provider(MainController_Factory.create(parentProvider, mainViewModelProvider));
  }

  @Override
  public MainController getController() {
    return mainControllerProvider.get();
  }

  private static final class Factory implements MainControllerComponent.Factory {
    @Override
    public MainControllerComponent create(Component parent) {
      Preconditions.checkNotNull(parent);
      return new DaggerMainControllerComponent(parent);
    }
  }
}
