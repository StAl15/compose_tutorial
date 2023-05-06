package com.example.compose_tutorial.feature_note.domain.use_case

data class NoteUseCases(
    val getNotes: GetNotes,
    val deleteNode: DeleteNote,
    val addNote: AddNote,
    val getNote: GetNote
)
