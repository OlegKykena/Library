package com.softserve.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.softserve.dao.CustomerDAO;
import com.softserve.entity.Customer;

@Repository
@Transactional
public class CustomerDAOImpl extends GenericDAOImpl<Customer, Integer> implements CustomerDAO {

	@PersistenceContext
	private EntityManager em;

	protected CustomerDAOImpl() {
		super(Customer.class);
	}

}
