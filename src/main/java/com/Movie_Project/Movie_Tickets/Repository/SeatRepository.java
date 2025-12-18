package com.Movie_Project.Movie_Tickets.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Movie_Project.Movie_Tickets.Entity.Screen;
import com.Movie_Project.Movie_Tickets.Entity.Seat;

public interface SeatRepository extends JpaRepository<Seat, Long> {
	List<Seat> findByScreenOrderBySeatRowAscSeatColumnAsc(Screen screen);
}