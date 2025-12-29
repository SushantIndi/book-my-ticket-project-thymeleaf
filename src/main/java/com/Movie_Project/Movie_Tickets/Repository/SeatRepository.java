package com.Movie_Project.Movie_Tickets.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;

import com.Movie_Project.Movie_Tickets.Entity.Screen;
import com.Movie_Project.Movie_Tickets.Entity.Seat;

import jakarta.transaction.Transactional;

public interface SeatRepository extends JpaRepository<Seat, Long> {
	List<Seat> findByScreenOrderBySeatRowAscSeatColumnAsc(Screen screen);
	
	@Modifying
    @Transactional
    void deleteByScreenAndSeatRow(Screen screen, String seatRow);

    @Modifying
    @Transactional
    void deleteByScreen(Screen screen);
    
    Seat findBySeatNumber(String seatNumber);
}