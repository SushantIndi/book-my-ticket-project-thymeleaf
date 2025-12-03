package com.Movie_Project.Movie_Tickets.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Movie_Project.Movie_Tickets.Entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	boolean existsByEmail(String email);

	void deleteByRole(String string);
	
	User findByEmail(String email);
	
	boolean existsByMobile(Long mobile);
	
	List<User> findByRole(String string);
}