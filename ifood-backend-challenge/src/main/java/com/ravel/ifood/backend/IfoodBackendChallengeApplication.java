package com.ravel.ifood.backend;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import com.ravel.ifood.backend.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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

		Network network = new Network("Ifood");
		Restaurant restaurant = new Restaurant();
		RestaurantGroup rg = new RestaurantGroup();

		ItemGroup itemGroup = new ItemGroup();
		OptionGroup op = new OptionGroup();

		//persist network
		manager.persist(network);

		// setting the restaurant
		restaurant.setName("083 Burger");
		rg.setNameMenuEntry("Hamburgers");
		restaurant.setRestaurantGroup(rg);
		restaurant.setNetwork(network);

		//setting the item group
		itemGroup.setItemGroupName("Cabra da Peste");
		itemGroup.setRestaurantGroup(rg);

		op.setRestaurant(restaurant);
		op.setObrigatory(false);


		rg.setItemGroup(itemGroup);
		manager.persist(itemGroup);
		manager.persist(op);
		manager.persist(restaurant);
		manager.close();
		
	}

}
