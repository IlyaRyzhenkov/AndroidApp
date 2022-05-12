package com.example.data.database;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u0019\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u0011\u0010\u0014\u001a\u00020\u0012H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J!\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u000eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019J\u001b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u000eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001dJ\u0019\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001f"}, d2 = {"Lcom/example/data/database/HabitsRepository;", "Lcom/example/domain/repositories/IHabitsRepository;", "habitDatabase", "Lcom/example/data/database/HabitDatabase;", "habitConverter", "Lcom/example/data/database/HabitConverter;", "(Lcom/example/data/database/HabitDatabase;Lcom/example/data/database/HabitConverter;)V", "habitsFlow", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/example/domain/models/Habit;", "getHabitsFlow", "()Lkotlinx/coroutines/flow/Flow;", "addHabit", "", "habit", "(Lcom/example/domain/models/Habit;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "changeHabit", "", "newHabit", "clearHabits", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "completeHabit", "", "date", "(Lcom/example/domain/models/Habit;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHabitUidById", "", "id", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeHabit", "data_debug"})
public final class HabitsRepository implements com.example.domain.repositories.IHabitsRepository {
    private final com.example.data.database.HabitDatabase habitDatabase = null;
    private final com.example.data.database.HabitConverter habitConverter = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<java.util.List<com.example.domain.models.Habit>> habitsFlow = null;
    
    public HabitsRepository(@org.jetbrains.annotations.NotNull
    com.example.data.database.HabitDatabase habitDatabase, @org.jetbrains.annotations.NotNull
    com.example.data.database.HabitConverter habitConverter) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.example.domain.models.Habit>> getHabitsFlow() {
        return null;
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
    public final java.lang.Object completeHabit(@org.jetbrains.annotations.NotNull
    com.example.domain.models.Habit habit, long date, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Integer> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object clearHabits(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}