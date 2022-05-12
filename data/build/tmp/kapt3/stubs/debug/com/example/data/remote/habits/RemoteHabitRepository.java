package com.example.data.remote.habits;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u0006H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J#\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ#\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J#\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J%\u0010\u0016\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0017\u001a\u00020\u00142\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001a"}, d2 = {"Lcom/example/data/remote/habits/RemoteHabitRepository;", "Lcom/example/domain/repositories/IRemoteHabitRepository;", "remoteHabitService", "Lcom/example/data/remote/habits/RemoteHabitService;", "(Lcom/example/data/remote/habits/RemoteHabitService;)V", "clearHabits", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "completeHabit", "habitDone", "Lcom/example/data/remote/habits/models/HabitDone;", "retries", "", "(Lcom/example/data/remote/habits/models/HabitDone;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteHabitFromRemote", "habitUid", "Lcom/example/data/remote/habits/models/HabitUid;", "(Lcom/example/data/remote/habits/models/HabitUid;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHabitsFromRemote", "", "Lcom/example/domain/models/Habit;", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "putHabitToRemote", "habit", "(Lcom/example/domain/models/Habit;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "data_debug"})
public final class RemoteHabitRepository implements com.example.domain.repositories.IRemoteHabitRepository {
    private final com.example.data.remote.habits.RemoteHabitService remoteHabitService = null;
    @org.jetbrains.annotations.NotNull
    public static final com.example.data.remote.habits.RemoteHabitRepository.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SERVER_BASE_URL = "https://droid-test-server.doubletapp.ru/api/";
    private static final long WAITING_TIME_ON_ERROR = 10000L;
    private static final int MAX_RETRIES_COUNT = 3;
    
    public RemoteHabitRepository(@org.jetbrains.annotations.NotNull
    com.example.data.remote.habits.RemoteHabitService remoteHabitService) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getHabitsFromRemote(int retries, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.example.domain.models.Habit>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object putHabitToRemote(@org.jetbrains.annotations.NotNull
    com.example.domain.models.Habit habit, int retries, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.data.remote.habits.models.HabitUid> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object deleteHabitFromRemote(@org.jetbrains.annotations.NotNull
    com.example.data.remote.habits.models.HabitUid habitUid, int retries, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object clearHabits(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object completeHabit(@org.jetbrains.annotations.NotNull
    com.example.data.remote.habits.models.HabitDone habitDone, int retries, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/example/data/remote/habits/RemoteHabitRepository$Companion;", "", "()V", "MAX_RETRIES_COUNT", "", "SERVER_BASE_URL", "", "WAITING_TIME_ON_ERROR", "", "data_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}