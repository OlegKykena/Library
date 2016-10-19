package com.softserve.library.dao;

import com.softserve.library.entity.Genre;
import com.softserve.library.genericDAO.GenericDAOImpl;

public class GenreDao extends GenericDAOImpl<Genre> {

	public GenreDao() {
		super(Genre.class);
	}
	


}