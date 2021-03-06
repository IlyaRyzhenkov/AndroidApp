// Generated by Dagger (https://dagger.dev).
package com.example.presentation;

import com.example.presentation.fragments.habitEditor.HabitsEditorFragment;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class PresentationModule_ProvideHabitsEditorFragmentFactory implements Factory<HabitsEditorFragment> {
  private final PresentationModule module;

  public PresentationModule_ProvideHabitsEditorFragmentFactory(PresentationModule module) {
    this.module = module;
  }

  @Override
  public HabitsEditorFragment get() {
    return provideHabitsEditorFragment(module);
  }

  public static PresentationModule_ProvideHabitsEditorFragmentFactory create(
      PresentationModule module) {
    return new PresentationModule_ProvideHabitsEditorFragmentFactory(module);
  }

  public static HabitsEditorFragment provideHabitsEditorFragment(PresentationModule instance) {
    return Preconditions.checkNotNull(instance.provideHabitsEditorFragment(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
