package com.example.FirstProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =  SpringApplication.run(FirstProjectApplication.class, args);
		Alien a = context.getBean(Alien.class);
		a.show();
		
//		Laptop l = context.getBean(Laptop.class);
//		l.show();
	}

}
