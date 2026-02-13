package com.example.emotion_diary.service;

import com.example.emotion_diary.model.Note;
import com.example.emotion_diary.repository.NoteRepository;
import org.springframework.stereotype.Service;

@Service
public class NoteService {
    private final NoteRepository noteRepository;

    public NoteService(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    public void save(Note note) {
        noteRepository.save(note);
    }

    public Note findById(Long id) {
        return noteRepository.findById(id).orElse(null);
    }

    public Iterable<Note> findAll() {
        return noteRepository.findAll();
    }

    public void deleteById(Long id) {
        noteRepository.deleteById(id);
    }

    public void deleteAll() {
        noteRepository.deleteAll();
    }

    public void update(Note note) {
        noteRepository.save(note);
    }
}
