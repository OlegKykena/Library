package com.softserve.service;

import java.util.List;

import com.softserve.entity.Genre;

public interface GenreService {

	public void save(Genre Genre);

	public Genre update(Genre Genre);

	public void delete(Genre Genre);

	public Genre findById(Integer id);

	public List<Genre> findAll();
	
	List<Genre> getListSortByAlh();
	
}
