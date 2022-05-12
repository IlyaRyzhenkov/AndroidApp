package com.example.domain

import com.example.domain.operations.global.GlobalOperationFactory
import com.example.domain.operations.habit.HabitOperationFactory
import com.example.domain.repositories.IHabitsRepository
import com.example.domain.repositories.IRemoteHabitRepository
import com.example.domain.repositories.ISyncHabitRepository
import com.example.domain.repositories.ISyncHabitService
import dagger.Component
import dagger.Module
import dagger.Provides
import kotlinx.coroutines.CoroutineScope
import javax.inject.Singleton

@Module
class DomainModule(private val habitsRepository: IHabitsRepository,
                   private val remoteHabitRepository: IRemoteHabitRepository,
                   private val syncHabitRepository: ISyncHabitRepository,
                   private val syncHabitService: ISyncHabitService,
                   private val coroutineScope: CoroutineScope) {
    @Provides
    @Singleton
    fun provideOperationFactory(): HabitOperationFactory {
        return HabitOperationFactory(syncHabitRepository, coroutineScope)
    }

    @Provides
    @Singleton
    fun provideGlobalOperationFactory(): GlobalOperationFactory {
        return GlobalOperationFactory(habitsRepository, remoteHabitRepository, syncHabitService, coroutineScope)
    }
}

@Component(modules = [DomainModule::class])
@Singleton
interface OperationsComponent{
    fun getHabitOperationFactory(): HabitOperationFactory

    fun getGlobalOperationFactory(): GlobalOperationFactory
}