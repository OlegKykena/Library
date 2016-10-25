package com.softserve.dao;

import java.util.List;

import com.softserve.entity.Customer;

public interface CustomerDAO extends GenericDAO<Customer, Integer>{

	 public boolean isRegistrated(Integer id);
	 
	 public boolean isRegistrated(String firstName, String lastName);
	 
	 public int howMuchTimeRegistrated(Integer id);
	 
	 public int howMuchTimeRegistrated(String firstName, String lastName);
	 
	 public List<Customer> getListWhoDidNotReturn();
	 
	 public int howManyBooksTake(Integer id);
	 
	 public int howManyBooksTake(String firstName, String lastName);
}
