package com.studentmarksheet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class StudentMarkSheetApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentMarkSheetApplication.class, args);
	}
@Bean
 RestTemplate getRaw()
{
	return new RestTemplate();
	}
}