package com.softserve.dao.impl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.softserve.dao.GenreDAO;
import com.softserve.entity.Genre;

@Repository
@Transactional
public class GenreDAOImpl extends GenericDAOImpl<Genre, Integer> 
		implements GenreDAO{

	protected GenreDAOImpl() {
		super(Genre.class);
	}

}
