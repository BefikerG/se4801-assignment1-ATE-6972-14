package com.shopwave.service;

import com.shopwave.model.Product;
import com.shopwave.repository.ProductRepository;
import com.shopwave.exception.ProductNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

// ID: ATE/6972/14

//Annotated at class level with @Service and @Transactional.

@Service
@Transactional
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Transactional(readOnly = true)
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Transactional(readOnly = true)
    public Product getProductById(Long id) {
        return productRepository.findById(id)
                .orElseThrow(() -> new ProductNotFoundException("Product not found with ID: " + id));
    }

    // ADDED: Needed for the Controller's POST method
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    // ADDED: Needed for the Controller's DELETE method
    public void deleteProduct(Long id) {
        if (!productRepository.existsById(id)) {
            throw new ProductNotFoundException("Cannot delete. ID " + id + " not found.");
        }
        productRepository.deleteById(id);
    }

    public void updateStock(Long id, int quantityChange) {
        Product product = getProductById(id);
        int finalStock = product.getStock() + quantityChange;

        if (finalStock < 0) {
            throw new IllegalArgumentException("Final stock cannot be negative. Current stock: "
                    + product.getStock() + ", attempted change: " + quantityChange);
        }

        product.setStock(finalStock);
        productRepository.save(product);
    }
}
