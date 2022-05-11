package com.example.data;

import com.example.data.remote.habits.RemoteHabitRepository;
import com.example.data.remote.habits.RemoteHabitService;
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
public final class DataModule_ProvideRemoteHabitRepositoryFactory implements Factory<RemoteHabitRepository> {
  private final DataModule module;

  private final Provider<RemoteHabitService> remoteHabitServiceProvider;

  public DataModule_ProvideRemoteHabitRepositoryFactory(DataModule module,
      Provider<RemoteHabitService> remoteHabitServiceProvider) {
    this.module = module;
    this.remoteHabitServiceProvider = remoteHabitServiceProvider;
  }

  @Override
  public RemoteHabitRepository get() {
    return provideRemoteHabitRepository(module, remoteHabitServiceProvider.get());
  }

  public static DataModule_ProvideRemoteHabitRepositoryFactory create(DataModule module,
      Provider<RemoteHabitService> remoteHabitServiceProvider) {
    return new DataModule_ProvideRemoteHabitRepositoryFactory(module, remoteHabitServiceProvider);
  }

  public static RemoteHabitRepository provideRemoteHabitRepository(DataModule instance,
      RemoteHabitService remoteHabitService) {
    return Preconditions.checkNotNull(instance.provideRemoteHabitRepository(remoteHabitService), "Cannot return null from a non-@Nullable @Provides method");
  }
}
