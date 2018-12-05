package com.tan.SimpleSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class SimpleSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleSpringApplication.class, args);
	}
}
