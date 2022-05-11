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
