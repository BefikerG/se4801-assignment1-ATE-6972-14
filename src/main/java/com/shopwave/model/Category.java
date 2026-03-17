package com.shopwave.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;

// ID : ATE/6972/14

@Entity
@Data
@NoArgsConstructor
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; //

    @NotBlank(message = "Please provide a category name.")
    private String name; //

    private String description; //

}
