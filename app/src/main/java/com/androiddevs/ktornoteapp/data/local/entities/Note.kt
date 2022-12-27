package com.androiddevs.ktornoteapp.data.local.entities

import androidx.room.PrimaryKey
import java.util.UUID

data class Note(
    val title: String,
    val content: String,
    val date: Long,
    val owners: List<String>,
    val color : String,
    @PrimaryKey(autoGenerate = false)
    val id: String = UUID.randomUUID().toString()

)
