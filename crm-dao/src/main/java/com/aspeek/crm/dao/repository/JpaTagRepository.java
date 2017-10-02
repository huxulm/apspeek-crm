package com.aspeek.crm.dao.repository;

import com.aspeek.crm.dao.domain.Tag;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class JpaTagRepository implements TagRepository {

	@PersistenceContext
	private EntityManager entityManager;

	public List<Tag> findAll() {
		return this.entityManager.createQuery("SELECT t FROM Tag t", Tag.class)
				.getResultList();
	}

}
