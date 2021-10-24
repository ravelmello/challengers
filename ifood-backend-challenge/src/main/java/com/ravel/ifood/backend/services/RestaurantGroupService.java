package com.ravel.ifood.backend.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ravel.ifood.backend.repository.RestaurantRepository;

@Service
public class RestaurantGroupService {
	
	private final RestaurantRepository repository;

	@Autowired
	public RestaurantGroupService(RestaurantRepository repository) {
		this.repository = repository;
	}
	
	
	
	public RestaurantGroupService recoveryGroup(Integer id) {
		return null;
		
	}
	
	
}
