package com.example.data;

import com.example.data.database.HabitConverter;
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
public final class DataModule_ProvideHabitConverterFactory implements Factory<HabitConverter> {
  private final DataModule module;

  public DataModule_ProvideHabitConverterFactory(DataModule module) {
    this.module = module;
  }

  @Override
  public HabitConverter get() {
    return provideHabitConverter(module);
  }

  public static DataModule_ProvideHabitConverterFactory create(DataModule module) {
    return new DataModule_ProvideHabitConverterFactory(module);
  }

  public static HabitConverter provideHabitConverter(DataModule instance) {
    return Preconditions.checkNotNull(instance.provideHabitConverter(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
