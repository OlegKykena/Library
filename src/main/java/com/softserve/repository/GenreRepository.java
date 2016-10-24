package com.softserve.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.softserve.entity.Genre;

public interface GenreRepository extends JpaRepository<Genre, Integer>{

	Genre findByName(String name);
	
	List<Genre> findAll();
}
