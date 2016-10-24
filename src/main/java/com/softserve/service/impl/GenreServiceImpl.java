package com.softserve.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softserve.entity.Genre;
import com.softserve.repository.GenreRepository;
import com.softserve.service.GenreService;

@Service
public class GenreServiceImpl implements GenreService{
	
	@Autowired
	private GenreRepository genreRepository;

	@Override
	public void save(String name) {
		Genre genre = new Genre();
		genre.setName(name);
		genreRepository.save(genre);
	}

	@Override
	public Genre findByName(String name) {
		return genreRepository.findByName(name);
	}

}
