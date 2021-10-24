package com.ravel.ifood.backend.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ravel.ifood.backend.entities.RestaurantGroup;

@Repository
public interface RestaurantGroupRepository extends CrudRepository<RestaurantGroup, Integer>{

	@SuppressWarnings("unchecked")
	RestaurantGroup save(RestaurantGroup rg);
	
	
}
