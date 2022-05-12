package com.example.data.remote.habits

import com.example.data.remote.habits.models.HabitDone
import com.example.data.remote.habits.models.HabitUid
import com.example.domain.models.Habit
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.*

interface RemoteHabitService {
    companion object {
        private const val SERVER_TOKEN = "ebf519d1-85e0-4509-9c10-b135bae8b147"
    }

    @GET("habit")
    @Headers("accept: application/json", "Authorization: $SERVER_TOKEN")
    fun getHabits() : Call<List<Habit>>

    @PUT("habit")
    @Headers("Authorization: $SERVER_TOKEN")
    fun postHabit(@Body habit: Habit) : Call<HabitUid>

    @HTTP(method = "DELETE",path = "habit", hasBody = true)
    @Headers("Authorization: $SERVER_TOKEN")
    fun deleteHabit(@Body habitUid: HabitUid) : Call<ResponseBody>

    @POST("habit_done")
    @Headers("Authorization: $SERVER_TOKEN")
    fun completeHabit(@Body habitDone: HabitDone) : Call<ResponseBody>
}