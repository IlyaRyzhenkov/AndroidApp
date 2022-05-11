package com.example.data

import android.content.Context
import androidx.lifecycle.LifecycleOwner
import androidx.room.Room
import com.example.data.database.DatabaseMigrations
import com.example.data.database.HabitConverter
import com.example.data.database.HabitDatabase
import com.example.data.database.HabitsRepository
import com.example.data.remote.habits.RemoteHabitRepository
import com.example.data.remote.habits.RemoteHabitService
import com.example.data.remote.habits.RemoteSyncService
import com.example.data.remote.habits.models.HabitUid
import com.example.domain.models.Habit
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import dagger.Component
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class DataModule(private val context: Context, private val lifecycleOwner: LifecycleOwner) {
    @Provides
    @Singleton
    fun provideRemoteSyncService(localRepository: HabitsRepository, remoteRepository: RemoteHabitRepository): RemoteSyncService {
        return RemoteSyncService(localRepository, remoteRepository)
    }

    @Provides
    @Singleton
    fun provideSyncHabitRepository(localRepository: HabitsRepository, remoteRepository: RemoteHabitRepository): SyncHabitRepository {
        return SyncHabitRepository(localRepository, remoteRepository)
    }


    @Provides
    @Singleton
    fun provideHabitsRepository(habitDatabase: HabitDatabase, habitConverter: HabitConverter): HabitsRepository {
        return HabitsRepository(lifecycleOwner, habitDatabase, habitConverter)
    }

    @Provides
    @Singleton
    fun provideHabitDatabase(databaseMigrations: DatabaseMigrations): HabitDatabase {
        return Room.databaseBuilder(context, HabitDatabase::class.java, "habitDatabase")
            .addMigrations(databaseMigrations.MIGRATION_1_2, databaseMigrations.MIGRATION_2_3)
            .build()
    }

    @Provides
    @Singleton
    fun provideDatabaseMigrations(): DatabaseMigrations {
        return DatabaseMigrations()
    }

    @Provides
    @Singleton
    fun provideHabitConverter(): HabitConverter {
        return HabitConverter()
    }

    @Provides
    @Singleton
    fun provideRemoteHabitRepository(remoteHabitService: RemoteHabitService): RemoteHabitRepository {
        return RemoteHabitRepository(remoteHabitService)
    }

    @Provides
    @Singleton
    fun provideRemoteHabitService(retrofit: Retrofit): RemoteHabitService {
        return retrofit.create(RemoteHabitService::class.java)
    }

    @Provides
    @Singleton
    fun provideRetrofit(gson: Gson): Retrofit {
        val interceptor = HttpLoggingInterceptor()
        interceptor.level = HttpLoggingInterceptor.Level.BODY
        val client = OkHttpClient.Builder()
        client.addInterceptor(interceptor)
        return Retrofit.Builder()
            .baseUrl(RemoteHabitRepository.SERVER_BASE_URL)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .client(client.build())
            .build()
    }

    @Provides
    @Singleton
    fun provideGson(): Gson {
        return GsonBuilder()
            .registerTypeAdapter(Habit::class.java, Habit.HabitJsonSerializer())
            .registerTypeAdapter(Habit::class.java, Habit.HabitJsonDeserializer())
            .registerTypeAdapter(HabitUid::class.java, HabitUid.HabitUidJsonSerializer())
            .registerTypeAdapter(HabitUid::class.java, HabitUid.HabitUidJsonDeserializer())
            .create()
    }
}

@Component(modules = [DataModule::class])
@Singleton
interface DataComponent {
    fun getSyncHabitRepository(): SyncHabitRepository

    fun getRemoteSyncService(): RemoteSyncService

    fun getHabitsRepository(): HabitsRepository
}