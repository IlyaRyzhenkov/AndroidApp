package com.example.presentation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0007J\b\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\fH\u0007J\b\u0010\u0010\u001a\u00020\u0011H\u0007J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000eH\u0007J\b\u0010\u0015\u001a\u00020\u0016H\u0007R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/example/presentation/PresentationModule;", "", "habitOperationFactory", "Lcom/example/domain/operations/habit/HabitOperationFactory;", "habitsRepository", "Lcom/example/data/database/HabitsRepository;", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "(Lcom/example/domain/operations/habit/HabitOperationFactory;Lcom/example/data/database/HabitsRepository;Landroidx/appcompat/app/AppCompatActivity;)V", "provideAppInfoFragment", "Lcom/example/presentation/fragments/AppInfoFragment;", "provideHabitListFragmentFactory", "Lcom/example/presentation/fragments/habitList/HabitListFragmentFactory;", "provideHabitPagerAdapter", "Lcom/example/presentation/fragments/tab/HabitPagerAdapter;", "habitListFragmentFactory", "provideHabitsEditorFragment", "Lcom/example/presentation/fragments/habitEditor/HabitsEditorFragment;", "provideTabFragment", "Lcom/example/presentation/fragments/tab/TabFragment;", "habitPagerAdapter", "provideToastService", "Lcom/example/presentation/service/ToastService;", "presentation_debug"})
@dagger.Module
public final class PresentationModule {
    private final com.example.domain.operations.habit.HabitOperationFactory habitOperationFactory = null;
    private final com.example.data.database.HabitsRepository habitsRepository = null;
    private final androidx.appcompat.app.AppCompatActivity activity = null;
    
    public PresentationModule(@org.jetbrains.annotations.NotNull
    com.example.domain.operations.habit.HabitOperationFactory habitOperationFactory, @org.jetbrains.annotations.NotNull
    com.example.data.database.HabitsRepository habitsRepository, @org.jetbrains.annotations.NotNull
    androidx.appcompat.app.AppCompatActivity activity) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.example.presentation.fragments.habitEditor.HabitsEditorFragment provideHabitsEditorFragment() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.example.presentation.fragments.tab.TabFragment provideTabFragment(@org.jetbrains.annotations.NotNull
    com.example.presentation.fragments.tab.HabitPagerAdapter habitPagerAdapter) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.example.presentation.fragments.AppInfoFragment provideAppInfoFragment() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.example.presentation.fragments.habitList.HabitListFragmentFactory provideHabitListFragmentFactory() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.example.presentation.fragments.tab.HabitPagerAdapter provideHabitPagerAdapter(@org.jetbrains.annotations.NotNull
    com.example.presentation.fragments.habitList.HabitListFragmentFactory habitListFragmentFactory) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.example.presentation.service.ToastService provideToastService() {
        return null;
    }
}