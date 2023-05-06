package com.example.compose_tutorial.feature_note.domain.use_case

import com.example.compose_tutorial.feature_note.domain.model.InvalidNoteException
import com.example.compose_tutorial.feature_note.domain.model.Note
import com.example.compose_tutorial.feature_note.domain.repository.NoteRepository

class AddNote(
    private val repository: NoteRepository
) {

    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note) {
        if (note.title.isBlank()) {
            throw InvalidNoteException("The title cannot be empty")
        }
        if (note.content.isBlank()) {
            throw InvalidNoteException("The content cannot be empty")
        }
        repository.insertNote(note)
    }
}