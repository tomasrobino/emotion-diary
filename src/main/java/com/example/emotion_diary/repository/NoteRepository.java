package com.example.emotion_diary.repository;

import com.example.emotion_diary.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepository extends JpaRepository<Note, Long> {}
