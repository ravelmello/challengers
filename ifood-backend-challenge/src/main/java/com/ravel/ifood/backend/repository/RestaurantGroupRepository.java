package com.ravel.ifood.backend.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ravel.ifood.backend.entities.RestaurantGroup;

import javax.persistence.criteria.CriteriaBuilder;

@Repository
public interface RestaurantGroupRepository extends CrudRepository<RestaurantGroup, Integer>{

	@SuppressWarnings("unchecked")
	RestaurantGroup save(RestaurantGroup rg);

	RestaurantGroup findRestaurantGroupById(Integer id);
	
	
}
