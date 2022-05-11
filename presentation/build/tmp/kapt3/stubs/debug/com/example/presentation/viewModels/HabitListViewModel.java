package com.example.presentation.viewModels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002J\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0007J\u0016\u0010\u0018\u001a\u00020\u00162\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/example/presentation/viewModels/HabitListViewModel;", "Landroidx/lifecycle/ViewModel;", "habitsRepository", "Lcom/example/data/database/HabitsRepository;", "filterByType", "Lcom/example/domain/models/HabitType;", "filterByName", "", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "(Lcom/example/data/database/HabitsRepository;Lcom/example/domain/models/HabitType;Ljava/lang/String;Landroidx/lifecycle/LifecycleOwner;)V", "habitsList", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/example/domain/models/Habit;", "getHabitsList", "()Landroidx/lifecycle/MutableLiveData;", "filterHabits", "habitsToFilter", "getHabitsCount", "", "setNameFilter", "", "nameFilter", "updateHabitsList", "habits", "presentation_debug"})
public final class HabitListViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.data.database.HabitsRepository habitsRepository = null;
    private final com.example.domain.models.HabitType filterByType = null;
    private java.lang.String filterByName;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.domain.models.Habit>> habitsList = null;
    
    public HabitListViewModel(@org.jetbrains.annotations.NotNull
    com.example.data.database.HabitsRepository habitsRepository, @org.jetbrains.annotations.NotNull
    com.example.domain.models.HabitType filterByType, @org.jetbrains.annotations.NotNull
    java.lang.String filterByName, @org.jetbrains.annotations.NotNull
    androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.example.domain.models.Habit>> getHabitsList() {
        return null;
    }
    
    public final int getHabitsCount() {
        return 0;
    }
    
    public final void setNameFilter(@org.jetbrains.annotations.NotNull
    java.lang.String nameFilter) {
    }
    
    private final void updateHabitsList(java.util.List<com.example.domain.models.Habit> habits) {
    }
    
    private final java.util.List<com.example.domain.models.Habit> filterHabits(java.util.List<com.example.domain.models.Habit> habitsToFilter) {
        return null;
    }
}