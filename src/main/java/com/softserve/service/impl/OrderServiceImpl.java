package com.softserve.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softserve.dao.OrderDAO;
import com.softserve.entity.Customer;
import com.softserve.entity.Order;
import com.softserve.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderDAO orderDAO;

	@Override
	public List<Order> findAllOrdersByCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return orderDAO.findAllOrdersByCustomer(customer);
	}

	@Override
	public int howManyTimeWasBookTakes(String bookname) {
		// TODO Auto-generated method stub
		return orderDAO.howManyTimeWasBookTakes(bookname);
	}

	@Override
	public int howManyTimeWasBookTakesByExempliars(int id) {
		// TODO Auto-generated method stub
		return orderDAO.howManyTimeWasBookTakesByExempliars(id);
	}

	@Override
	public int averageReadingTimeByExempliar(int id) {
		// TODO Auto-generated method stub
		return orderDAO.averageReadingTimeByExempliar(id);
	}

	@Override
	public int averageReadingTimeByBook(String name) {
		// TODO Auto-generated method stub
		return orderDAO.averageReadingTimeByBook(name);
	}

	@Override
	public List<Order> findAll() {
		// TODO Auto-generated method stub
		return orderDAO.findAll();
	}

}
