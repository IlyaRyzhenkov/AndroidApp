package com.example.data.database

import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase

class DatabaseMigrations {
    val MIGRATION_1_2 = object : Migration(1, 2) {
        override fun migrate(database: SupportSQLiteDatabase) {
            database.execSQL("ALTER TABLE habits ADD COLUMN uid TEXT")
            database.execSQL("CREATE INDEX IF NOT EXISTS index_habits_uid ON habits (uid)")
        }
    }
    val MIGRATION_2_3 = object : Migration(2, 3) {
        override fun migrate(database: SupportSQLiteDatabase) {
            database.execSQL("ALTER TABLE habits ADD COLUMN date INTEGER NOT NULL DEFAULT 0")
        }
    }

    val MIGRATION_3_4 = object : Migration(3, 4) {
        override fun migrate(database: SupportSQLiteDatabase) {
            database.execSQL("CREATE TABLE IF NOT EXISTS habits_completion (completion_id INTEGER PRIMARY KEY AUTOINCREMENT, habit_id INTEGER, date INTEGER NOT NULL DEFAULT 0, habit_uid TEXT, FOREIGN KEY(habit_id) REFERENCES habits(habit_id) ON UPDATE CASCADE ON DELETE CASCADE)")
            database.execSQL("CREATE INDEX IF NOT EXISTS index_habits_completion_habit_id_date ON habits_completion (habit_id, date)")
            database.execSQL("CREATE INDEX IF NOT EXISTS index_habits_completion_habit_uid_date ON habits_completion (habit_uid, date)")
        }
    }
}