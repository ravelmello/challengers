package com.ravel.ifood.backend.services;

import com.ravel.ifood.backend.entities.Network;
import com.ravel.ifood.backend.repository.NetworkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class NetworkService {

    @Autowired
    NetworkRepository networkRepository;

    public NetworkService() {
    }

    public Network recoveryById(Integer id){ return networkRepository.findNetworkById(id);  }

    public Network recoveryByName(String name) { return networkRepository.findByNetworkName(name); }

    public Network saveNetwork(Network network){
        return networkRepository.save(network);
    }


}
