package com.guiconsultoria.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guiconsultoria.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

	
	
}
