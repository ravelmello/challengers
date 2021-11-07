package com.ravel.ifood.backend.services;

import com.ravel.ifood.backend.entities.Network;
import com.ravel.ifood.backend.entities.Restaurant;
import com.ravel.ifood.backend.repository.NetworkRepository;
import com.ravel.ifood.backend.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class NetworkService {

    @Autowired
    NetworkRepository networkRepository;

    @Autowired
    RestaurantRepository restaurantRepository;

    public NetworkService() {
    }

    public Network recoveryById(Integer id){ return networkRepository.findNetworkById(id);  }

    public Network recoveryByName(String name) { return networkRepository.findByNetworkName(name); }

    public Network saveNetwork(Network network){
        return networkRepository.save(network);
    }

    public List<Restaurant> listRestaurants(Integer idNetwork) {
        return restaurantRepository.findByNetworkId(idNetwork);
    }


}
