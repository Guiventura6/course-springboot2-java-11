package com.guiconsultoria.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guiconsultoria.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

	
	
}
