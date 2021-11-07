package com.ravel.ifood.backend.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class OptionGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String nameGroupOption;

    @ManyToOne
    private Restaurant restaurant;

    private boolean isObrigatory;

    private Integer quantity;
}
