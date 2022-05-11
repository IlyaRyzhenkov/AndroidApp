package com.example.data;

import com.google.gson.Gson;
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
public final class DataModule_ProvideRetrofitFactory implements Factory<Retrofit> {
  private final DataModule module;

  private final Provider<Gson> gsonProvider;

  public DataModule_ProvideRetrofitFactory(DataModule module, Provider<Gson> gsonProvider) {
    this.module = module;
    this.gsonProvider = gsonProvider;
  }

  @Override
  public Retrofit get() {
    return provideRetrofit(module, gsonProvider.get());
  }

  public static DataModule_ProvideRetrofitFactory create(DataModule module,
      Provider<Gson> gsonProvider) {
    return new DataModule_ProvideRetrofitFactory(module, gsonProvider);
  }

  public static Retrofit provideRetrofit(DataModule instance, Gson gson) {
    return Preconditions.checkNotNull(instance.provideRetrofit(gson), "Cannot return null from a non-@Nullable @Provides method");
  }
}
