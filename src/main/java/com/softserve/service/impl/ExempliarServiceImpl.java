package com.softserve.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softserve.dao.ExempliarDAO;
import com.softserve.entity.Customer;
import com.softserve.entity.Exempliar;
import com.softserve.service.ExempliarService;

@Service
public class ExempliarServiceImpl implements ExempliarService{

	@Autowired
	private ExempliarDAO exempliarDAO;
	
	@Override
	public List<Exempliar> findReadBooksByCustomer(Customer customer) {
		return exempliarDAO.findReadBooksByCustomer(customer);
	}

	@Override
	public List<Exempliar> findBooksCustomerIsReading(Customer customer) {
		return exempliarDAO.findBooksCustomerIsReading(customer);
	}

	@Override
	public void save(Exempliar exempliar) {
		exempliarDAO.save(exempliar);
	}

	@Override
	public Exempliar update(Exempliar exempliar) {
		return exempliarDAO.update(exempliar);
	}

	@Override
	public void delete(Exempliar exempliar) {
		exempliarDAO.delete(exempliar);
	}

	@Override
	public Exempliar findById(Integer id) {
		return exempliarDAO.findById(id);
	}

	@Override
	public List<Exempliar> findAll() {
		return exempliarDAO.findAll();
	}

}
