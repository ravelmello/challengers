package com.ravel.ifood.backend.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "i_item_group")
@Getter
@Setter
public class ItemGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String itemGroupName;

    @OneToOne
    @JoinColumn(name = "restaurant_group_id")
    @JsonIgnore
    private RestaurantGroup restaurantGroup;

    public RestaurantGroup getRestaurantGroup() {
        return restaurantGroup;
    }


}
