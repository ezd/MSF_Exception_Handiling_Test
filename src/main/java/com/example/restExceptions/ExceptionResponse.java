package com.example.restExceptions;

import org.springframework.stereotype.Component;

@Component
public class ExceptionResponse {

	String message;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
}
