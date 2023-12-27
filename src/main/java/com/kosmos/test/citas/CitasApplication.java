package com.kosmos.test.citas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.kosmos.test.citas.controllers")
public class CitasApplication {
	public static void main(String[] args) {
		SpringApplication.run(CitasApplication.class, args);
	}
}
