package com.ravel.ifood.backend.repository;

import com.ravel.ifood.backend.entities.Network;
import com.ravel.ifood.backend.entities.Restaurant;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Repository
public interface NetworkRepository extends CrudRepository<Network, Long> {

    Network findNetworkById(Integer id);
    Network findByNetworkName(String name);


}
