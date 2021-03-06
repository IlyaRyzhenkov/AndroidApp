// Generated by Dagger (https://dagger.dev).
package com.example.presentation;

import com.example.presentation.fragments.habitList.HabitListFragmentFactory;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class PresentationModule_ProvideHabitListFragmentFactoryFactory implements Factory<HabitListFragmentFactory> {
  private final PresentationModule module;

  public PresentationModule_ProvideHabitListFragmentFactoryFactory(PresentationModule module) {
    this.module = module;
  }

  @Override
  public HabitListFragmentFactory get() {
    return provideHabitListFragmentFactory(module);
  }

  public static PresentationModule_ProvideHabitListFragmentFactoryFactory create(
      PresentationModule module) {
    return new PresentationModule_ProvideHabitListFragmentFactoryFactory(module);
  }

  public static HabitListFragmentFactory provideHabitListFragmentFactory(
      PresentationModule instance) {
    return Preconditions.checkNotNull(instance.provideHabitListFragmentFactory(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
