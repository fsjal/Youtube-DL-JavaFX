package com.penta.ytdl.model;

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
public final class Command_Factory implements Factory<Command> {
  private final Provider<Process> processProvider;

  public Command_Factory(Provider<Process> processProvider) {
    this.processProvider = processProvider;
  }

  @Override
  public Command get() {
    return newInstance(processProvider.get());
  }

  public static Command_Factory create(Provider<Process> processProvider) {
    return new Command_Factory(processProvider);
  }

  public static Command newInstance(Process process) {
    return new Command(process);
  }
}
