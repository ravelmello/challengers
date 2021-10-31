package com.ravel.ifood.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ravel.ifood.backend.entities.Restaurant;
import com.ravel.ifood.backend.repository.RestaurantRepository;

import java.util.List;

@Service
public class RestaurantService {
	

	private final RestaurantRepository repository;

	@Autowired
	public RestaurantService(RestaurantRepository repository){
		this.repository = repository;
	}
	
	 
	public Restaurant recoverRestaurant(Integer id) {
		return repository.findRestaurantById(id);
	}

    public List<Restaurant> getAll() {
		return repository.findAll();
    }
}
