package com.ravel.ifood.backend.services;


import com.ravel.ifood.backend.entities.RestaurantGroup;
import com.ravel.ifood.backend.repository.RestaurantGroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ravel.ifood.backend.repository.RestaurantRepository;

@Service
public class RestaurantGroupService {
	
	private final RestaurantGroupRepository restaurantGroupRepository;

	@Autowired
	public RestaurantGroupService(RestaurantGroupRepository restaurantGroupRepository) {
		this.restaurantGroupRepository = restaurantGroupRepository;
	}
	

	public RestaurantGroup recoveryGroup(Integer id) {
		return restaurantGroupRepository.findRestaurantGroupById(id);
	}
	
	
}
