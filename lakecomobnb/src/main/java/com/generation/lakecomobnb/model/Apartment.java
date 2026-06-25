package com.generation.lakecomobnb.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Apartment {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    
    private String name, address, description;

    @ManyToOne
    @JoinColumn(name="city_id")
    City city;
}
