package com.ravel.ifood.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ravel.ifood.backend.entities.Restaurant;
import com.ravel.ifood.backend.repository.RestaurantRepository;

@SpringBootApplication
public class IfoodBackendChallengeApplication implements CommandLineRunner {

	RestaurantRepository repository;

	@Autowired
	public IfoodBackendChallengeApplication(RestaurantRepository repository){
		this.repository = repository;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(IfoodBackendChallengeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		repository.save(new Restaurant("boladao"));
		
	}

}
