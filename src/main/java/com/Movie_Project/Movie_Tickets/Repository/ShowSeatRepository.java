package com.Movie_Project.Movie_Tickets.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Movie_Project.Movie_Tickets.Entity.Seat;
import com.Movie_Project.Movie_Tickets.Entity.ShowSeat;

public interface ShowSeatRepository extends JpaRepository<ShowSeat, Long> {

	List<ShowSeat> findBySeatIn(List<Seat> seats);

}