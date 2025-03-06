package com.spring.jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringWithJenkinsApplication {
	
	@GetMapping
	public String message() {
		return "Hello Jenkins";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringWithJenkinsApplication.class, args);
	}

}
