package com.shopwave.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Positive;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.time.LocalDateTime;

// ID : ATE/6972/14

@Entity
@Data
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Primary key

    private String name; // Display name

    @Column(length = 1000)
    private String description;

    @Positive(message = "Price must be a positive value.")
    private BigDecimal price;

    @Min(0)
    private Integer stock;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private Category category; //

    private LocalDateTime createdAt;

    // This is a custom lifecycle hook i added to ensure the timestamp is set
    // automatically
    @PrePersist
    protected void onCreate() {
        this.createdAt = LocalDateTime.now();
    }
}