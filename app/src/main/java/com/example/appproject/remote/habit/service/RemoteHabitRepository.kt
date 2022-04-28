package com.example.appproject.remote.habit.service

import com.example.appproject.Habit
import com.google.gson.GsonBuilder
import kotlinx.coroutines.delay
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RemoteHabitRepository {
    private const val SERVER_BASE_URL = "https://droid-test-server.doubletapp.ru/api/"
    private const val WAITING_TIME_ON_ERROR : Long = 10000
    private const val MAX_RETRIES_COUNT = 3

    private var retrofit: Retrofit
    private var remoteHabitService: RemoteHabitService

    init {
        val interceptor = HttpLoggingInterceptor()
        interceptor.level = HttpLoggingInterceptor.Level.BODY
        val client = OkHttpClient.Builder()
        client.addInterceptor(interceptor)

        val gson = GsonBuilder()
            .registerTypeAdapter(Habit::class.java, Habit.HabitJsonSerializer())
            .registerTypeAdapter(Habit::class.java, Habit.HabitJsonDeserializer())
            .registerTypeAdapter(HabitUid::class.java, HabitUid.HabitUidJsonSerializer())
            .registerTypeAdapter(HabitUid::class.java, HabitUid.HabitUidJsonDeserializer())
            .create()

        retrofit = Retrofit.Builder()
            .baseUrl(SERVER_BASE_URL)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .client(client.build())
            .build()
        remoteHabitService = retrofit.create(RemoteHabitService::class.java)
    }

    suspend fun getHabitsFromRemote(retries: Int = 0) : List<Habit>? {
        val call = remoteHabitService.getHabits()
        val response = call.execute()
        return if (response.isSuccessful) {
            response.body()
        } else {
            if (retries < MAX_RETRIES_COUNT) {
                delay(WAITING_TIME_ON_ERROR)
                getHabitsFromRemote(retries + 1)
            } else {
                null
            }
        }
    }

    suspend fun putHabitToRemote(habit: Habit, retries: Int = 0) : HabitUid? {
        val call = remoteHabitService.postHabit(habit)
        val response = call.execute()
        return if (response.isSuccessful) {
            response.body()
        } else {
            if (retries < MAX_RETRIES_COUNT) {
                delay(WAITING_TIME_ON_ERROR)
                putHabitToRemote(habit, retries + 1)
            } else {
                null
            }
        }
    }

    suspend fun deleteHabitFromRemote(habitUid: HabitUid, retries: Int = 0) {
        val call = remoteHabitService.deleteHabit(habitUid)
        val response = call.execute()
        if (!response.isSuccessful && retries < MAX_RETRIES_COUNT) {
            delay(WAITING_TIME_ON_ERROR)
            deleteHabitFromRemote(habitUid, retries + 1)
        }
    }

    suspend fun clearHabits() {
        val habits = getHabitsFromRemote()
        if (habits != null) {
            for (habit in habits) {
                deleteHabitFromRemote(HabitUid(habit.uid!!))
            }
        }
    }
}
