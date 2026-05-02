package com.Movie_Project.Movie_Tickets.DTO;

import lombok.Data;

@Data
public class SeatLayoutForm {
	private int totalRows;
	private int totalColumns;
	private String category;
}