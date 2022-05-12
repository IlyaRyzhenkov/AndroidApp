package com.example.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ!\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u0019\u0010\u0011\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0012\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00140\u0013J\u0019\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0017"}, d2 = {"Lcom/example/data/SyncHabitRepository;", "Lcom/example/domain/repositories/ISyncHabitRepository;", "localRepository", "Lcom/example/data/database/HabitsRepository;", "remoteRepository", "Lcom/example/data/remote/habits/RemoteHabitRepository;", "(Lcom/example/data/database/HabitsRepository;Lcom/example/data/remote/habits/RemoteHabitRepository;)V", "addHabit", "", "habit", "Lcom/example/domain/models/Habit;", "(Lcom/example/domain/models/Habit;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "completeHabit", "", "completionDate", "", "(Lcom/example/domain/models/Habit;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteHabit", "getHabits", "Landroidx/lifecycle/LiveData;", "", "updateHabit", "newHabit", "data_debug"})
public final class SyncHabitRepository implements com.example.domain.repositories.ISyncHabitRepository {
    private final com.example.data.database.HabitsRepository localRepository = null;
    private final com.example.data.remote.habits.RemoteHabitRepository remoteRepository = null;
    
    public SyncHabitRepository(@org.jetbrains.annotations.NotNull
    com.example.data.database.HabitsRepository localRepository, @org.jetbrains.annotations.NotNull
    com.example.data.remote.habits.RemoteHabitRepository remoteRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.example.domain.models.Habit>> getHabits() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object addHabit(@org.jetbrains.annotations.NotNull
    com.example.domain.models.Habit habit, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object updateHabit(@org.jetbrains.annotations.NotNull
    com.example.domain.models.Habit newHabit, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object deleteHabit(@org.jetbrains.annotations.NotNull
    com.example.domain.models.Habit habit, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object completeHabit(@org.jetbrains.annotations.NotNull
    com.example.domain.models.Habit habit, long completionDate, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Integer> continuation) {
        return null;
    }
}