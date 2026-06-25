package com.generation.lakecomobnb.model;

import java.time.LocalDate;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Guest {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String firstName, lastName, ssn, address;
    private LocalDate dob;

    @ManyToOne
    @JoinColumn(name="city_id")
    City city;
}
