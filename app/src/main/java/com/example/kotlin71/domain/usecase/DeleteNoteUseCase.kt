package com.example.kotlin71.domain.usecase

import com.example.kotlin71.domain.model.Note
import com.example.kotlin71.domain.repository.NoteRepository

class DeleteNoteUseCase(
    private val noteRepository: NoteRepository
) {

    fun deleteNote(note: Note) = noteRepository.deleteNote(note)

}