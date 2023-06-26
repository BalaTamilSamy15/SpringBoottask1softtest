package com.studentresults;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class StudentResultApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentResultApplication.class, args);
	}
@Bean
RestTemplate getna() {
	return new RestTemplate();
}
}
