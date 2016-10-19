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
		// TODO Auto-generated method stub
		EntityManager EntityManager = JPAUtil.getEntityManager();

		EntityManager.getTransaction().begin();
		EntityManager.persist(element);
		EntityManager.getTransaction().commit();
		EntityManager.close();

	}

	public E find(int id) {
		// TODO Auto-generated method stub
		EntityManager EntityManager = JPAUtil.getEntityManager();

		E element = null;
		EntityManager.getTransaction().begin();

		element = (E) EntityManager.find(Element, id);

		EntityManager.getTransaction().commit();
		EntityManager.close();

		return element;
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		EntityManager EntityManager = JPAUtil.getEntityManager();
		E element = null;

		EntityManager.getTransaction().begin();
		element = (E) EntityManager.find(Element, id);
		EntityManager.remove(element);
		EntityManager.getTransaction().commit();
		EntityManager.close();

	}

	public void delete(E element) {
		// TODO Auto-generated method stub

		EntityManager EntityManager = JPAUtil.getEntityManager();

		EntityManager.getTransaction().begin();
		EntityManager.remove(element);
		EntityManager.getTransaction().commit();
		EntityManager.close();
	}

	public void update(E element) {
		// TODO Auto-generated method stub
		EntityManager EntityManager = JPAUtil.getEntityManager();

		EntityManager.getTransaction().begin();
		
		EntityManager.merge(element);

		EntityManager.getTransaction().commit();
		EntityManager.close();

	}

	public List<E> findAll() {
	
		EntityManager EntityManager = JPAUtil.getEntityManager();

		List<E> elements = new ArrayList<>();

		EntityManager.getTransaction().begin();

		CriteriaBuilder criteria = EntityManager.getCriteriaBuilder();
	
		Query query = EntityManager.createNativeQuery("Select * from "+Element.getSimpleName() , Element);
		elements = query.getResultList();
		System.out.println(elements);


		EntityManager.getTransaction().commit();
		EntityManager.close();

		return elements;
		
	}

}
