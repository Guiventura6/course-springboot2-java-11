package com.guiconsultoria.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guiconsultoria.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	
	
}
