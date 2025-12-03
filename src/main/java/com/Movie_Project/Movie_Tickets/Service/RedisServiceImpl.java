package com.Movie_Project.Movie_Tickets.Service;

import java.time.Duration;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.Movie_Project.Movie_Tickets.DTO.UserDTO;

import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class RedisServiceImpl implements RedisService {

	private final RedisTemplate<String, Object> redisTemplate;

	@Override
	@Async
	public void saveUserDto(String email, UserDTO userDto) {
		redisTemplate.opsForValue().set("dto-" + email, userDto, Duration.ofMinutes(2));
	}

	@Override
	@Async
	public void saveOtp(String email, int otp) {
		redisTemplate.opsForValue().set("otp-" + email, otp, Duration.ofSeconds(30));
	}

	@Override
	public UserDTO getDtoByEmail(String email) {
		return (UserDTO) redisTemplate.opsForValue().get("dto-" + email);
	}

	@Override
	public int getOtpByEmail(String email) {
		Object otp = redisTemplate.opsForValue().get("otp-" + email);
		if (otp == null)
			return 0;
		else
			return (int) otp;
	}
}
