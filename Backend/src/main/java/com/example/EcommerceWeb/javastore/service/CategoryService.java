package com.example.EcommerceWeb.javastore.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.EcommerceWeb.javastore.model.Category;
import com.example.EcommerceWeb.javastore.repository.CategoryRepository;

//Core buiseness logic
@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<Category> getAllCategories() {

        return categoryRepository.findAll();
    }
    
}
