package com.softserve.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "orders")
public class Order {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Customer customer;

	@ManyToOne(fetch = FetchType.LAZY)
	private Exempliar exempliar;
	
	@Temporal(TemporalType.DATE)
	private Date takingDate;
	
	@Temporal(TemporalType.DATE)
	private Date returningDate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Exempliar getExempliar() {
		return exempliar;
	}

	public void setExempliar(Exempliar exempliar) {
		this.exempliar = exempliar;
	}

	public Date getTakingDate() {
		return takingDate;
	}

	public void setTakingDate(Date takingDate) {
		this.takingDate = takingDate;
	}

	public Date getReturningDate() {
		return returningDate;
	}

	public void setReturningDate(Date returningDate) {
		this.returningDate = returningDate;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", customer=" + customer + ", exempliar=" + exempliar + ", takingDate=" + takingDate
				+ ", returningDate=" + returningDate + "]";
	}

	
}