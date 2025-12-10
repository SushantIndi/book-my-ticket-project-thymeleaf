package com.Movie_Project.Movie_Tickets.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Movie_Project.Movie_Tickets.Entity.Theater;

public interface TheaterRepository extends JpaRepository<Theater, Long> {

	boolean existsByNameAndAddress(String name, String address);

}