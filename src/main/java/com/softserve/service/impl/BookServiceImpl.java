package com.softserve.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softserve.dao.BookDAO;
import com.softserve.entity.Book;
import com.softserve.service.BookService;

@Service
public class BookServiceImpl implements BookService{

	@Autowired
	private BookDAO bookDAO;
	
	@Override
	public List<Book> findBooksByGenre(String genre) {
		return bookDAO.findBooksByGenre(genre);
	}

	@Override
	public List<Book> findBooksByName(String name) {
		return bookDAO.findBooksByName(name);
	}

	@Override
	public List<Book> findBooksByAuthor(String firstName, String lastName) {
		return bookDAO.findBooksByAuthor(firstName, lastName);
	}

	@Override
	public List<Book> findAvailableBooks() {
		return bookDAO.findAvailableBooks();
	}

	@Override
	public List<String> findMostPopularBook() {
		return findMostPopularBook();
	}

	@Override
	public void save(Book book) {
		bookDAO.save(book);
	}

	@Override
	public Book update(Book book) {
		return bookDAO.update(book);
	}

	@Override
	public void delete(Book book) {
		bookDAO.delete(book);
	}

	@Override
	public Book findById(Integer id) {
		return bookDAO.findById(id);
	}

	@Override
	public List<Book> findAll() {
		return bookDAO.findAll();
	}

}
