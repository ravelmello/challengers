package com.ravel.ifood.backend.models;


import com.ravel.ifood.backend.entities.Network;
import com.ravel.ifood.backend.repository.NetworkRepository;
import com.ravel.ifood.backend.services.NetworkService;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class NetworkTest {

    Network network = new Network(1, "ifood");

    @TestConfiguration
    static class NetworkServiceConf {
        @Bean
        public NetworkService networkService(){
            return new NetworkService();
        }
    }

    @Autowired
    NetworkService networkService;

    @MockBean
    NetworkRepository networkRepository;

    @Before
    public void setup(){

        Mockito.when(networkRepository.findByNetworkName(network.getNetworkName())).thenReturn(network);
    }

    @Test
    public void verifyIfExistsNetwork(){
        String name = network.getNetworkName();
        Network networkTest = networkService.recoveryByName(name);
        Assertions.assertEquals(name, networkTest.getNetworkName());
    }

}
