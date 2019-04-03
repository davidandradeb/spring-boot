package com.dyalogo.example.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;


/**
 * Para ejecutar con otro entorno de programacion
 *  --spring.config.location=///Users/davidandrade/Downloads/example/target/config/application.properties
 *
 *
 */

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.dyalogo.example.example.repos")
@EnableScheduling
public class ExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExampleApplication.class, args);
	}

}
