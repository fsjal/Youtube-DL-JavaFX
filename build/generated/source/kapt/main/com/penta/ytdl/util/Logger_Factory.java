package com.penta.ytdl.util;

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
public final class Logger_Factory implements Factory<Logger> {
  private final Provider<java.util.logging.Logger> loggerProvider;

  public Logger_Factory(Provider<java.util.logging.Logger> loggerProvider) {
    this.loggerProvider = loggerProvider;
  }

  @Override
  public Logger get() {
    return newInstance(loggerProvider.get());
  }

  public static Logger_Factory create(Provider<java.util.logging.Logger> loggerProvider) {
    return new Logger_Factory(loggerProvider);
  }

  public static Logger newInstance(java.util.logging.Logger logger) {
    return new Logger(logger);
  }
}
