package com.example.domain;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/domain/OperationsComponent;", "", "getGlobalOperationFactory", "Lcom/example/domain/operations/global/GlobalOperationFactory;", "getHabitOperationFactory", "Lcom/example/domain/operations/habit/HabitOperationFactory;", "domain_debug"})
@javax.inject.Singleton
@dagger.Component(modules = {com.example.domain.DomainModule.class})
public abstract interface OperationsComponent {
    
    @org.jetbrains.annotations.NotNull
    public abstract com.example.domain.operations.habit.HabitOperationFactory getHabitOperationFactory();
    
    @org.jetbrains.annotations.NotNull
    public abstract com.example.domain.operations.global.GlobalOperationFactory getGlobalOperationFactory();
}