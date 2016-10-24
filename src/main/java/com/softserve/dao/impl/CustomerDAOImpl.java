package com.softserve.dao.impl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.softserve.entity.Customer;
import com.softserve.service.CustomerService;

@Repository
@Transactional
public class CustomerDAOImpl extends GenericDAOImpl<Customer, Integer> 
		implements CustomerService{

	protected CustomerDAOImpl() {
		super(Customer.class);
	}

}
