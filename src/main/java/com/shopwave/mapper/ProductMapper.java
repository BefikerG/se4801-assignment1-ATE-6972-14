package com.shopwave.mapper;

import org.springframework.stereotype.Component;

import com.shopwave.dto.ProductDTO;
import com.shopwave.model.Product;

// ID : ATE/6972/14
@Component
public class ProductMapper {

    /**
     * Converts a Product Entity (Database) to a ProductDTO (API Response).
     */
    public ProductDTO toDTO(Product product) {
        if (product == null) {
            return null;
        }

        ProductDTO dto = new ProductDTO();
        dto.setId(product.getId());
        dto.setName(product.getName());
        dto.setDescription(product.getDescription());
        dto.setPrice(product.getPrice());
        dto.setStock(product.getStock());

        // Map Category ID if the relationship exists
        if (product.getCategory() != null) {
            dto.setCategoryId(product.getCategory().getId());
        }

        return dto;
    }

    /**
     * Converts a ProductDTO (User Input) to a Product Entity (Database).
     */
    public Product toEntity(ProductDTO dto) {
        if (dto == null) {
            return null;
        }

        Product product = new Product();
        product.setId(dto.getId());
        product.setName(dto.getName());
        product.setDescription(dto.getDescription());
        product.setPrice(dto.getPrice());
        product.setStock(dto.getStock());
        
        // Note: Category association is usually handled in the Service layer
        // by fetching the Category entity via the categoryId from the DTO.

        return product;
    }
}