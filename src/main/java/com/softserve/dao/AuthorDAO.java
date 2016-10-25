package com.softserve.dao;

import java.util.List;

import com.softserve.entity.Author;

public interface AuthorDAO extends GenericDAO<Author, Integer> {
	List<Author> findByFirstName(String firstName);

	List<Author> findByLastName(String lastName);

}
