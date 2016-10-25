package com.softserve.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.softserve.service.AuthorService;
import com.softserve.service.BookService;
import com.softserve.service.GenreService;

@Controller
public class IndexController {
	
	@Autowired
	private BookService bookService;
	
	@Autowired
	private AuthorService authorService;
	
	@Autowired
	private GenreService genreService;

	@RequestMapping("/")
	public String showIndex(){
		return "index";
	}
	
	@RequestMapping("/books")
	public String showBooks(Model model) {
		model.addAttribute("books" , bookService.findAvailableBooks());
		return "books";
	}
	
	@RequestMapping("/authors")
	public String showAuthors(Model model) {
		model.addAttribute("authors" , bookService.findAvailableBooks());
		return "authors";
	}
	
	@RequestMapping("/genres")
	public String showGenres(Model model) {
		model.addAttribute("genres" , genreService.getListSortByAlh());
		return "genres";
	}
}
