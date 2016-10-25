package com.softserve.service.impl;

import java.util.List;

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

	@Override
	public Genre update(Genre Genre) {
		return genreDAO.update(Genre);
	}

	@Override
	public void delete(Genre Genre) {
		genreDAO.delete(Genre);
	}

	@Override
	public Genre findById(Integer id) {
		return genreDAO.findById(id);
	}

	@Override
	public List<Genre> findAll() {
		return genreDAO.findAll();
	}

	@Override
	public List<Genre> getListSortByAlh() {
		return genreDAO.getListSortByAlh();
	}

}
