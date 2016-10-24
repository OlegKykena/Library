package com.softserve.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.softserve.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Integer>{

}
