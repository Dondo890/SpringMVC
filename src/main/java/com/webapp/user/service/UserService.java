package com.webapp.user.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webapp.user.dao.UserDao;
import com.webapp.user.dto.UserDto;
import com.webapp.user.exception.UserException;

@Service
public class UserService {
	
	@Autowired
	private UserDao userDao;
	
	public String insertUserService(UserDto userDto) {
		
		String response = "Register successful! You may now login.";
		
		try {
			userDao.insertUser(userDto);
		}catch(UserException userException) {
			response = userException.getMessage();
		}
		
		return response;
		
	}
	
	public HashMap<String,Object> loginUserService(String username,
			String password){
		HashMap<String,Object>responseList = new HashMap<>();
		
		try {
			responseList.put("user", userDao.loginUser(username, password));
		}catch(UserException userException) {
			responseList.put("response", userException.getMessage());
		}
		
		return responseList;
	}

}
