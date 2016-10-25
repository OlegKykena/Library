package com.softserve.service;

import java.util.List;

import com.softserve.entity.Customer;
import com.softserve.entity.Exempliar;

public interface ExempliarService {

	List<Exempliar> findReadBooksByCustomer(Customer customer);
	
	List<Exempliar> findBooksCustomerIsReading(Customer customer);
}
