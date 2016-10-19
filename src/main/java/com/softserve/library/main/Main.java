package com.softserve.library.main;

import javax.persistence.EntityManager;

import com.softserve.library.dao.JPAUtil;

public class Main {

	public static void main(String[] args) {

		EntityManager em = JPAUtil.getEntityManager();
		em.getTransaction().begin();
		System.out.println("asdasd");
		em.getTransaction().commit();
		em.close();
		JPAUtil.closeSessionFactory();
	}

}
