package com.softserve.service;

import java.util.List;

import com.softserve.entity.Book;

public interface BookService {
	
	void save(Book book);
	
	Book update(Book book);
	
	void delete(Book book);
	
	Book findById(Integer id);
	
	List<Book> findAll();

	List<Book> findBooksByGenre(String genre);
	
	List<Book> findBooksByName(String name);
	
	List<Book> findBooksByAuthor(String firstName, String lastName);
	
	List<Book> findAvailableBooks();
	
	List<String> findMostPopularBook();
}
