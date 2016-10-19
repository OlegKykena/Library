package com.softserve.library.dao;

import com.softserve.library.entity.Order;
import com.softserve.library.genericDAO.GenericDAOImpl;

public class OrderDao extends GenericDAOImpl<Order> {
	public OrderDao() {
		super(Order.class);
	}
	
	
}