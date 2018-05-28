package com.example.restExceptions;

import java.util.concurrent.ThreadLocalRandom;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerWithException {
	private static final Logger log = LoggerFactory.getLogger(ControllerWithException.class);
	
	@RequestMapping("/exception/{type}")
	String hi(@PathVariable("type") String type) throws Exception {
		if(type.equalsIgnoreCase("normal")) {
			throw new CustomeException("Normal Exception occured");
		}else if(type.equalsIgnoreCase("nonnormal")){
			throw new Exception();
		}else if(type.equalsIgnoreCase("otherclass")) {
			OtherClass oc=new OtherClass();
			oc.checkSomething(type);
		}
		return "exception type is:"+type;
	}

}
