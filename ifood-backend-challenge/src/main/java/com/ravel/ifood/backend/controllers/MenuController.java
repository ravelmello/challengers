package com.ravel.ifood.backend.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.ravel.ifood.backend.entities.Restaurant;
import com.ravel.ifood.backend.services.RestaurantGroupService;
import com.ravel.ifood.backend.services.RestaurantService;



@RestController
public class MenuController {


	private final RestaurantService restaurantService;


	@Autowired
	private MenuController(RestaurantService restaurantService,
			RestaurantGroupService restaurantGroupService ){
		this.restaurantService = restaurantService;
		}

	@GetMapping(value ="/api/restaurant")
	public Restaurant getRestaurant(@RequestParam Integer idRestaurant) {
		Restaurant restaurant = restaurantService.recoverRestaurant(idRestaurant);
		Optional.ofNullable(restaurant).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
		return restaurant;
	}
	


}
