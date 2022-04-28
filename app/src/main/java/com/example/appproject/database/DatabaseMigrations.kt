package com.example.appproject.database

import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase

object DatabaseMigrations {
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
}
