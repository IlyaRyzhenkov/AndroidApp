package com.example.data;

import com.example.data.database.DatabaseMigrations;
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
public final class DataModule_ProvideDatabaseMigrationsFactory implements Factory<DatabaseMigrations> {
  private final DataModule module;

  public DataModule_ProvideDatabaseMigrationsFactory(DataModule module) {
    this.module = module;
  }

  @Override
  public DatabaseMigrations get() {
    return provideDatabaseMigrations(module);
  }

  public static DataModule_ProvideDatabaseMigrationsFactory create(DataModule module) {
    return new DataModule_ProvideDatabaseMigrationsFactory(module);
  }

  public static DatabaseMigrations provideDatabaseMigrations(DataModule instance) {
    return Preconditions.checkNotNull(instance.provideDatabaseMigrations(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
