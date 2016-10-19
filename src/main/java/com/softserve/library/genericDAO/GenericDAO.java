package com.softserve.library.genericDAO;

import java.util.List;

public interface GenericDAO<E> {
	
	void add(E e);
	
	E find(int id);
	
	void delete(int id);
	
	void delete(E e);
	
	void update(E e);
	
	List<E> findAll();

}
