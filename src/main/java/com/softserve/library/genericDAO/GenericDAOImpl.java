package com.softserve.library.genericDAO;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;

import com.softserve.library.dao.JPAUtil;


@NamedNativeQuery(name = "GetAll",query="Select * from :Entity")
public abstract class  GenericDAOImpl<E> implements GenericDAO<E> {
	private Class<E> Element;

	public GenericDAOImpl(Class<E> element) {
		Element = element;
	}

	public void add(E element) {
		EntityManager em = JPAUtil.getEntityManager();

		em.getTransaction().begin();
		em.persist(element);
		em.getTransaction().commit();
		em.close();

	}

	public E find(int id) {
		EntityManager em = JPAUtil.getEntityManager();

		E element = null;
		em.getTransaction().begin();

		element = (E) em.find(Element, id);

		em.getTransaction().commit();
		em.close();

		return element;
	}

	public void delete(int id) {
		EntityManager em = JPAUtil.getEntityManager();
		E element = null;

		em.getTransaction().begin();
		element = (E) em.find(Element, id);
		em.remove(element);
		em.getTransaction().commit();
		em.close();

	}

	public void delete(E element) {

		EntityManager em = JPAUtil.getEntityManager();

		em.getTransaction().begin();
		em.remove(element);
		em.getTransaction().commit();
		em.close();
	}

	public void update(E element) {
		EntityManager em = JPAUtil.getEntityManager();

		em.getTransaction().begin();
		
		em.merge(element);

		em.getTransaction().commit();
		em.close();

	}

	public List<E> findAll() {
	
		EntityManager em = JPAUtil.getEntityManager();

		List<E> elements = new ArrayList<>();

		em.getTransaction().begin();

		CriteriaBuilder criteria = em.getCriteriaBuilder();
	
		Query query = em.createNativeQuery("Select * from "+Element.getSimpleName() , Element);
		elements = query.getResultList();
		System.out.println(elements);


		em.getTransaction().commit();
		em.close();

		return elements;
		
	}

}
