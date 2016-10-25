package com.softserve.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.softserve.dao.ExempliarDAO;
import com.softserve.entity.Customer;
import com.softserve.entity.Exempliar;

@Repository
@Transactional
public class ExempliarDAOImpl extends GenericDAOImpl<Exempliar, Integer> 
		implements ExempliarDAO{

	@PersistenceContext
	private EntityManager entityManager;
	
	protected ExempliarDAOImpl() {
		super(Exempliar.class);
	}
	
	@Override
	public Exempliar findById(Integer id) {
		return entityManager.createQuery("SELECT ex FROM Exempliar ex JOIN fetch "
				+ "ex.book b WHERE ex.id = :id", Exempliar.class)
				.setParameter("id", id).getSingleResult();
	}
	
	@Override
	public List<Exempliar> findAll() {
		return entityManager.createQuery("SELECT ex FROM Exempliar ex JOIN fetch "
				+ "ex.book b ", Exempliar.class).getResultList();
	}

	@Override
	public List<Exempliar> findReadBooksByCustomer(Customer customer) {
		return entityManager.createQuery("SELECT DISTINCT ex FROM Exempliar ex JOIN fetch "
				+ "ex.book b JOIN fetch ex.orders ord WHERE ord.customer = "
				+ ":customer AND ord.returningDate IS NOT NULL" , Exempliar.class)
				.setParameter("customer", customer).getResultList();
	}

	@Override
	public List<Exempliar> findBooksCustomerIsReading(Customer customer) {
		return entityManager.createQuery("SELECT DISTINCT ex FROM Exempliar ex JOIN fetch "
				+ "ex.book b JOIN fetch ex.orders ord WHERE ord.customer = "
				+ ":customer AND ord.returningDate IS NULL" , Exempliar.class)
				.setParameter("customer", customer).getResultList();
	}
	
	

}
