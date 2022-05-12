package com.example.domain.utils

object DateUtils {
    private const val SECONDS_IN_DAY = 60 * 60 * 24

    fun getFromDate(dateNow: Long, habitPeriodInDays: Int): Long {
        val date = dateNow - (habitPeriodInDays * SECONDS_IN_DAY)
        return if (date > 0)
            date
        else
            0
    }
}