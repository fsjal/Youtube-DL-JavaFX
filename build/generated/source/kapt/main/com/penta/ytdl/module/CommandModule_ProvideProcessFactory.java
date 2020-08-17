package com.penta.ytdl.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class CommandModule_ProvideProcessFactory implements Factory<Process> {
  private final CommandModule module;

  private final Provider<ProcessBuilder> processBuilderProvider;

  public CommandModule_ProvideProcessFactory(CommandModule module,
      Provider<ProcessBuilder> processBuilderProvider) {
    this.module = module;
    this.processBuilderProvider = processBuilderProvider;
  }

  @Override
  public Process get() {
    return provideProcess(module, processBuilderProvider.get());
  }

  public static CommandModule_ProvideProcessFactory create(CommandModule module,
      Provider<ProcessBuilder> processBuilderProvider) {
    return new CommandModule_ProvideProcessFactory(module, processBuilderProvider);
  }

  public static Process provideProcess(CommandModule instance, ProcessBuilder processBuilder) {
    return Preconditions.checkNotNull(instance.provideProcess(processBuilder), "Cannot return null from a non-@Nullable @Provides method");
  }
}
