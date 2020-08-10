package com.ex1cartoesapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
@EnableJpaAuditing
@ComponentScan(basePackages = "com.ex1cartoesapi")
public class Ex1CartoesApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ex1CartoesApiApplication.class, args);
	}
}
