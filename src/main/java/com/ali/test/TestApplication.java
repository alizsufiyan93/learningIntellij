package com.ali.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestApplication {

	public static void main(String[] args){

		SpringApplication.run(TestApplication.class, args);
		System.out.println("running");
		System.out.println("123");System.out.println("12345");
		//testing the PR
	}

}
