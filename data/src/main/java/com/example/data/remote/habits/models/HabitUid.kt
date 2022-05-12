package com.example.data.remote.habits.models

import com.google.gson.*
import java.lang.reflect.Type

data class HabitUid(
    val uid: String,
) : java.io.Serializable {
    class HabitUidJsonSerializer : JsonSerializer<HabitUid> {
        override fun serialize(src: HabitUid, typeOfSrc: Type, context: JsonSerializationContext): JsonElement = JsonObject().apply {
            addProperty("uid", src.uid)
        }
    }

    class HabitUidJsonDeserializer : JsonDeserializer<HabitUid> {
        override fun deserialize(json: JsonElement, typeOfT: Type?, context: JsonDeserializationContext?): HabitUid = HabitUid(
            uid = json.asJsonObject.get("uid").asString
        )
    }
}

data class HabitDone(
    val date: Long,
    val uid: String,
) : java.io.Serializable {
    class HabitDoneJsonSerializer : JsonSerializer<HabitDone> {
        override fun serialize(src: HabitDone, typeOfSrc: Type?, context: JsonSerializationContext?): JsonElement = JsonObject().apply {
            addProperty("habit_uid", src.uid)
            addProperty("date", src.date)
        }
    }

    class HabitDoneJsonDeserializer : JsonDeserializer<HabitDone> {
        override fun deserialize(json: JsonElement, typeOfT: Type?, context: JsonDeserializationContext?): HabitDone = HabitDone(
            uid = json.asJsonObject.get("habit_uid").asString,
            date = json.asJsonObject.get("date").asLong,
        )

    }
}
