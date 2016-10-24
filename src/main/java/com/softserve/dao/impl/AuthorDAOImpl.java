package com.softserve.dao.impl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.softserve.dao.AuthorDAO;
import com.softserve.entity.Author;

@Repository
@Transactional
public class AuthorDAOImpl extends GenericDAOImpl<Author, Integer> 
		implements AuthorDAO{

	protected AuthorDAOImpl() {
		super(Author.class);
	}

	
	
}
