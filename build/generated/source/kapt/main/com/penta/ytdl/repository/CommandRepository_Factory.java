package com.penta.ytdl.repository;

import dagger.internal.Factory;
import javax.annotation.processing.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CommandRepository_Factory implements Factory<CommandRepository> {
  @Override
  public CommandRepository get() {
    return newInstance();
  }

  public static CommandRepository_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static CommandRepository newInstance() {
    return new CommandRepository();
  }

  private static final class InstanceHolder {
    private static final CommandRepository_Factory INSTANCE = new CommandRepository_Factory();
  }
}
