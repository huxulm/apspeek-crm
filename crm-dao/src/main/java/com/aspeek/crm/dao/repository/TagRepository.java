package com.aspeek.crm.dao.repository;

import com.aspeek.crm.dao.domain.Tag;

import java.util.List;

public interface TagRepository {

	List<Tag> findAll();

}
