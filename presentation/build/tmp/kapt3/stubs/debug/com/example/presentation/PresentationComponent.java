package com.example.presentation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/example/presentation/PresentationComponent;", "", "getAppInfoFragment", "Lcom/example/presentation/fragments/AppInfoFragment;", "getHabitsEditorFragment", "Lcom/example/presentation/fragments/habitEditor/HabitsEditorFragment;", "getTabFragment", "Lcom/example/presentation/fragments/tab/TabFragment;", "presentation_debug"})
@dagger.Component(modules = {com.example.presentation.PresentationModule.class, com.example.domain.DomainModule.class})
@javax.inject.Singleton
public abstract interface PresentationComponent {
    
    @org.jetbrains.annotations.NotNull
    public abstract com.example.presentation.fragments.habitEditor.HabitsEditorFragment getHabitsEditorFragment();
    
    @org.jetbrains.annotations.NotNull
    public abstract com.example.presentation.fragments.tab.TabFragment getTabFragment();
    
    @org.jetbrains.annotations.NotNull
    public abstract com.example.presentation.fragments.AppInfoFragment getAppInfoFragment();
}