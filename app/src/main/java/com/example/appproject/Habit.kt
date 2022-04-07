package com.example.appproject

import android.os.Bundle
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

enum class HabitType(val repr: String, val typeId: Int) {
    GOOD("Good", 1),
    BAD("Bad", 2);

    companion object {
        fun gettypeByTypeId(typeId: Int) : HabitType {
            for (type in values()) {
                if (type.typeId == typeId) {
                    return type
                }
            }
            throw IllegalArgumentException("Can`t find HabitType for typeId = $typeId")
        }
    }
}

@Parcelize
class Habit(
    var id: Long,
    var name: String,
    var description: String,
    var priority: Int,
    var type: HabitType,
    var period: Int,
    var counter: Int,
    var color: Int
) : Parcelable

inline fun <reified T : Enum<T>> Bundle.getEnum(key: String, default: T) =
    getInt(key).let { if (it >= 0) enumValues<T>()[it] else default }

fun <T : Enum<T>> Bundle.putEnum(key: String, value: T?) =
    putInt(key, value?.ordinal ?: -1)

