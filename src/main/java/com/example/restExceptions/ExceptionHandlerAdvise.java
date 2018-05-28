package com.example.restExceptions;

import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandlerAdvise {
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ExceptionResponse> gennericException(Exception e){
		ExceptionResponse response=new ExceptionResponse();
		response.setMessage("Genneric response cause is:"+e.getMessage());
		return new ResponseEntity<ExceptionResponse>(response,HttpStatus.CONFLICT);
	}
	@ExceptionHandler(CustomeException.class)
	public ResponseEntity<APIExceptionResponse> customeException(CustomeException e){
		APIExceptionResponse response= new APIExceptionResponse("exception:"+e.getMessage(),e);
		
		return new ResponseEntity<APIExceptionResponse>(response,HttpStatus.CONFLICT);
	}

}
