package com.example.data.database;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0011H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J\u0019\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0011H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J\u0011\u0010\u001b\u001a\u00020\u0019H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cJ\u001b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020\u0015H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010 J\u0006\u0010!\u001a\u00020\"J\u0016\u0010#\u001a\u00020\u00192\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002J\u0019\u0010%\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u0011H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u000b0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006&"}, d2 = {"Lcom/example/data/database/HabitsRepository;", "", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "habitDatabase", "Lcom/example/data/database/HabitDatabase;", "habitConverter", "Lcom/example/data/database/HabitConverter;", "(Landroidx/lifecycle/LifecycleOwner;Lcom/example/data/database/HabitDatabase;Lcom/example/data/database/HabitConverter;)V", "dbHabitsLiveData", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/data/database/entities/DbHabit;", "getHabitConverter", "()Lcom/example/data/database/HabitConverter;", "habits", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/domain/models/Habit;", "getHabits", "()Landroidx/lifecycle/MutableLiveData;", "addHabit", "", "habit", "(Lcom/example/domain/models/Habit;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "changeHabit", "", "newHabit", "clearHabits", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHabitUidById", "", "id", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHabitsCount", "", "handleHabitsUpdateFromDb", "dbHabits", "removeHabit", "data_debug"})
public final class HabitsRepository {
    private final com.example.data.database.HabitDatabase habitDatabase = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.data.database.HabitConverter habitConverter = null;
    private final androidx.lifecycle.LiveData<java.util.List<com.example.data.database.entities.DbHabit>> dbHabitsLiveData = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.domain.models.Habit>> habits = null;
    
    public HabitsRepository(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.LifecycleOwner lifecycleOwner, @org.jetbrains.annotations.NotNull
    com.example.data.database.HabitDatabase habitDatabase, @org.jetbrains.annotations.NotNull
    com.example.data.database.HabitConverter habitConverter) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.data.database.HabitConverter getHabitConverter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.example.domain.models.Habit>> getHabits() {
        return null;
    }
    
    public final int getHabitsCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getHabitUidById(long id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object addHabit(@org.jetbrains.annotations.NotNull
    com.example.domain.models.Habit habit, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Long> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object removeHabit(@org.jetbrains.annotations.NotNull
    com.example.domain.models.Habit habit, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object changeHabit(@org.jetbrains.annotations.NotNull
    com.example.domain.models.Habit newHabit, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object clearHabits(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final void handleHabitsUpdateFromDb(java.util.List<com.example.data.database.entities.DbHabit> dbHabits) {
    }
}