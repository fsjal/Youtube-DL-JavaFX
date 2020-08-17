package com.penta.ytdl.component;

import com.penta.ytdl.model.Command;
import com.penta.ytdl.model.Parser;
import com.penta.ytdl.model.Parser_Factory;
import com.penta.ytdl.module.CommandModule;
import com.penta.ytdl.module.CommandModule_ProvideProcessBuilderFactory;
import com.penta.ytdl.module.CommandModule_ProvideProcessFactory;
import com.penta.ytdl.repository.CommandRepository_Factory;
import com.penta.ytdl.viewmodel.MainViewModel;
import com.penta.ytdl.viewmodel.MainViewModel_Factory;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import java.io.File;
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
public final class DaggerMainViewModelComponent implements MainViewModelComponent {
  private Provider<Parser> parserProvider;

  private Provider<MainViewModel> mainViewModelProvider;

  private DaggerMainViewModelComponent() {

    initialize();
  }

  public static Builder builder() {
    return new Builder();
  }

  public static MainViewModelComponent create() {
    return new Builder().build();
  }

  @SuppressWarnings("unchecked")
  private void initialize() {
    this.parserProvider = DoubleCheck.provider(Parser_Factory.create());
    this.mainViewModelProvider = DoubleCheck.provider(MainViewModel_Factory.create(CommandRepository_Factory.create(), parserProvider));
  }

  @Override
  public MainViewModel getMainViewModel() {
    return mainViewModelProvider.get();
  }

  @Override
  public CommandComponent.Factory getCommandComponentFactory() {
    return new CommandComponentFactory();
  }

  public static final class Builder {
    private Builder() {
    }

    public MainViewModelComponent build() {
      return new DaggerMainViewModelComponent();
    }
  }

  private final class CommandComponentFactory implements CommandComponent.Factory {
    @Override
    public CommandComponent create(String arg0, File arg1) {
      Preconditions.checkNotNull(arg0);
      Preconditions.checkNotNull(arg1);
      return new CommandComponentImpl(new CommandModule(), arg0, arg1);
    }
  }

  private final class CommandComponentImpl implements CommandComponent {
    private final String arg0;

    private final File arg1;

    private final CommandModule commandModule;

    private CommandComponentImpl(CommandModule commandModuleParam, String arg0Param,
        File arg1Param) {
      this.arg0 = arg0Param;
      this.arg1 = arg1Param;
      this.commandModule = commandModuleParam;
    }

    private ProcessBuilder getProcessBuilder() {
      return CommandModule_ProvideProcessBuilderFactory.provideProcessBuilder(commandModule, arg0, arg1);
    }

    private Process getProcess() {
      return CommandModule_ProvideProcessFactory.provideProcess(commandModule, getProcessBuilder());
    }

    @Override
    public Command getCommand() {
      return new Command(getProcess());
    }
  }
}
