package com.example.appproject.remote.habit.service

import com.example.appproject.Habit
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.HTTP
import retrofit2.http.Headers
import retrofit2.http.PUT

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
}
