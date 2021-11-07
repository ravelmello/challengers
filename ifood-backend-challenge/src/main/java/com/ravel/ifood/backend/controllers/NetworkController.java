package com.ravel.ifood.backend.controllers;

import com.ravel.ifood.backend.entities.Restaurant;
import com.ravel.ifood.backend.services.NetworkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
public class NetworkController {

    private final NetworkService networkService;

    @Autowired
    private NetworkController(NetworkService networkService){
        this.networkService = networkService;
    }

    @GetMapping("/api/network/restaurants")
    @ResponseBody
    public List<Restaurant> getNetworkRestaurants(@RequestParam Integer networkId){
        List<Restaurant> restaurants = networkService.listRestaurants(networkId);
        Optional.ofNullable(restaurants).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        return restaurants;

    }
}
