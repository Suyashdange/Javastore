package com.example.EcommerceWeb.javastore.config;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.EcommerceWeb.javastore.model.Category;
import com.example.EcommerceWeb.javastore.model.Product;
import com.example.EcommerceWeb.javastore.repository.CategoryRepository;
import com.example.EcommerceWeb.javastore.repository.ProductRepository;

//Creates dummy data
@Component //meaning it will be automatically created, initialized, and injected when your application starts.
public class DataSeeder implements CommandLineRunner{

    private final CategoryRepository categoryRepository;
    private final ProductRepository productRepository;

    public DataSeeder(CategoryRepository categoryRepository, ProductRepository productRepository) {
        this.categoryRepository = categoryRepository;
        this.productRepository = productRepository;
    }


    @Override
    public void run(String... args) throws Exception {
        //clear existing data
        productRepository.deleteAll();
        categoryRepository.deleteAll();
        

        //Create categories
        Category electronics = new Category();
        electronics.setName("Electronics");

        Category clothing = new Category();
        clothing.setName("Clothing");

        Category home = new Category();
        home.setName("Home and Kitchen");
        
        categoryRepository.saveAll(Arrays.asList(electronics,clothing,home));

        //create products
        Product phone = new Product();
        phone.setName("Smartphone");
        phone.setDescription("Newly upgraded smartphone with high features");
        phone.setPrice(345.00);
        phone.setImageUrl("https://placehold.co/600x400");
        phone.setCategory(electronics);

        Product laptop = new Product();
        laptop.setName("Laptop");
        laptop.setDescription("Smart Laptop with high features");
        laptop.setPrice(945.00);
        laptop.setImageUrl("https://placehold.co/600x400");
        laptop.setCategory(electronics);

        Product jacket = new Product();
        jacket.setName("Jacket");
        jacket.setDescription("Cozy Jacket");
        jacket.setPrice(145.00);
        jacket.setImageUrl("https://placehold.co/600x400");
        jacket.setCategory(clothing);

        Product blender = new Product();
        blender.setName("Blender");
        blender.setDescription("Blender for kitchen use");
        blender.setPrice(15.00);
        blender.setImageUrl("https://placehold.co/600x400");
        blender.setCategory(home);

        productRepository.saveAll(Arrays.asList(phone,laptop,jacket,blender));

    }
    
}
