package com.shopwave.service;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.mockito.junit.jupiter.MockitoExtension;

import com.shopwave.exception.ProductNotFoundException;
import com.shopwave.model.Product;
import com.shopwave.repository.ProductRepository;

// ID: ATE/6972/14

@ExtendWith(MockitoExtension.class)
public class ProductServiceTest {

    @Mock
    private ProductRepository productRepository;

    @InjectMocks
    private ProductService productService;

    @Test
    public void testGetProductById_Success() {
        // 1. Arrange (Setup fake data)
        Product mockProduct = new Product();
        mockProduct.setId(1L);
        mockProduct.setName("Test Phone");
        
        when(productRepository.findById(1L)).thenReturn(Optional.of(mockProduct));

        // 2. Act (Call the actual service method)
        Product found = productService.getProductById(1L);

        // 3. Assert (Check if it worked)
        assertNotNull(found);
        assertEquals("Test Phone", found.getName());
        verify(productRepository, times(1)).findById(1L);

        
    }


     @Test
    void testGetProductById_NotFound() {
        // Tell the mock database to return empty when asked for an ID that doesn't exist
        when(productRepository.findById(99L)).thenReturn(Optional.empty());

        // Verify that asking for ID 99 throws our custom 404 exception
        assertThrows(ProductNotFoundException.class, () -> {
            productService.getProductById(99L);
        });
    }
}

