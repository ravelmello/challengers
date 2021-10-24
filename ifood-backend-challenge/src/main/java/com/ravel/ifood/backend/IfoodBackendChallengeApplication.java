package com.ravel.ifood.backend;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ravel.ifood.backend.entities.Restaurant;
import com.ravel.ifood.backend.entities.RestaurantGroup;
import com.ravel.ifood.backend.repository.RestaurantRepository;

@SpringBootApplication
public class IfoodBackendChallengeApplication implements CommandLineRunner {

	@Autowired
	EntityManager manager;
	
	RestaurantRepository repository;

	@Autowired
	public IfoodBackendChallengeApplication(RestaurantRepository repository){
		this.repository = repository;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(IfoodBackendChallengeApplication.class, args);
	}

	@Override
	@Transactional
	public void run(String... args) throws Exception {

		RestaurantGroup rg = new RestaurantGroup();
		Restaurant restaurant = new Restaurant();
		
		restaurant.setName("Good pasta");
		manager.persist(restaurant);	
		rg.setNameMenuEntry("Menu delicious");
		
		restaurant.setRestaurantGroup(rg);
		
		manager.merge(restaurant);
		
		manager.close();
		
	}

}
