package com.example.demo;

import org.mockito.internal.progress.ArgumentMatcherStorageImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@ComponentScan("com.example.*")
public class MsfExceptionHandilingTestApplication {

	@RequestMapping("/")
	public String test() {
		return "testing works";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(MsfExceptionHandilingTestApplication.class, args);
		String name="ezedin";
		int age=2;
		int bmw=0;
		int height=1;
		
		try {
		bmw=age/height;
		if("".equals(name)) {
			throw new MyCheckedExceptionHandler("name is null", ErrorCodeAdvise.LOW);
		}
		}catch (MyCheckedExceptionHandler e) {
			e.printStackTrace();
		}catch (ArithmeticException e) {
			try {
				throw new MyCheckedExceptionHandler("arthimetic exception happend",e,ErrorCodeAdvise.SERIOUS);
			} catch (MyCheckedExceptionHandler e1) {
				e1.printStackTrace();
				System.out.println("after stacktrace");
			}
		}
		System.out.println(" The system is now back on track");
	}
}
