package com.softserve.dao.impl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.softserve.dao.BookDAO;
import com.softserve.entity.Book;

@Repository
@Transactional
public class BookDAOImpl extends GenericDAOImpl<Book, Integer> 
		implements BookDAO{

	protected BookDAOImpl() {
		super(Book.class);
	}

}
