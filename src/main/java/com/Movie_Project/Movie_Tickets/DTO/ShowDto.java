package com.Movie_Project.Movie_Tickets.DTO;

import java.time.LocalDate;
import java.time.LocalTime;

import lombok.Data;

@Data
public class ShowDto {
	private LocalDate showDate;
	private LocalTime startTime;
	private Long movieId;
	private Double ticketPrice;
	private Long screenId;
}
