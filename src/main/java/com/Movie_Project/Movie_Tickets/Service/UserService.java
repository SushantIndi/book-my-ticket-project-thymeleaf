package com.Movie_Project.Movie_Tickets.Service;

import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.Movie_Project.Movie_Tickets.DTO.LoginDTO;
import com.Movie_Project.Movie_Tickets.DTO.PasswordDTO;
import com.Movie_Project.Movie_Tickets.DTO.UserDTO;

import jakarta.servlet.http.HttpSession;

public interface UserService {
	String register(UserDTO userDto, BindingResult result, RedirectAttributes attributes);

	String login(LoginDTO dto, RedirectAttributes attributes,HttpSession session);
	
	String logout(HttpSession session, RedirectAttributes attributes);
	
	String submitOtp(int otp, String email, RedirectAttributes attributes);
	
	String resendOtp(String email, RedirectAttributes attributes);

	String forgotPassword(String email, RedirectAttributes attributes);

	String resetPassword(PasswordDTO passwordDto, BindingResult result, RedirectAttributes attributes, ModelMap map);
	
	String manageUsers(HttpSession session, RedirectAttributes attributes, ModelMap map);

	String blockUser(Long id,HttpSession session, RedirectAttributes attributes);

	String unBlockUser(Long id, HttpSession session, RedirectAttributes attributes);
}