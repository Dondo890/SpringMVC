package com.webapp.user.dao;

import java.util.Objects;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webapp.user.domain.User;
import com.webapp.user.dto.UserDto;
import com.webapp.user.exception.UserException;
import com.webapp.user.repository.UserRepository;

@Service
public class UserDao {
	
	@Autowired
	private UserRepository userRepository;
	
	//private final String REGEX_PATTERN = "(?=.*[a-z]{1,})(?=.*[A-Z]{1,})(?=.*[0-9]{1,})(?=.*[\\W]{1,})";
	
	public void insertUser(UserDto userDto) throws UserException {
		
		//If Username is taken
		if(Objects.nonNull(userRepository.findUserByUsername(userDto.getUsername()))) {
			throw new UserException(UserException.USERNAME_TAKEN);
		}
		User userToPersist = new User();
		userToPersist.setAddress(userDto.getAddress());
		userToPersist.setAge(userDto.getAge());
		userToPersist.setFirstName(userDto.getFirstName());
		userToPersist.setLastName(userDto.getLastName());
		userToPersist.setPassword(userDto.getPassword());
		userToPersist.setSeller(userDto.isSeller());
		userToPersist.setUsername(userDto.getUsername());
		userRepository.save(userToPersist);
	}
	
	public UserDto loginUser(String username, String password) throws UserException{
		
		User user = userRepository.findUserByUsername(username);
		
		// If username does not exist
		if(Objects.isNull(user)) {
			throw new UserException(UserException.USERNAME_NOT_FOUND);
		}
		
		if(!StringUtils.equals(user.getPassword(), password)) {
			throw new UserException(UserException.PASSWORD_INCORRECT);
		}
		
		UserDto userDto = new UserDto(user);
		
		return userDto;
		
	}
	
}
