package com.example.EcommerceWeb.javastore.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.EcommerceWeb.javastore.model.Product;
import com.example.EcommerceWeb.javastore.repository.ProductRepository;


//Core buiseness logic
@Service
public class ProductService {
    
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    public List<Product> getProductByCategory(Long categoryId){
        return productRepository.findByCategoryId(categoryId);
    }
}
