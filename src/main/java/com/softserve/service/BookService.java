package com.softserve.service;

import java.util.List;

import com.softserve.entity.Book;

public interface BookService {

	List<Book> findBooksByGenre(String genre);
	
	List<Book> findBooksByName(String name);
	
	List<Book> findBooksByAuthor(String firstName, String lastName);
	
	List<Book> findAvailableBooks();
	
	List<String> findMostPopularBook();
}
