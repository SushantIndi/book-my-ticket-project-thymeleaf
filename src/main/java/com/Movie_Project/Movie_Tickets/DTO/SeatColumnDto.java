package com.Movie_Project.Movie_Tickets.DTO;

import lombok.Data;

@Data
public class SeatColumnDto {
	private String name;     // 1, 2, L, R
	private Double price;    // optional, future-proof
}
