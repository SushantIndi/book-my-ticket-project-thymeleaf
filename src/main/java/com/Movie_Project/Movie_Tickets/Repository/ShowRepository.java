package com.Movie_Project.Movie_Tickets.Repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Movie_Project.Movie_Tickets.Entity.Movie;
import com.Movie_Project.Movie_Tickets.Entity.Screen;
import com.Movie_Project.Movie_Tickets.Entity.Show;

public interface ShowRepository extends JpaRepository<Show, Long> {
	List<Show> findByScreen(Screen screen);
	
	List<Show> findByShowDateAfter(LocalDate minusDays);

	List<Show> findByMovieAndShowDateAfter(Movie movie, LocalDate minusDays);
}
