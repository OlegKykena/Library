package com.softserve.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "books")
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String name;

	@Temporal(TemporalType.DATE)
	private Date publishingDate;

	@ManyToOne(fetch = FetchType.LAZY)
	private Author author;
	
	@OneToMany(mappedBy = "book" , cascade = CascadeType.PERSIST )
	private List<Exempliar> exemplars = new ArrayList<>();

	@ManyToOne(fetch = FetchType.LAZY)
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

	public Date getPublishingDate() {
		return publishingDate;
	}

	public void setPublishingDate(Date publishingDate) {
		this.publishingDate = publishingDate;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public List<Exempliar> getExemplars() {
		return exemplars;
	}

	public void setExemplars(List<Exempliar> exemplars) {
		this.exemplars = exemplars;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", publishingDate=" + publishingDate + ", author=" + author
				+ ", genre=" + genre + "]";
	}

	
}