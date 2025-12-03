package com.Movie_Project.Movie_Tickets.Service;

import com.Movie_Project.Movie_Tickets.DTO.UserDTO;

public interface RedisService {

	void saveUserDto(String email, UserDTO userDto);

	void saveOtp(String email, int otp);

	UserDTO getDtoByEmail(String email);

	int getOtpByEmail(String email);

}