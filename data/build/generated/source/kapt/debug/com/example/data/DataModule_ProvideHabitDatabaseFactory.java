package com.example.data;

import com.example.data.database.DatabaseMigrations;
import com.example.data.database.HabitDatabase;
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
public final class DataModule_ProvideHabitDatabaseFactory implements Factory<HabitDatabase> {
  private final DataModule module;

  private final Provider<DatabaseMigrations> databaseMigrationsProvider;

  public DataModule_ProvideHabitDatabaseFactory(DataModule module,
      Provider<DatabaseMigrations> databaseMigrationsProvider) {
    this.module = module;
    this.databaseMigrationsProvider = databaseMigrationsProvider;
  }

  @Override
  public HabitDatabase get() {
    return provideHabitDatabase(module, databaseMigrationsProvider.get());
  }

  public static DataModule_ProvideHabitDatabaseFactory create(DataModule module,
      Provider<DatabaseMigrations> databaseMigrationsProvider) {
    return new DataModule_ProvideHabitDatabaseFactory(module, databaseMigrationsProvider);
  }

  public static HabitDatabase provideHabitDatabase(DataModule instance,
      DatabaseMigrations databaseMigrations) {
    return Preconditions.checkNotNull(instance.provideHabitDatabase(databaseMigrations), "Cannot return null from a non-@Nullable @Provides method");
  }
}
