package com.softserve.controller;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.softserve.dao.AuthorDAO;
import com.softserve.dao.BookDAO;
import com.softserve.dao.CustomerDAO;
import com.softserve.dao.ExempliarDAO;
import com.softserve.dao.GenreDAO;
import com.softserve.dao.OrderDAO;

public class Main {

	private static final ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
			"/META-INF/applicationContext.xml");

	
	public static void main(String[] args) {
		
		BookDAO bookDAO = context.getBean(BookDAO.class);
		
		System.out.println(bookDAO.findAvailableBooks());


	}

}
