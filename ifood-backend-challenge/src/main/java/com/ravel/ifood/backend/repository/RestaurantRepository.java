package com.ravel.ifood.backend.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ravel.ifood.backend.entities.Restaurant;

@Repository
public interface RestaurantRepository extends CrudRepository<Restaurant, Integer>{

	Restaurant findRestaurantById(Integer id);
	
	@SuppressWarnings("unchecked")
	Restaurant save(Restaurant r);
	

}
