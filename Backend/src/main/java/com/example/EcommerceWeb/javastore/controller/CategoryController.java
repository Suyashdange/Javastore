package com.example.EcommerceWeb.javastore.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.EcommerceWeb.javastore.model.Category;
import com.example.EcommerceWeb.javastore.service.CategoryService;

//Rest api return json not html
@RestController
@RequestMapping("/api/categories")
@CrossOrigin(origins = "http://localhost:3000")
public class CategoryController {
    

    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }
    

    @GetMapping
     public List<Category> getAllCategories(){
        return categoryService.getAllCategories();
     }
}
