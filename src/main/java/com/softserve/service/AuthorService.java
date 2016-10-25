package com.softserve.service;

import java.util.List;

import com.softserve.entity.Author;

public interface AuthorService {
	List<Author> findByFirstName(String firstName);

	List<Author> findByLastName(String lastName);
}
