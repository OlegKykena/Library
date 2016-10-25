package com.softserve.service;

import java.util.List;

import com.softserve.entity.Customer;
import com.softserve.entity.Exempliar;

public interface ExempliarService {
	
	void save(Exempliar exempliar);
	
	Exempliar update(Exempliar exempliar);
	
	void delete(Exempliar exempliar);
	
	Exempliar findById(Integer id);
	
	List<Exempliar> findAll();

	List<Exempliar> findReadBooksByCustomer(Customer customer);
	
	List<Exempliar> findBooksCustomerIsReading(Customer customer);
}
