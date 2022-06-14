package com.co.softworld;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NameApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(NameApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String java_Variable = "hi";
		String GT = "test";
		System.out.println("This is a test");
	}
}
