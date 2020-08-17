package com.penta.mvvm.core;

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
public final class LiveData_Factory<T> implements Factory<LiveData<T>> {
  private final Provider<T> valueProvider;

  public LiveData_Factory(Provider<T> valueProvider) {
    this.valueProvider = valueProvider;
  }

  @Override
  public LiveData<T> get() {
    return newInstance(valueProvider.get());
  }

  public static <T> LiveData_Factory<T> create(Provider<T> valueProvider) {
    return new LiveData_Factory<T>(valueProvider);
  }

  public static <T> LiveData<T> newInstance(T value) {
    return new LiveData<T>(value);
  }
}
