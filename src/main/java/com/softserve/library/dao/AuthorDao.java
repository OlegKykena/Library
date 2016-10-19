package com.softserve.library.dao;

import com.softserve.library.entity.Author;
import com.softserve.library.genericDAO.GenericDAOImpl;

public class AuthorDao extends GenericDAOImpl<Author> {

	public AuthorDao() {
		super(Author.class);
	}
	
}