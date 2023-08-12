package com.Better.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Tasks {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String heading;
    private String description;
    private Integer categoryId;

    public Tasks(String heading, String description, Integer categoryId) {
        this.heading = heading;
        this.description = description;
        this.categoryId = categoryId;
    }
}
