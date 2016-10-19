package com.softserve.library.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "book")
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "name")
	private String name;

	@Column(name = "publishingDate")
	private LocalDate publishingDate;

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "Book_Author", joinColumns = 
	@JoinColumn(name = "book_id"), inverseJoinColumns = 
	@JoinColumn(name = "author_id"))
	private List<Author> authors = new ArrayList<>();
	
	@OneToMany(mappedBy = "book")
	private Set<Order> orders = new HashSet<>();
	
	@OneToMany(mappedBy = "book", fetch = FetchType.EAGER)
	List<Exemplar> exemplars = new ArrayList<>();

	@ManyToOne
	@JoinColumn(name = "genre_id")
	private Genre genre;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public List<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}

	public LocalDate getPublishingDate() {
		return publishingDate;
	}

	public void setPublishingDate(LocalDate publishingDate) {
		this.publishingDate = publishingDate;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", publishingDate=" + publishingDate + ", authors=" + authors
				+ ", orders=" + orders + ", exemplars=" + exemplars + ", genre=" + genre + "]";
	}

	

}