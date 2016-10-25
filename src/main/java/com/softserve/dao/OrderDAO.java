package com.softserve.dao;

import java.util.List;

import com.softserve.entity.Order;

public interface OrderDAO extends GenericDAO<Order, Integer>{

	List<Order> findAll();
}
