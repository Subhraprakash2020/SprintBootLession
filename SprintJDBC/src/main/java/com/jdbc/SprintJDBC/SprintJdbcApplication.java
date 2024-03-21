package com.jdbc.SprintJDBC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class SprintJdbcApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =  SpringApplication.run(SprintJdbcApplication.class, args);
		Alien alien1 = context.getBean(Alien.class);
		// Add data in database
		
		alien1.setId(113);
		alien1.setName("Rock");
		alien1.setTech("SL");
		
		AlienRepo repo = context.getBean(AlienRepo.class);
//		repo.save(alien1);
		
		//Show data from databse
		System.out.println(repo.findAll());
		
		//Delete data from databse
//		repo.delete(113);
		
		//Update data in database
		repo.update(112, "rock");
		
	}

}
