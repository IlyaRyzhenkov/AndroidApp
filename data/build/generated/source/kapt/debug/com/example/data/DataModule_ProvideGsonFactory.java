package com.example.data;

import com.google.gson.Gson;
import dagger.internal.Factory;
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
public final class DataModule_ProvideGsonFactory implements Factory<Gson> {
  private final DataModule module;

  public DataModule_ProvideGsonFactory(DataModule module) {
    this.module = module;
  }

  @Override
  public Gson get() {
    return provideGson(module);
  }

  public static DataModule_ProvideGsonFactory create(DataModule module) {
    return new DataModule_ProvideGsonFactory(module);
  }

  public static Gson provideGson(DataModule instance) {
    return Preconditions.checkNotNull(instance.provideGson(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
