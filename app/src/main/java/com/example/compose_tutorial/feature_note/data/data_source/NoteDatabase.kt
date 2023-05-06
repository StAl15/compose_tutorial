package com.example.compose_tutorial.feature_note.data.data_source

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.compose_tutorial.feature_note.domain.model.Note

@Database(
    entities = [Note::class],
    version = 2,
    exportSchema = false
)
abstract class NoteDatabase : RoomDatabase() {

    abstract val noteDao: NoteDao

    companion object {
        const val DATABASE_NAME = "notes_db"
    }

}