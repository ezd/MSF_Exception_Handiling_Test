package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MsfExceptionHandilingTestApplication {

	@RequestMapping("/")
	public String test() {
		return "testing works";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(MsfExceptionHandilingTestApplication.class, args);
	}
}
