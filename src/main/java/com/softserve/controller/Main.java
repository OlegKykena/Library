package com.softserve.controller;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.softserve.dao.CustomerDAO;
import com.softserve.dao.GenreDAO;
import com.softserve.dao.OrderDAO;
import com.softserve.entity.Genre;
import com.softserve.service.GenreService;

public class Main {
	
	private static final ConfigurableApplicationContext context = 
			new ClassPathXmlApplicationContext("/META-INF/applicationContext.xml");
	

	public static void main(String[] args) {

		//GenreService genreService = context.getBean(GenreService.class);
		OrderDAO dao  = context.getBean(OrderDAO.class);
		System.out.println(dao.findById(2));
	

	}

}
