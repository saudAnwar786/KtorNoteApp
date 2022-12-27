package com.androiddevs.ktornoteapp.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.androiddevs.ktornoteapp.data.local.entities.Note

@Database(entities = [Note::class], version = 1)
@TypeConverters
abstract class NotesDatabase :RoomDatabase(){
    abstract fun getNoteDao():NoteDao
}