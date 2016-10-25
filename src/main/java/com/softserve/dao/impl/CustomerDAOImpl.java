package com.softserve.dao.impl;

import java.math.BigInteger;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.softserve.dao.CustomerDAO;
import com.softserve.entity.Customer;

@Repository
@Transactional
public class CustomerDAOImpl extends GenericDAOImpl<Customer, Integer> 
		implements CustomerDAO{
	
	@PersistenceContext
	private EntityManager entityManager;

	protected CustomerDAOImpl() {
		super(Customer.class);
	}

	@Override
	public boolean isRegistrated(Integer id) {
		Query query = entityManager.createNativeQuery("SELECT registrationDate from customers where id = :id");
		query.setParameter("id", id);
		return query.getSingleResult() != null;
	}

	@Override
	public boolean isRegistrated(String firstName, String lastName) {
		Query query = entityManager.
				createNativeQuery("SELECT registrationDate from customers where firstName = :firstName and lastName = :lastName");
		query.setParameter("firstName", firstName);
		query.setParameter("lastName", lastName);	
		return query.getSingleResult() != null;
	}

	@Override
	public int howMuchTimeRegistrated(Integer id) {
		Query query = entityManager
				.createNativeQuery("SELECT  DATEDIFF(curdate(),registrationDate) from customers where id = :id");
		query.setParameter("id", id);
		BigInteger bigInteger = (BigInteger) query.getSingleResult();
		
		return bigInteger.intValue();
	}

	@Override
	public int howMuchTimeRegistrated(String firstName, String lastName) {
		Query query = entityManager
				.createNativeQuery("SELECT  DATEDIFF(curdate(),registrationDate) from customers where firstName = :firstName and lastName = :lastName");
		query.setParameter("firstName", firstName);
		query.setParameter("lastName", lastName);
		BigInteger bigInteger = (BigInteger) query.getSingleResult();
		
		return bigInteger.intValue();
		
	}

	@Override
	public List<Customer> getListWhoDidNotReturn() {
		Query query = entityManager.createNativeQuery("SELECT * FROM customers"
				+ " join orders on customers.id = orders.customer_id where returningDate is null",Customer.class);
		
		return query.getResultList();
				
	}

	@Override
	public int howManyBooksTake(Integer id) {
		Query query = entityManager.createNativeQuery("SELECT count(customer_id) from orders where customer_id = :id");
		query.setParameter("id", id);
		BigInteger co = (BigInteger) query.getSingleResult();
		
		return co.intValue();
	}

	@Override
	public int howManyBooksTake(String firstName, String lastName) {
		Query query = entityManager.createNativeQuery("SELECT count(customer_id) from orders where firstName = :firstName and lastName = :lastName");
		query.setParameter("firstName", firstName);
		query.setParameter("lastName", lastName);
        BigInteger co = (BigInteger) query.getSingleResult();
		
		return co.intValue();
	}


}
