package com.example.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0006H\u0007J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\nH\u0007J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0018H\u0007J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u0013H\u0007J\u0010\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\bH\u0007J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u0013H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/example/data/DataModule;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "provideDatabaseMigrations", "Lcom/example/data/database/DatabaseMigrations;", "provideGson", "Lcom/google/gson/Gson;", "provideHabitConverter", "Lcom/example/data/database/HabitConverter;", "provideHabitDatabase", "Lcom/example/data/database/HabitDatabase;", "databaseMigrations", "provideHabitsRepository", "Lcom/example/data/database/HabitsRepository;", "habitDatabase", "habitConverter", "provideRemoteHabitRepository", "Lcom/example/data/remote/habits/RemoteHabitRepository;", "remoteHabitService", "Lcom/example/data/remote/habits/RemoteHabitService;", "provideRemoteHabitService", "retrofit", "Lretrofit2/Retrofit;", "provideRemoteSyncService", "Lcom/example/data/remote/habits/RemoteSyncService;", "localRepository", "remoteRepository", "provideRetrofit", "gson", "provideSyncHabitRepository", "Lcom/example/data/SyncHabitRepository;", "data_debug"})
@dagger.Module
public final class DataModule {
    private final android.content.Context context = null;
    
    public DataModule(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.example.data.remote.habits.RemoteSyncService provideRemoteSyncService(@org.jetbrains.annotations.NotNull
    com.example.data.database.HabitsRepository localRepository, @org.jetbrains.annotations.NotNull
    com.example.data.remote.habits.RemoteHabitRepository remoteRepository) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.example.data.SyncHabitRepository provideSyncHabitRepository(@org.jetbrains.annotations.NotNull
    com.example.data.database.HabitsRepository localRepository, @org.jetbrains.annotations.NotNull
    com.example.data.remote.habits.RemoteHabitRepository remoteRepository) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.example.data.database.HabitsRepository provideHabitsRepository(@org.jetbrains.annotations.NotNull
    com.example.data.database.HabitDatabase habitDatabase, @org.jetbrains.annotations.NotNull
    com.example.data.database.HabitConverter habitConverter) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.example.data.database.HabitDatabase provideHabitDatabase(@org.jetbrains.annotations.NotNull
    com.example.data.database.DatabaseMigrations databaseMigrations) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.example.data.database.DatabaseMigrations provideDatabaseMigrations() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.example.data.database.HabitConverter provideHabitConverter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.example.data.remote.habits.RemoteHabitRepository provideRemoteHabitRepository(@org.jetbrains.annotations.NotNull
    com.example.data.remote.habits.RemoteHabitService remoteHabitService) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.example.data.remote.habits.RemoteHabitService provideRemoteHabitService(@org.jetbrains.annotations.NotNull
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final retrofit2.Retrofit provideRetrofit(@org.jetbrains.annotations.NotNull
    com.google.gson.Gson gson) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.google.gson.Gson provideGson() {
        return null;
    }
}