package com.test5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Test5Application {
	int x  = 100;
    String s = "mike";
	public static void main(String[] args) {
		SpringApplication.run(Test5Application.class, args);
	}

}
