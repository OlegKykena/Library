package com.softserve.controller;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.softserve.service.GenreService;

public class Main {
	
	private static final ConfigurableApplicationContext context = 
			new ClassPathXmlApplicationContext("/META-INF/applicationContext.xml");
	

	public static void main(String[] args) {

		GenreService genreService = context.getBean(GenreService.class);
		//genreService.save("Comedy");
		System.out.println(genreService.findByName("Drama"));
		context.close();
	}

}
