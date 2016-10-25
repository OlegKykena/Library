package com.softserve.service;

import java.util.List;

import com.softserve.entity.Customer;

public interface CustomerService {

	public void save(Customer customer);

	public Customer update(Customer customer);

	public void delete(Customer customer);

	public Customer findById(Integer id);

	public List<Customer> findAll();

	public boolean isRegistrated(Integer id);

	public boolean isRegistrated(String firstName, String lastName);

	public int howMuchTimeRegistrated(Integer id);

	public int howMuchTimeRegistrated(String firstName, String lastName);

	public List<Customer> getListWhoDidNotReturn();

	public int howManyBooksTake(Integer id);

	public int howManyBooksTake(String firstName, String lastName);
}
