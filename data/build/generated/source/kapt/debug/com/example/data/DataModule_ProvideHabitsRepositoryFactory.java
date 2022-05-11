package com.example.data;

import com.example.data.database.HabitConverter;
import com.example.data.database.HabitDatabase;
import com.example.data.database.HabitsRepository;
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
public final class DataModule_ProvideHabitsRepositoryFactory implements Factory<HabitsRepository> {
  private final DataModule module;

  private final Provider<HabitDatabase> habitDatabaseProvider;

  private final Provider<HabitConverter> habitConverterProvider;

  public DataModule_ProvideHabitsRepositoryFactory(DataModule module,
      Provider<HabitDatabase> habitDatabaseProvider,
      Provider<HabitConverter> habitConverterProvider) {
    this.module = module;
    this.habitDatabaseProvider = habitDatabaseProvider;
    this.habitConverterProvider = habitConverterProvider;
  }

  @Override
  public HabitsRepository get() {
    return provideHabitsRepository(module, habitDatabaseProvider.get(), habitConverterProvider.get());
  }

  public static DataModule_ProvideHabitsRepositoryFactory create(DataModule module,
      Provider<HabitDatabase> habitDatabaseProvider,
      Provider<HabitConverter> habitConverterProvider) {
    return new DataModule_ProvideHabitsRepositoryFactory(module, habitDatabaseProvider, habitConverterProvider);
  }

  public static HabitsRepository provideHabitsRepository(DataModule instance,
      HabitDatabase habitDatabase, HabitConverter habitConverter) {
    return Preconditions.checkNotNull(instance.provideHabitsRepository(habitDatabase, habitConverter), "Cannot return null from a non-@Nullable @Provides method");
  }
}
