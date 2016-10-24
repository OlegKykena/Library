package com.softserve.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.softserve.entity.Author;

public interface AuthorRepository extends JpaRepository<Author, Integer>{
	
}
