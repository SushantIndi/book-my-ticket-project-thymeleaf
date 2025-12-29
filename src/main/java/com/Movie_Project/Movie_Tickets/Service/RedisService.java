package com.Movie_Project.Movie_Tickets.Service;

import com.Movie_Project.Movie_Tickets.DTO.UserDto;
import com.Movie_Project.Movie_Tickets.Entity.BookedTicket;

public interface RedisService {

	void saveUserDto(String email, UserDto userDto);

	void saveOtp(String email, int otp);

	UserDto getDtoByEmail(String email);

	int getOtpByEmail(String email);
	
	void saveTicket(String id, BookedTicket ticket);

	BookedTicket getTicket(String razorpay_order_id);

}