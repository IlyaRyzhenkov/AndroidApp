package com.example.data;

import com.example.data.remote.habits.RemoteHabitService;
import dagger.internal.Factory;
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
public final class DataModule_ProvideRemoteHabitServiceFactory implements Factory<RemoteHabitService> {
  private final DataModule module;

  private final Provider<Retrofit> retrofitProvider;

  public DataModule_ProvideRemoteHabitServiceFactory(DataModule module,
      Provider<Retrofit> retrofitProvider) {
    this.module = module;
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public RemoteHabitService get() {
    return provideRemoteHabitService(module, retrofitProvider.get());
  }

  public static DataModule_ProvideRemoteHabitServiceFactory create(DataModule module,
      Provider<Retrofit> retrofitProvider) {
    return new DataModule_ProvideRemoteHabitServiceFactory(module, retrofitProvider);
  }

  public static RemoteHabitService provideRemoteHabitService(DataModule instance,
      Retrofit retrofit) {
    return Preconditions.checkNotNull(instance.provideRemoteHabitService(retrofit), "Cannot return null from a non-@Nullable @Provides method");
  }
}
