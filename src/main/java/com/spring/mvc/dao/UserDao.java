package com.spring.mvc.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.spring.mvc.dto.LoginDto;
import com.spring.mvc.dto.UserDto;

@Repository
public interface UserDao {

	 void register(UserDto user);
	// UserDto validateUser(LoginDto login);
}
