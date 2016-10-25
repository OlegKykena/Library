package com.softserve.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softserve.dao.GenreDAO;
import com.softserve.entity.Genre;
import com.softserve.service.GenreService;

@Service
public class GenreServiceImpl implements GenreService {

	@Autowired
	GenreDAO genreDAO;

	@Override
	public void save(Genre genre) {
		genreDAO.save(genre);
	}

}
