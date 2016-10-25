package com.softserve.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.softserve.service.BookService;

@Controller
public class BookController {
	
	@Autowired
	BookService bookService;

	@RequestMapping("/books")
	public String showBooks(Model model) {
		model.addAttribute("books" , bookService.findAvailableBooks());
		return "books";
	}
	
	
}
