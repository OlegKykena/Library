package com.softserve.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.softserve.dao.GenreDAO;
import com.softserve.entity.Genre;

@Repository
@Transactional
public class GenreDAOImpl extends GenericDAOImpl<Genre, Integer> 
		implements GenreDAO{

	@PersistenceContext
	private EntityManager entityManager;
	
	protected GenreDAOImpl() {
		super(Genre.class);
	}

	@Override
	public List<Genre> getListSortByAlh() {
		Query query = entityManager.createNativeQuery("SELECT * from genres order by name",Genre.class);
		return query.getResultList();
	}
}
