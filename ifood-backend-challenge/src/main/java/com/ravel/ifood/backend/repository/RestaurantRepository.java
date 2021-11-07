package com.ravel.ifood.backend.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ravel.ifood.backend.entities.Restaurant;

import java.util.List;

@Repository
public interface RestaurantRepository extends CrudRepository<Restaurant, Integer>{

	Restaurant findRestaurantById(Integer id);
	
	@SuppressWarnings("unchecked")
	Restaurant save(Restaurant r);

	List<Restaurant> findAll();

	List<Restaurant> findByNetworkId(Integer id);

}
