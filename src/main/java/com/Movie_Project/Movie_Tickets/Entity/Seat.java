package com.Movie_Project.Movie_Tickets.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Seat {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String seatNumber;   // A1, B2
	private String seatRow;      // A, B
	private String seatColumn;   // 1, 2, L
	private String category;

	@ManyToOne
	private Screen screen;
}