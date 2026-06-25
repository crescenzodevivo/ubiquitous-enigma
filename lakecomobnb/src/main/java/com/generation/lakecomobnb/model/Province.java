package com.generation.lakecomobnb.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Province {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    
    @ManyToOne
    @JoinColumn(name="region_id")
    Region region;
}