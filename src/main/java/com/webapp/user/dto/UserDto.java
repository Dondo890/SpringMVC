package com.webapp.user.dto;

import java.util.UUID;

import com.webapp.user.domain.User;

public class UserDto{
	

	private UUID uuid;
	
	private String username;
	
	private String password;
	
	private String firstName;
	
	private String lastName;
	
	private int age;
	
	private String address;
	
	private boolean isSeller;
	
	public UserDto() {}
	
	public UserDto(User user) {
		
		this.username = user.getUsername();
		this.address = user.getAddress();
		this.firstName = user.getFirstName();
		this.lastName = user.getLastName();
		this.isSeller = user.isSeller();
		this.age = user.getAge();
		this.uuid = user.getUuid();
	}

	public UserDto(String username, String password, String firstName, String lastName, int age, String address,
			boolean isSeller) {
		super();
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.address = address;
		this.isSeller = isSeller;
	}

	public UUID getUuid() {
		return uuid;
	}

	public void setUuid(UUID uuid) {
		this.uuid = uuid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public boolean isSeller() {
		return isSeller;
	}

	public void setSeller(boolean isSeller) {
		this.isSeller = isSeller;
	}
	
	
	
}
