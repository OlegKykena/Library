package com.softserve.service;

import com.softserve.entity.Genre;

public interface GenreService {

	void save(String name);
	
	Genre findByName(String name);
}
