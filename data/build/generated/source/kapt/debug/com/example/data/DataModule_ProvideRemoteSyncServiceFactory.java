package com.example.data;

import com.example.data.database.HabitsRepository;
import com.example.data.remote.habits.RemoteHabitRepository;
import com.example.data.remote.habits.RemoteSyncService;
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
public final class DataModule_ProvideRemoteSyncServiceFactory implements Factory<RemoteSyncService> {
  private final DataModule module;

  private final Provider<HabitsRepository> localRepositoryProvider;

  private final Provider<RemoteHabitRepository> remoteRepositoryProvider;

  public DataModule_ProvideRemoteSyncServiceFactory(DataModule module,
      Provider<HabitsRepository> localRepositoryProvider,
      Provider<RemoteHabitRepository> remoteRepositoryProvider) {
    this.module = module;
    this.localRepositoryProvider = localRepositoryProvider;
    this.remoteRepositoryProvider = remoteRepositoryProvider;
  }

  @Override
  public RemoteSyncService get() {
    return provideRemoteSyncService(module, localRepositoryProvider.get(), remoteRepositoryProvider.get());
  }

  public static DataModule_ProvideRemoteSyncServiceFactory create(DataModule module,
      Provider<HabitsRepository> localRepositoryProvider,
      Provider<RemoteHabitRepository> remoteRepositoryProvider) {
    return new DataModule_ProvideRemoteSyncServiceFactory(module, localRepositoryProvider, remoteRepositoryProvider);
  }

  public static RemoteSyncService provideRemoteSyncService(DataModule instance,
      HabitsRepository localRepository, RemoteHabitRepository remoteRepository) {
    return Preconditions.checkNotNull(instance.provideRemoteSyncService(localRepository, remoteRepository), "Cannot return null from a non-@Nullable @Provides method");
  }
}
