package com.example.domain

import com.example.domain.operations.OperationFactory
import com.example.domain.repositories.ISyncHabitRepository
import com.example.domain.repositories.ISyncHabitService
import dagger.Component
import dagger.Module
import dagger.Provides
import kotlinx.coroutines.CoroutineScope

@Module
class DomainModule(private val syncHabitRepository: ISyncHabitRepository,
                   private val syncHabitService: ISyncHabitService,
                   private val coroutineScope: CoroutineScope) {
    @Provides
    fun provideOperationFactory(): OperationFactory {
        return OperationFactory(syncHabitRepository, syncHabitService, coroutineScope)
    }
}

@Component(modules = [DomainModule::class])
interface OperationsComponent{
    fun getOperationFactory(): OperationFactory
}