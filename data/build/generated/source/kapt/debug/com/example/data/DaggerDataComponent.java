package com.example.data;

import com.example.data.database.DatabaseMigrations;
import com.example.data.database.HabitConverter;
import com.example.data.database.HabitDatabase;
import com.example.data.database.HabitsRepository;
import com.example.data.remote.habits.RemoteHabitRepository;
import com.example.data.remote.habits.RemoteHabitService;
import com.example.data.remote.habits.RemoteSyncService;
import com.google.gson.Gson;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerDataComponent implements DataComponent {
  private Provider<DatabaseMigrations> provideDatabaseMigrationsProvider;

  private Provider<HabitDatabase> provideHabitDatabaseProvider;

  private Provider<HabitConverter> provideHabitConverterProvider;

  private Provider<HabitsRepository> provideHabitsRepositoryProvider;

  private Provider<Gson> provideGsonProvider;

  private Provider<Retrofit> provideRetrofitProvider;

  private Provider<RemoteHabitService> provideRemoteHabitServiceProvider;

  private Provider<RemoteHabitRepository> provideRemoteHabitRepositoryProvider;

  private Provider<SyncHabitRepository> provideSyncHabitRepositoryProvider;

  private Provider<RemoteSyncService> provideRemoteSyncServiceProvider;

  private DaggerDataComponent(DataModule dataModuleParam) {

    initialize(dataModuleParam);
  }

  public static Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final DataModule dataModuleParam) {
    this.provideDatabaseMigrationsProvider = DoubleCheck.provider(DataModule_ProvideDatabaseMigrationsFactory.create(dataModuleParam));
    this.provideHabitDatabaseProvider = DoubleCheck.provider(DataModule_ProvideHabitDatabaseFactory.create(dataModuleParam, provideDatabaseMigrationsProvider));
    this.provideHabitConverterProvider = DoubleCheck.provider(DataModule_ProvideHabitConverterFactory.create(dataModuleParam));
    this.provideHabitsRepositoryProvider = DoubleCheck.provider(DataModule_ProvideHabitsRepositoryFactory.create(dataModuleParam, provideHabitDatabaseProvider, provideHabitConverterProvider));
    this.provideGsonProvider = DoubleCheck.provider(DataModule_ProvideGsonFactory.create(dataModuleParam));
    this.provideRetrofitProvider = DoubleCheck.provider(DataModule_ProvideRetrofitFactory.create(dataModuleParam, provideGsonProvider));
    this.provideRemoteHabitServiceProvider = DoubleCheck.provider(DataModule_ProvideRemoteHabitServiceFactory.create(dataModuleParam, provideRetrofitProvider));
    this.provideRemoteHabitRepositoryProvider = DoubleCheck.provider(DataModule_ProvideRemoteHabitRepositoryFactory.create(dataModuleParam, provideRemoteHabitServiceProvider));
    this.provideSyncHabitRepositoryProvider = DoubleCheck.provider(DataModule_ProvideSyncHabitRepositoryFactory.create(dataModuleParam, provideHabitsRepositoryProvider, provideRemoteHabitRepositoryProvider));
    this.provideRemoteSyncServiceProvider = DoubleCheck.provider(DataModule_ProvideRemoteSyncServiceFactory.create(dataModuleParam, provideHabitsRepositoryProvider, provideRemoteHabitRepositoryProvider));
  }

  @Override
  public SyncHabitRepository getSyncHabitRepository() {
    return provideSyncHabitRepositoryProvider.get();
  }

  @Override
  public RemoteSyncService getRemoteSyncService() {
    return provideRemoteSyncServiceProvider.get();
  }

  @Override
  public HabitsRepository getHabitsRepository() {
    return provideHabitsRepositoryProvider.get();
  }

  @Override
  public RemoteHabitRepository getRemoteHabitsRepository() {
    return provideRemoteHabitRepositoryProvider.get();
  }

  public static final class Builder {
    private DataModule dataModule;

    private Builder() {
    }

    public Builder dataModule(DataModule dataModule) {
      this.dataModule = Preconditions.checkNotNull(dataModule);
      return this;
    }

    public DataComponent build() {
      Preconditions.checkBuilderRequirement(dataModule, DataModule.class);
      return new DaggerDataComponent(dataModule);
    }
  }
}
