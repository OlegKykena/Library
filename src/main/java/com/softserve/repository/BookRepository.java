package com.softserve.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.softserve.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{

}
