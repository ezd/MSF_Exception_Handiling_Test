package com.example.restExceptions;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes;

public class APIExceptionResponse {
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern= "dd-MM-yyyy hh:mm:ss")
	private LocalDateTime timestamp;
	private String message;
	private String debugMessage;
	

	public LocalDateTime getTimestamp() {
		return timestamp;
	}


	public String getMessage() {
		return message;
	}


	public String getDebugMessage() {
		return debugMessage;
	}


	public APIExceptionResponse() {
		super();
		this.timestamp = LocalDateTime.now();
	}

	
	public APIExceptionResponse(Throwable ex) {
		this();
		this.message= "Exception occured";
		this.debugMessage=ex.getLocalizedMessage();
	}
	public APIExceptionResponse(String message, Throwable ex) {
		this();
		this.message= message;
		this.debugMessage=ex.getLocalizedMessage();
	}
	
	
	
	
	
	
	
	
}
