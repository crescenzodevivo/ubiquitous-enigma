package com.generation.lakecomobnb.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Region {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private boolean special;
}
