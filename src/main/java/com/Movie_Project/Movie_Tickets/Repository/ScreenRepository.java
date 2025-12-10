package com.Movie_Project.Movie_Tickets.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Movie_Project.Movie_Tickets.Entity.Screen;
import com.Movie_Project.Movie_Tickets.Entity.Theater;

public interface ScreenRepository extends JpaRepository<Screen, Long> {

	List<Screen> findByTheater(Theater theater);

	boolean existsByNameAndTheater(String name, Theater theater);

}