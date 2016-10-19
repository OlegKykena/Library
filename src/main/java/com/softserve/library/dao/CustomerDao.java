package com.softserve.library.dao;

import java.util.Date;

import javax.persistence.EntityManager;

import com.softserve.library.entity.Customer;
import com.softserve.library.genericDAO.GenericDAOImpl;

public class CustomerDao  extends GenericDAOImpl<Customer>{

	public CustomerDao() {
		super(Customer.class);
	}
	
	public boolean isRegistration(int id){
		
		Customer customer = null;
		EntityManager EntityManager = JPAUtil.getEntityManager();
		EntityManager.getTransaction().begin();
		
		customer = EntityManager.find(Customer.class, id);
	
		EntityManager.getTransaction().commit();
		EntityManager.close();
		
		return customer.getRegistrationDate() != null;

	}
	
	public int HowMuchTimeRegistration(int id){
		Customer customer = null;
		EntityManager EntityManager = JPAUtil.getEntityManager();
		EntityManager.getTransaction().begin();
		
		customer = EntityManager.find(Customer.class, id);
			
			
		EntityManager.getTransaction().commit();
		int date = new Date().getYear();
		return date - customer.getRegistrationDate().getYear();
	}
	
//	public List<Customer> DontReturningBook(){
//		List<Customer> customers = new ArrayList();
//		EntityManager EntityManager = JPAUtil.getEntityManager();
//		EntityManager.getTransaction().begin();
//		
//		Criteria criteria
//		List<Order> orders = EntityManager.createCriteria(Order.class).
//		
//		for(Order order : new OrderDao().getAllElement()){
//			if(order.getReturningDate()==null){
//				customers.add(order.getCustomer());
//			}
//		}
//		
//		EntityManager.getTransaction().commit();
//		EntityManager.close();
//		
//		return customers;
//	}


}
