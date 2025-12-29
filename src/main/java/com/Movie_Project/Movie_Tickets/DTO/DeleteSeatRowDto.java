package com.Movie_Project.Movie_Tickets.DTO;

import lombok.Data;

@Data
public class DeleteSeatRowDto {
    private Long screenId;
    private String rowName;
}
