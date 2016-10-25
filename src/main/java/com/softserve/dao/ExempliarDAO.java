package com.softserve.dao;

import java.util.List;

import com.softserve.entity.Customer;
import com.softserve.entity.Exempliar;

public interface ExempliarDAO extends GenericDAO<Exempliar, Integer>{

	List<Exempliar> findReadBooksByCustomer(Customer customer);
	
	List<Exempliar> findBooksCustomerIsReading(Customer customer);
}
