package com.generation.lakecomobnb.model;

import java.util.List;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class City {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    
    @ManyToOne
    @JoinColumn(name="province_id")
    Province province;

    @OneToMany(mappedBy = "city")
    List<Apartment> apartments;
}