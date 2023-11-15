package com.assigment.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}
}

// Digite 'http://localhost:8080/jogo/resetar' para começar

// Digite 'http://localhost:8080/jogo/adivinhar?tentativa={sua_tentativa}' para tentar adivinhar