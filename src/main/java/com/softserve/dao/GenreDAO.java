package com.softserve.dao;

import java.util.List;

import com.softserve.entity.Genre;

public interface GenreDAO extends GenericDAO<Genre, Integer>{

	List<Genre> getListSortByAlh();
	
}
