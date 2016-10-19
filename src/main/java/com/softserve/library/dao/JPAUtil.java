package com.softserve.library.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	
private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("primary");
	
	
	public static EntityManager getEntityManager(){
		
		return entityManagerFactory.createEntityManager();
	}
	
	public static void closeSessionFactory(){
		entityManagerFactory.close();
	}
	
}
