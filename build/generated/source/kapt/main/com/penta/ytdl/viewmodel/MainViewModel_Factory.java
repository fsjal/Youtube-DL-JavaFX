package com.penta.ytdl.viewmodel;

import com.penta.ytdl.model.Parser;
import com.penta.ytdl.repository.CommandRepository;
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
public final class MainViewModel_Factory implements Factory<MainViewModel> {
  private final Provider<CommandRepository> repositoryProvider;

  private final Provider<Parser> parserProvider;

  public MainViewModel_Factory(Provider<CommandRepository> repositoryProvider,
      Provider<Parser> parserProvider) {
    this.repositoryProvider = repositoryProvider;
    this.parserProvider = parserProvider;
  }

  @Override
  public MainViewModel get() {
    return newInstance(repositoryProvider.get(), parserProvider.get());
  }

  public static MainViewModel_Factory create(Provider<CommandRepository> repositoryProvider,
      Provider<Parser> parserProvider) {
    return new MainViewModel_Factory(repositoryProvider, parserProvider);
  }

  public static MainViewModel newInstance(CommandRepository repository, Parser parser) {
    return new MainViewModel(repository, parser);
  }
}
