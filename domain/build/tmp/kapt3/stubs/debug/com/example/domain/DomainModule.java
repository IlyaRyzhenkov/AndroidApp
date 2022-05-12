package com.example.domain;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\u000eH\u0007J\b\u0010\u000f\u001a\u00020\u0010H\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/example/domain/DomainModule;", "", "habitsRepository", "Lcom/example/domain/repositories/IHabitsRepository;", "remoteHabitRepository", "Lcom/example/domain/repositories/IRemoteHabitRepository;", "syncHabitRepository", "Lcom/example/domain/repositories/ISyncHabitRepository;", "syncHabitService", "Lcom/example/domain/repositories/ISyncHabitService;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "(Lcom/example/domain/repositories/IHabitsRepository;Lcom/example/domain/repositories/IRemoteHabitRepository;Lcom/example/domain/repositories/ISyncHabitRepository;Lcom/example/domain/repositories/ISyncHabitService;Lkotlinx/coroutines/CoroutineScope;)V", "provideGlobalOperationFactory", "Lcom/example/domain/operations/global/GlobalOperationFactory;", "provideOperationFactory", "Lcom/example/domain/operations/habit/HabitOperationFactory;", "domain_debug"})
@dagger.Module
public final class DomainModule {
    private final com.example.domain.repositories.IHabitsRepository habitsRepository = null;
    private final com.example.domain.repositories.IRemoteHabitRepository remoteHabitRepository = null;
    private final com.example.domain.repositories.ISyncHabitRepository syncHabitRepository = null;
    private final com.example.domain.repositories.ISyncHabitService syncHabitService = null;
    private final kotlinx.coroutines.CoroutineScope coroutineScope = null;
    
    public DomainModule(@org.jetbrains.annotations.NotNull
    com.example.domain.repositories.IHabitsRepository habitsRepository, @org.jetbrains.annotations.NotNull
    com.example.domain.repositories.IRemoteHabitRepository remoteHabitRepository, @org.jetbrains.annotations.NotNull
    com.example.domain.repositories.ISyncHabitRepository syncHabitRepository, @org.jetbrains.annotations.NotNull
    com.example.domain.repositories.ISyncHabitService syncHabitService, @org.jetbrains.annotations.NotNull
    kotlinx.coroutines.CoroutineScope coroutineScope) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.example.domain.operations.habit.HabitOperationFactory provideOperationFactory() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.example.domain.operations.global.GlobalOperationFactory provideGlobalOperationFactory() {
        return null;
    }
}