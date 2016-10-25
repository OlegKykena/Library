package com.softserve.dao;

import com.softserve.entity.Order;

public interface OrderDAO extends GenericDAO<Order, Integer>{

	public Order findById(Integer id);
}
