package com.softserve.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.softserve.dao.BookDAO;
import com.softserve.entity.Book;

@Repository
@Transactional
public class BookDAOImpl extends GenericDAOImpl<Book, Integer> 
		implements BookDAO{

	@PersistenceContext
	private EntityManager entityManager;
	
	protected BookDAOImpl() {
		super(Book.class);
	}
	
	@Override
	public Book findById(Integer id){
		return entityManager.createQuery("SELECT book FROM Book book JOIN fetch "
				+ "book.author author JOIN fetch book.genre genre WHERE "
				+ "book.id = :id", Book.class).setParameter("id", id).getSingleResult();
	}
	
	@Override 
	public List<Book> findAll() {
		return entityManager.createQuery("SELECT book FROM Book book JOIN fetch "
				+ "book.author author JOIN fetch book.genre genre", Book.class)
				.getResultList();
	}

	@Override
	public List<Book> findBooksByGenre(String genre) {
		return entityManager.createQuery("SELECT book FROM Book book JOIN fetch "
				+ "book.author author JOIN fetch book.genre genre WHERE "
				+ "genre.name = :name", Book.class)
				.setParameter("name", genre).getResultList();
	}

	@Override
	public List<Book> findBooksByName(String name) {
		return entityManager.createQuery("SELECT book FROM Book book JOIN fetch "
				+ "book.author author JOIN fetch book.genre genre WHERE "
				+ "book.name = :name", Book.class)
				.setParameter("name", name).getResultList();
	}

	
	@Override
	public List<Book> findBooksByAuthor(String firstName, String lastName) {
		return entityManager.createQuery("SELECT book FROM Book book JOIN fetch "
				+ "book.author author JOIN fetch book.genre genre WHERE "
				+ "author.firstName = :firstName AND "
				+ "author.lastName = :lastName", Book.class)
				.setParameter("firstName", firstName)
				.setParameter("lastName", lastName).getResultList();
	}

	@Override
	public List<Book> findAvailableBooks() {
		return entityManager.createQuery("SELECT DISTINCT book FROM Book book JOIN fetch "
				+ "book.author author JOIN fetch book.genre genre JOIN fetch "
				+ "book.exemplars e WHERE e.isAvaliable = :isAvaliable", Book.class)
				.setParameter("isAvaliable", true).getResultList();
	}

	public List<String> findMostPopularBook() {
		Query result = entityManager.createQuery("SELECT b.name as name , COUNT(*) as freq "
				+ "FROM Exempliar ex "
				+ "JOIN ex.book b JOIN ex.orders ord GROUP BY name ORDER BY freq desc")
				.setMaxResults(1);
		List<Object[]> res = result.getResultList();
		for (Object[] objects : res) {
			String name = (String) objects[0];
			Long count = (Long) objects[1];
			System.out.println(name + " *** " + count);
		}
		return new ArrayList<>();
	}

}
