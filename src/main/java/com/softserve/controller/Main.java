package com.softserve.controller;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.softserve.dao.AuthorDAO;
import com.softserve.dao.CustomerDAO;
import com.softserve.dao.GenreDAO;
import com.softserve.dao.OrderDAO;

public class Main {

	private static final ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
			"/META-INF/applicationContext.xml");

	public static void main(String[] args) {

		// GenreService genreService = context.getBean(GenreService.class);
		GenreDAO dao = context.getBean(GenreDAO.class);
		// System.out.println(dao.findById(1));
		// context.close();
		AuthorDAO d = context.getBean(AuthorDAO.class);
		// System.out.println(d.findByFirstName("a"));
		OrderDAO o = context.getBean(OrderDAO.class);
		CustomerDAO i = context.getBean(CustomerDAO.class);
		// System.out.println(o.findAllOrdersByCustomer(new Customer()));
		// System.out.println(o.howManyTimeWasBookTakes("a"));
		// System.out.println(o.howManyTimeWasBookTakesByExempliars(1));
		// System.out.println(o.averageReadingTimeByExempliar(1));
		// System.out.println(o.averageReadingTimeByBook("c"));
		System.out.println(o.findById(1));
		// System.out.println(o.findAllOrdersByCustomer(i.findById(1)));
		context.close();

	}

}
