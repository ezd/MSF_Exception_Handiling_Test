package com.example.demo;

public class MyCheckedExceptionHandler extends Exception {
	
	private static final long serialVersionUID = 1L;
	ErrorCodeAdvise errorCodeAdvise;	
	
	public MyCheckedExceptionHandler(String messege,ErrorCodeAdvise errorCodeAdvise) {
		super(messege+" \n Advise is:"+errorCodeAdvise.advise);
		this.errorCodeAdvise=errorCodeAdvise;
	}

	public MyCheckedExceptionHandler(String message, Throwable cause,ErrorCodeAdvise errorCodeAdvise) {
		super(message+" \n Advise is:"+errorCodeAdvise.advise, cause);
		this.errorCodeAdvise=errorCodeAdvise;
	}

	public MyCheckedExceptionHandler(Throwable cause,ErrorCodeAdvise errorCodeAdvise) {
		super(cause);
		this.errorCodeAdvise=errorCodeAdvise;
		
	}
	

}
