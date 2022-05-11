package com.example.domain;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0007R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/example/domain/DomainModule;", "", "syncHabitRepository", "Lcom/example/domain/repositories/ISyncHabitRepository;", "syncHabitService", "Lcom/example/domain/repositories/ISyncHabitService;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "(Lcom/example/domain/repositories/ISyncHabitRepository;Lcom/example/domain/repositories/ISyncHabitService;Lkotlinx/coroutines/CoroutineScope;)V", "provideOperationFactory", "Lcom/example/domain/operations/OperationFactory;", "domain_debug"})
@dagger.Module
public final class DomainModule {
    private final com.example.domain.repositories.ISyncHabitRepository syncHabitRepository = null;
    private final com.example.domain.repositories.ISyncHabitService syncHabitService = null;
    private final kotlinx.coroutines.CoroutineScope coroutineScope = null;
    
    public DomainModule(@org.jetbrains.annotations.NotNull
    com.example.domain.repositories.ISyncHabitRepository syncHabitRepository, @org.jetbrains.annotations.NotNull
    com.example.domain.repositories.ISyncHabitService syncHabitService, @org.jetbrains.annotations.NotNull
    kotlinx.coroutines.CoroutineScope coroutineScope) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final com.example.domain.operations.OperationFactory provideOperationFactory() {
        return null;
    }
}