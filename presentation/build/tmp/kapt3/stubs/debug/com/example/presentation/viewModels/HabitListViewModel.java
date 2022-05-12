package com.example.presentation.viewModels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u001c\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002J\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0007J\u0016\u0010!\u001a\u00020\u001f2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b\u00a8\u0006#"}, d2 = {"Lcom/example/presentation/viewModels/HabitListViewModel;", "Landroidx/lifecycle/ViewModel;", "habitsRepository", "Lcom/example/data/database/HabitsRepository;", "filterByType", "Lcom/example/domain/models/HabitType;", "filterByName", "", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "(Lcom/example/data/database/HabitsRepository;Lcom/example/domain/models/HabitType;Ljava/lang/String;Landroidx/lifecycle/LifecycleOwner;Lkotlin/coroutines/CoroutineContext;)V", "habitsFlow", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/domain/models/Habit;", "getHabitsFlow", "()Landroidx/lifecycle/LiveData;", "habitsList", "Landroidx/lifecycle/MutableLiveData;", "getHabitsList", "()Landroidx/lifecycle/MutableLiveData;", "lastHabitsList", "getLastHabitsList", "()Ljava/util/List;", "setLastHabitsList", "(Ljava/util/List;)V", "filterHabits", "habitsToFilter", "setNameFilter", "", "nameFilter", "updateHabitsList", "habits", "presentation_debug"})
public final class HabitListViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.data.database.HabitsRepository habitsRepository = null;
    private final com.example.domain.models.HabitType filterByType = null;
    private java.lang.String filterByName;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.util.List<com.example.domain.models.Habit>> habitsFlow = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.domain.models.Habit>> habitsList = null;
    @org.jetbrains.annotations.NotNull
    private java.util.List<com.example.domain.models.Habit> lastHabitsList;
    
    public HabitListViewModel(@org.jetbrains.annotations.NotNull
    com.example.data.database.HabitsRepository habitsRepository, @org.jetbrains.annotations.NotNull
    com.example.domain.models.HabitType filterByType, @org.jetbrains.annotations.NotNull
    java.lang.String filterByName, @org.jetbrains.annotations.NotNull
    androidx.lifecycle.LifecycleOwner lifecycleOwner, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.CoroutineContext coroutineContext) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.example.domain.models.Habit>> getHabitsFlow() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.example.domain.models.Habit>> getHabitsList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.domain.models.Habit> getLastHabitsList() {
        return null;
    }
    
    public final void setLastHabitsList(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.domain.models.Habit> p0) {
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