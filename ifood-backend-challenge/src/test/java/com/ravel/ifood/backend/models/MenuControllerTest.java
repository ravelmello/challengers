package com.ravel.ifood.backend.models;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
@RunWith(SpringRunner.class)
public class MenuControllerTest {

   @Autowired
   MockMvc mockMvc;

    @Test
    public void testGetRestaurants() throws Exception {
        mockMvc.perform(get("/api/restaurant/list")).andExpect(status().isOk());
    }

    //TODO realizar os testes dos próximos passos do app
}
