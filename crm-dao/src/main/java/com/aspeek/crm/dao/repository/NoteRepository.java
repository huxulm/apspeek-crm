package com.aspeek.crm.dao.repository;

import com.aspeek.crm.dao.domain.Note;

import java.util.List;

public interface NoteRepository {

	List<Note> findAll();

}
