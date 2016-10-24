package com.softserve.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.softserve.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
