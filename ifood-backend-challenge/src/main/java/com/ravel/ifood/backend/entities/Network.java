package com.ravel.ifood.backend.entities;

import lombok.*;
import org.hibernate.Hibernate;
import org.hibernate.annotations.Fetch;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;


@Entity
@Getter
@Setter
@Table(name = "i_network")
public class Network implements Serializable {


    /**
     * Default serial version UI
     */
    private static final long serialVersionUID = 1L;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private @Id
    Integer id;

    private String networkName;

    public Network(){}

    public Network(String networkName) {
        this.networkName = networkName;
    }

    public Network(int id, String networkName) {
        this.id = id;
        this.networkName = networkName;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Network network = (Network) o;
        return Objects.equals(id, network.id);
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
