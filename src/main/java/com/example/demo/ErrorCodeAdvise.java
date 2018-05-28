package com.example.demo;

public enum ErrorCodeAdvise {
	SERIOUS("Contact our help desk"),
	MEDIUM("Try look the code properly"),
	LOW("You should solve it");
	
	String advise;
	private ErrorCodeAdvise(String advise) {
		this.advise=advise;
	}
	
	String advise() {
		return this.advise;
	}

}
