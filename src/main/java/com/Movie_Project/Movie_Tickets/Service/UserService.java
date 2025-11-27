package com.Movie_Project.Movie_Tickets.Service;

import org.springframework.validation.BindingResult;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.Movie_Project.Movie_Tickets.DTO.LoginDTO;
import com.Movie_Project.Movie_Tickets.DTO.UserDTO;

import jakarta.servlet.http.HttpSession;

public interface UserService {
	String register(UserDTO userDto, BindingResult result);

	String login(LoginDTO dto, RedirectAttributes attributes,HttpSession session);
}