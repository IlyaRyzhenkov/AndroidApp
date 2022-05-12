package com.example.presentation.viewModels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u000fH\u0002J\u0012\u0010\u0012\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002J\b\u0010\u0013\u001a\u00020\rH\u0014J \u0010\u0014\u001a\u00020\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0017R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/example/presentation/viewModels/HabitEditorViewModel;", "Landroidx/lifecycle/ViewModel;", "Lkotlinx/coroutines/CoroutineScope;", "habitOperationFactory", "Lcom/example/domain/operations/habit/HabitOperationFactory;", "(Lcom/example/domain/operations/habit/HabitOperationFactory;)V", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "job", "Lkotlinx/coroutines/CompletableJob;", "addHabit", "", "habit", "Lcom/example/domain/models/Habit;", "changeHabit", "newHabit", "deleteHabit", "onCleared", "onCreateButtonClick", "oldHabit", "mode", "Lcom/example/presentation/viewModels/CreateButtonClickMode;", "presentation_debug"})
public final class HabitEditorViewModel extends androidx.lifecycle.ViewModel implements kotlinx.coroutines.CoroutineScope {
    private final com.example.domain.operations.habit.HabitOperationFactory habitOperationFactory = null;
    private final kotlinx.coroutines.CompletableJob job = null;
    
    public HabitEditorViewModel(@org.jetbrains.annotations.NotNull
    com.example.domain.operations.habit.HabitOperationFactory habitOperationFactory) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlin.coroutines.CoroutineContext getCoroutineContext() {
        return null;
    }
    
    public final void onCreateButtonClick(@org.jetbrains.annotations.Nullable
    com.example.domain.models.Habit oldHabit, @org.jetbrains.annotations.NotNull
    com.example.domain.models.Habit newHabit, @org.jetbrains.annotations.NotNull
    com.example.presentation.viewModels.CreateButtonClickMode mode) {
    }
    
    private final void addHabit(com.example.domain.models.Habit habit) {
    }
    
    private final void deleteHabit(com.example.domain.models.Habit habit) {
    }
    
    private final void changeHabit(com.example.domain.models.Habit newHabit) {
    }
    
    @java.lang.Override
    protected void onCleared() {
    }
}