package com.penta.ytdl.module;

import dagger.internal.Factory;
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
public final class CommandModule_ProvideProcessBuilderFactory implements Factory<ProcessBuilder> {
  private final CommandModule module;

  private final Provider<String> commandStringProvider;

  private final Provider<File> fileProvider;

  public CommandModule_ProvideProcessBuilderFactory(CommandModule module,
      Provider<String> commandStringProvider, Provider<File> fileProvider) {
    this.module = module;
    this.commandStringProvider = commandStringProvider;
    this.fileProvider = fileProvider;
  }

  @Override
  public ProcessBuilder get() {
    return provideProcessBuilder(module, commandStringProvider.get(), fileProvider.get());
  }

  public static CommandModule_ProvideProcessBuilderFactory create(CommandModule module,
      Provider<String> commandStringProvider, Provider<File> fileProvider) {
    return new CommandModule_ProvideProcessBuilderFactory(module, commandStringProvider, fileProvider);
  }

  public static ProcessBuilder provideProcessBuilder(CommandModule instance, String commandString,
      File file) {
    return Preconditions.checkNotNull(instance.provideProcessBuilder(commandString, file), "Cannot return null from a non-@Nullable @Provides method");
  }
}
