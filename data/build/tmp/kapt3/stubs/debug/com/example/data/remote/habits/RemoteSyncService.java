package com.example.data.remote.habits;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J-\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0011\u0010\u000e\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/example/data/remote/habits/RemoteSyncService;", "Lcom/example/domain/repositories/ISyncHabitService;", "localHabitRepository", "Lcom/example/data/database/HabitsRepository;", "remoteHabitRepository", "Lcom/example/data/remote/habits/RemoteHabitRepository;", "(Lcom/example/data/database/HabitsRepository;Lcom/example/data/remote/habits/RemoteHabitRepository;)V", "sync", "", "localHabits", "", "Lcom/example/domain/models/Habit;", "remoteHabits", "(Ljava/util/List;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "syncLocalAndRemote", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_debug"})
public final class RemoteSyncService implements com.example.domain.repositories.ISyncHabitService {
    private final com.example.data.database.HabitsRepository localHabitRepository = null;
    private final com.example.data.remote.habits.RemoteHabitRepository remoteHabitRepository = null;
    
    public RemoteSyncService(@org.jetbrains.annotations.NotNull
    com.example.data.database.HabitsRepository localHabitRepository, @org.jetbrains.annotations.NotNull
    com.example.data.remote.habits.RemoteHabitRepository remoteHabitRepository) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object syncLocalAndRemote(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Object sync(java.util.List<com.example.domain.models.Habit> localHabits, java.util.List<com.example.domain.models.Habit> remoteHabits, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}