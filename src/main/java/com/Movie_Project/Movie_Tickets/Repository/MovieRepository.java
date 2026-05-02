package com.Movie_Project.Movie_Tickets.Repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Movie_Project.Movie_Tickets.Entity.Movie;


public interface MovieRepository extends JpaRepository<Movie, Long> {

	boolean existsByNameAndReleaseDate(String name, LocalDate releaseDate);
	
	List<Movie> findByReleaseDateGreaterThanEqual(LocalDate date);

}