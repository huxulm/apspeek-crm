package com.aspeek.crm.dao.repository;

import com.aspeek.crm.dao.domain.Note;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class JpaNoteRepository implements NoteRepository {

	@PersistenceContext
	private EntityManager entityManager;

	public List<Note> findAll() {
		return this.entityManager.createQuery("SELECT n FROM Note n", Note.class)
				.getResultList();
	}

}
