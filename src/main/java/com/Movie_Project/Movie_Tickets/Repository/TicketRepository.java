package com.Movie_Project.Movie_Tickets.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Movie_Project.Movie_Tickets.Entity.BookedTicket;

public interface TicketRepository extends JpaRepository<BookedTicket, Long> {

}