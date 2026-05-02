package com.Movie_Project.Movie_Tickets.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Movie_Project.Movie_Tickets.Entity.BookedTicket;
import com.Movie_Project.Movie_Tickets.Entity.User;

public interface TicketRepository extends JpaRepository<BookedTicket, Long> {
	List<BookedTicket> findByUser(User user);
}