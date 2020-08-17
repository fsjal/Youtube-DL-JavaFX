package com.penta.ytdl.model;

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
public final class Parser_Factory implements Factory<Parser> {
  @Override
  public Parser get() {
    return newInstance();
  }

  public static Parser_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static Parser newInstance() {
    return new Parser();
  }

  private static final class InstanceHolder {
    private static final Parser_Factory INSTANCE = new Parser_Factory();
  }
}
