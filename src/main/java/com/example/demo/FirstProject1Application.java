package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstProject1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(FirstProject1Application.class, args);

		Humain h = context.getBean(Humain.class);
		h.show();
//		Humain h1 = context.getBean(Humain.class);
//		h1.show();
	}

}
