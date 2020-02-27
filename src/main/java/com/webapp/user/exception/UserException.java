package com.webapp.user.exception;

public class UserException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2848149069538400988L;
	
	public static final String USERNAME_TAKEN = "Username is already taken!";
	public static final String USERNAME_NOT_FOUND = "Username not found!";
	public static final String PASSWORD_INVALID = "Password is invalid!";
	public static final String PASSWORD_INCORRECT = "Password is incorrect!";
	
	
	public UserException(String message) {
		super(message);
	}
	
	public UserException(String message, Throwable cause) {
		super(message,cause);
	}
	

}
