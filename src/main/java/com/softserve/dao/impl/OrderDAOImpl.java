package com.softserve.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.softserve.dao.OrderDAO;
import com.softserve.entity.Book;
import com.softserve.entity.Order;

@Repository
@Transactional
public class OrderDAOImpl extends GenericDAOImpl<Order, Integer> 
		implements OrderDAO{

	protected OrderDAOImpl() {
		super(Order.class);
	}
	
	
}
