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
		System.out.println(o.averageReadingTimeByBook("c"));
		// System.out.println(o.findById(1));
		// System.out.println(o.findAllOrdersByCustomer(i.findById(1)));

		// GenreService genreService = context.getBean(GenreService.class);
		ExempliarDAO edao = context.getBean(ExempliarDAO.class);
		BookDAO bdao = context.getBean(BookDAO.class);
		CustomerDAO cdao = context.getBean(CustomerDAO.class);
		OrderDAO odao = context.getBean(OrderDAO.class);

		/*
		 * Order order = new Order(); order.setCustomer(cdao.findById(1));
		 * order.setExempliar(edao.findById(7)); order.setTakingDate(new
		 * Date(116,05,02)); odao.save(order);
		 */

		// System.out.println(odao.findAll());

		/*
		 * AuthorDAO adao = context.getBean(AuthorDAO.class); GenreDAO gdao =
		 * context.getBean(GenreDAO.class);
		 */

		/*
		 * Exempliar ex = new Exempliar(); ex.setAvaliable(false);
		 * ex.setBook(bdao.findById(3)); edao.save(ex);
		 */

		// System.out.println(bdao.findBooksByGenre("Comedy"));

		/*
		 * Book book = new Book(); book.setAuthor(adao.findById(5));
		 * book.setGenre(gdao.findById(2)); book.setPublishingDate(new
		 * Date(115,01,12)); book.setName("Tom Sawyer"); bdao.save(book);
		 */

		context.close();

	}

}
