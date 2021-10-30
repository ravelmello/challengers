package com.ravel.ifood.backend;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import com.ravel.ifood.backend.entities.Network;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ravel.ifood.backend.entities.Restaurant;
import com.ravel.ifood.backend.entities.RestaurantGroup;
import com.ravel.ifood.backend.repository.RestaurantRepository;

import java.util.ArrayList;
import java.util.List;

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
		Network network = new Network("Ifood");
		manager.persist(network);
		restaurant.setName("Good pasta");

		rg.setNameMenuEntry("Menu delicious");
		restaurant.setRestaurantGroup(rg);
		restaurant.setNetwork(network);
		manager.persist(restaurant);
		manager.close();
		
	}

}
