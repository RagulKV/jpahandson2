package com.ragul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.ragul")
public class Jpahandson1Application {

	public static void main(String[] args) {
		SpringApplication.run(Jpahandson1Application.class, args);
	}

}
