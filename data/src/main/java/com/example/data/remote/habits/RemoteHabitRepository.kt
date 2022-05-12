package com.example.data.remote.habits

import com.example.data.remote.habits.models.HabitDone
import com.example.data.remote.habits.models.HabitUid
import com.example.domain.models.Habit
import com.example.domain.repositories.IRemoteHabitRepository
import kotlinx.coroutines.delay

class RemoteHabitRepository(private val remoteHabitService: RemoteHabitService): IRemoteHabitRepository {
    companion object {
        const val SERVER_BASE_URL = "https://droid-test-server.doubletapp.ru/api/"
        private const val WAITING_TIME_ON_ERROR : Long = 10000
        private const val MAX_RETRIES_COUNT = 3
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

    override suspend fun clearHabits() {
        val habits = getHabitsFromRemote()
        if (habits != null) {
            for (habit in habits) {
                deleteHabitFromRemote(HabitUid(habit.uid!!))
            }
        }
    }

    suspend fun completeHabit(habitDone: HabitDone, retries: Int = 0) {
        val call = remoteHabitService.completeHabit(habitDone)
        val response = call.execute()
        if (!response.isSuccessful && retries < MAX_RETRIES_COUNT) {
            delay(WAITING_TIME_ON_ERROR)
            completeHabit(habitDone, retries + 1)
        }
    }
}
