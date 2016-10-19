package com.softserve.library.dao;

import com.softserve.library.entity.Book;
import com.softserve.library.genericDAO.GenericDAOImpl;

public class BookDao extends GenericDAOImpl<Book> {

	public BookDao() {
		super(Book.class);
	}
	



}
