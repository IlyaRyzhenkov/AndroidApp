package com.example.appproject

import android.os.Build
import android.os.Bundle
import android.os.Parcelable
import androidx.annotation.RequiresApi
import com.google.gson.*
import kotlinx.parcelize.Parcelize
import java.lang.reflect.Type
import java.time.Instant

enum class HabitType(val repr: String, val typeId: Int) {
    GOOD("Good", 0),
    BAD("Bad", 1);

    companion object {
        fun getTypeByTypeId(typeId: Int) : HabitType {
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
data class Habit(
    var id: Long,
    var name: String,
    var description: String,
    var priority: Int,
    var type: HabitType,
    var period: Int,
    var counter: Int,
    var color: Int,
    var date: Instant,
    var uid: String?,
) : Parcelable {
    class HabitJsonSerializer : JsonSerializer<Habit> {
        @RequiresApi(Build.VERSION_CODES.O)
        override fun serialize(src: Habit, typeOfSrc: Type, context: JsonSerializationContext): JsonElement = JsonObject().apply {
            addProperty("color", src.color)
            addProperty("count", src.counter)
            addProperty("description", src.description)
            addProperty("priority", src.priority)
            addProperty("type", src.type.typeId)
            addProperty("frequency", src.period)
            addProperty("title", src.name)
            addProperty("date", src.date.epochSecond)
            if (src.uid != null) {
                addProperty("uid", src.uid)
            }
        }
    }

    class HabitJsonDeserializer : JsonDeserializer<Habit> {
        override fun deserialize(json: JsonElement, typeOfT: Type?, context: JsonDeserializationContext?): Habit = Habit(
            name = json.asJsonObject.get("title").asString,
            description = json.asJsonObject.get("description").asString,
            priority = json.asJsonObject.get("priority").asInt,
            type = HabitType.getTypeByTypeId(json.asJsonObject.get("type").asInt),
            period = json.asJsonObject.get("frequency").asInt,
            counter = json.asJsonObject.get("count").asInt,
            color = json.asJsonObject.get("color").asInt,
            date = Instant.ofEpochSecond(json.asJsonObject.get("date").asLong),
            uid = json.asJsonObject.get("uid").asString,
            id = -1,
        )
    }
}

inline fun <reified T : Enum<T>> Bundle.getEnum(key: String, default: T) =
    getInt(key).let { if (it >= 0) enumValues<T>()[it] else default }

fun <T : Enum<T>> Bundle.putEnum(key: String, value: T?) =
    putInt(key, value?.ordinal ?: -1)

