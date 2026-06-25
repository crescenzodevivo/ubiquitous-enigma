package com.generation.lakecomobnb.model;

import java.time.LocalDate;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Booking {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int price;
    private String notes, status;
    private LocalDate arrival, departure;

    @ManyToOne
    @JoinColumn(name = "apartment_id")
    Apartment apartment;
}
