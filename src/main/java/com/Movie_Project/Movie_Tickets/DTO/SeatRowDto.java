package com.Movie_Project.Movie_Tickets.DTO;

import lombok.Data;

@Data
public class SeatRowDto {
	private String rowName;
	private Integer totalSeats;
	private String category;
}