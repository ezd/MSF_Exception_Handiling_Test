package com.example.restExceptions;

import org.springframework.stereotype.Component;

public class CustomeException extends Exception {
	
	String message;
	
	public CustomeException(String message) {
		super();
		this.message = message;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
	

}
