package com.softserve.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softserve.dao.AuthorDAO;
import com.softserve.entity.Author;
import com.softserve.service.AuthorService;

@Service
public class AuthorServiceImpl implements AuthorService {
	@Autowired
	private AuthorDAO authorDAO;

	@Override
	public List<Author> findByFirstName(String firstName) {
		// TODO Auto-generated method stub

		return authorDAO.findByFirstName(firstName);
	}

	@Override
	public List<Author> findByLastName(String lastName) {
		// TODO Auto-generated method stub
		return authorDAO.findByLastName(lastName);
	}
}
