package com.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com")
public class App5Application {

	public static void main(String[] args) {
		SpringApplication.run(App5Application.class, args);
	}
}
