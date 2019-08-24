package com.demo.springboot.jpa.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class SprintBootApplicationStarter {

	
	public static void main(String[] args) {

		SpringApplication.run(SprintBootApplicationStarter.class, args);
	}

}
