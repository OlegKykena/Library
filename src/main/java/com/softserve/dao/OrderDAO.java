package com.softserve.dao;

import java.util.List;

import com.softserve.entity.Customer;
import com.softserve.entity.Order;

public interface OrderDAO extends GenericDAO<Order, Integer> {

	List<Order> findAllOrdersByCustomer(Customer customer);

	int howManyTimeWasBookTakes(String bookname);

	int howManyTimeWasBookTakesByExempliars(int id);

	int averageReadingTimeByExempliar(int id);

	int averageReadingTimeByBook(String name);

	List<Order> findAll();

}
