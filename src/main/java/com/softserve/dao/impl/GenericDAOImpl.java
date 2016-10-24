package com.softserve.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.softserve.dao.GenericDAO;

@Repository
@Transactional
public abstract class GenericDAOImpl<T, ID> implements GenericDAO<T, ID>{

	@PersistenceContext
	private EntityManager entityManager;
	 
	private Class<T> clazz;
	
	protected GenericDAOImpl(Class<T> clazz) {
		this.clazz = clazz;
	}

	@Override
	public void save(T entity) {
		entityManager.persist(entity);
	}

	@Override
	public T update(T entity) {
		return entityManager.merge(entity);
	}

	@Override
	public void delete(T entity) {
		entityManager.remove(entity);
	}

	@Override
	public T findById(ID id) {
		return entityManager.find(clazz, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> findAll() {
		return entityManager.createQuery("from " + clazz.getSimpleName()).getResultList();
	}

	
}
