package com.Movie_Project.Movie_Tickets.mycontroller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.Movie_Project.Movie_Tickets.DTO.LoginDTO;
import com.Movie_Project.Movie_Tickets.DTO.UserDTO;
import com.Movie_Project.Movie_Tickets.Service.UserService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class UserController {
	
	private final UserService userService;
	
	@GetMapping("/")
	public String loadMain() {
		return "main.html";
	}
	@GetMapping("/register")
	public String loadRegister(UserDTO userDto) {
		return "register.html";
	}

	@PostMapping("/register")
	public String register(@Valid UserDTO userDto, BindingResult result) {
		return userService.register(userDto, result);
	}

	@GetMapping("/login")
	public String loadLogin() {
		return "login.html";
	}
	
	@PostMapping("/login")
	public String login(LoginDTO dto,RedirectAttributes attributes,HttpSession session) {
		return userService.login(dto,attributes,session);
	}
}