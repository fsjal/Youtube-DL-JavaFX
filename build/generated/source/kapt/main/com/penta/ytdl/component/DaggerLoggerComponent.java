package com.penta.ytdl.component;

import com.penta.ytdl.module.LoggerModule;
import com.penta.ytdl.module.LoggerModule_ProvideLoggerFactory;
import com.penta.ytdl.util.Logger;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerLoggerComponent implements LoggerComponent {
  private final LoggerModule loggerModule;

  private DaggerLoggerComponent(LoggerModule loggerModuleParam) {
    this.loggerModule = loggerModuleParam;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static LoggerComponent create() {
    return new Builder().build();
  }

  @Override
  public Logger getLogger() {
    return new Logger(LoggerModule_ProvideLoggerFactory.provideLogger(loggerModule));
  }

  public static final class Builder {
    private LoggerModule loggerModule;

    private Builder() {
    }

    public Builder loggerModule(LoggerModule loggerModule) {
      this.loggerModule = Preconditions.checkNotNull(loggerModule);
      return this;
    }

    public LoggerComponent build() {
      if (loggerModule == null) {
        this.loggerModule = new LoggerModule();
      }
      return new DaggerLoggerComponent(loggerModule);
    }
  }
}
