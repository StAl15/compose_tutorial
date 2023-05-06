package com.example.compose_tutorial.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.compose_tutorial.ui.theme.Pink40
import com.example.compose_tutorial.ui.theme.Purple80
import com.example.compose_tutorial.ui.theme.PurpleGrey40
import com.example.compose_tutorial.ui.theme.PurpleGrey80

@Entity
class Note(
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int,
    @PrimaryKey val id: Int? = null
) {
    companion object {
        val noteColors = listOf(Purple80, PurpleGrey40, Pink40, PurpleGrey80)
    }
}

class InvalidNoteException(message: String) : Exception(message)