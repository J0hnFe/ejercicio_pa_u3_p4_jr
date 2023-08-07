package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EjercicioPaU3P4JrApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(EjercicioPaU3P4JrApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Commit inicial");
	}

}
