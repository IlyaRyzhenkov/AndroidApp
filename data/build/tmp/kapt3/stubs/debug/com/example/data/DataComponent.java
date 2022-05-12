package com.example.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&\u00a8\u0006\n"}, d2 = {"Lcom/example/data/DataComponent;", "", "getHabitsRepository", "Lcom/example/data/database/HabitsRepository;", "getRemoteHabitsRepository", "Lcom/example/data/remote/habits/RemoteHabitRepository;", "getRemoteSyncService", "Lcom/example/data/remote/habits/RemoteSyncService;", "getSyncHabitRepository", "Lcom/example/data/SyncHabitRepository;", "data_debug"})
@javax.inject.Singleton
@dagger.Component(modules = {com.example.data.DataModule.class})
public abstract interface DataComponent {
    
    @org.jetbrains.annotations.NotNull
    public abstract com.example.data.SyncHabitRepository getSyncHabitRepository();
    
    @org.jetbrains.annotations.NotNull
    public abstract com.example.data.remote.habits.RemoteSyncService getRemoteSyncService();
    
    @org.jetbrains.annotations.NotNull
    public abstract com.example.data.database.HabitsRepository getHabitsRepository();
    
    @org.jetbrains.annotations.NotNull
    public abstract com.example.data.remote.habits.RemoteHabitRepository getRemoteHabitsRepository();
}