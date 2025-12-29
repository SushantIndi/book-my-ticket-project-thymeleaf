package com.Movie_Project.Movie_Tickets.DTO;

import java.util.List;
import lombok.Data;

@Data
public class SeatRowDto {
	private String rowName;
	private String category;
	private List<SeatColumnDto> columns;
}
