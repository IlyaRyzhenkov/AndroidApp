// Generated by Dagger (https://dagger.dev).
package com.example.presentation;

import com.example.presentation.fragments.habitList.HabitListFragmentFactory;
import com.example.presentation.fragments.tab.HabitPagerAdapter;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class PresentationModule_ProvideHabitPagerAdapterFactory implements Factory<HabitPagerAdapter> {
  private final PresentationModule module;

  private final Provider<HabitListFragmentFactory> habitListFragmentFactoryProvider;

  public PresentationModule_ProvideHabitPagerAdapterFactory(PresentationModule module,
      Provider<HabitListFragmentFactory> habitListFragmentFactoryProvider) {
    this.module = module;
    this.habitListFragmentFactoryProvider = habitListFragmentFactoryProvider;
  }

  @Override
  public HabitPagerAdapter get() {
    return provideHabitPagerAdapter(module, habitListFragmentFactoryProvider.get());
  }

  public static PresentationModule_ProvideHabitPagerAdapterFactory create(PresentationModule module,
      Provider<HabitListFragmentFactory> habitListFragmentFactoryProvider) {
    return new PresentationModule_ProvideHabitPagerAdapterFactory(module, habitListFragmentFactoryProvider);
  }

  public static HabitPagerAdapter provideHabitPagerAdapter(PresentationModule instance,
      HabitListFragmentFactory habitListFragmentFactory) {
    return Preconditions.checkNotNull(instance.provideHabitPagerAdapter(habitListFragmentFactory), "Cannot return null from a non-@Nullable @Provides method");
  }
}
