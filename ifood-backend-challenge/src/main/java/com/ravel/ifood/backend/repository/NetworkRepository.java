package com.ravel.ifood.backend.repository;

import com.ravel.ifood.backend.entities.Network;
import org.springframework.data.repository.CrudRepository;

public interface NetworkRepository extends CrudRepository<Network, Long> {

    Network findNetworkById(Integer id);
    Network findByNetworkName(String name);
}
