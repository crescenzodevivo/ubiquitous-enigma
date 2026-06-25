package com.generation.lakecomobnb.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class ApartmentPrice {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private int startMonth, endMonth, price;

    @ManyToOne
    @JoinColumn(name="apartment_id")
    Apartment apartment;
}
