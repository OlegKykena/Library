package com.softserve.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softserve.dao.CustomerDAO;
import com.softserve.entity.Customer;
import com.softserve.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	CustomerDAO customerDAO;

	@Override
	public void save(Customer customer) {
		customerDAO.save(customer);
	}

	@Override
	public Customer update(Customer customer) {
		return customerDAO.update(customer);
	}

	@Override
	public void delete(Customer customer) {
		customerDAO.delete(customer);
	}

	@Override
	public Customer findById(Integer id) {
		return customerDAO.findById(id);
	}

	@Override
	public List<Customer> findAll() {
		return customerDAO.findAll();
	}

	@Override
	public boolean isRegistrated(Integer id) {
		return customerDAO.isRegistrated(id);
	}

	@Override
	public boolean isRegistrated(String firstName, String lastName) {
		return customerDAO.isRegistrated(firstName, lastName);
	}

	@Override
	public int howMuchTimeRegistrated(Integer id) {
		return customerDAO.howMuchTimeRegistrated(id);
	}

	@Override
	public int howMuchTimeRegistrated(String firstName, String lastName) {
		return customerDAO.howMuchTimeRegistrated(firstName, lastName);
	}

	@Override
	public List<Customer> getListWhoDidNotReturn() {
		return customerDAO.getListWhoDidNotReturn();
	}

	@Override
	public int howManyBooksTake(Integer id) {
		return customerDAO.howManyBooksTake(id);
	}

	@Override
	public int howManyBooksTake(String firstName, String lastName) {
		return customerDAO.howManyBooksTake(firstName, lastName);
	}
	
}