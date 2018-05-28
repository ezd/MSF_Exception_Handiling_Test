package com.example.restExceptions;

public class OtherClass {
	
	public String checkSomething(String param) throws CustomeException {
		if(param.equalsIgnoreCase("otherclass")) {
			throw new CustomeException("exception occured in other class");
		}
		return "checked";
	}

}
