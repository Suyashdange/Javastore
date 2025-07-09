package com.example.EcommerceWeb.javastore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.EcommerceWeb.javastore.model.Product;

//JpaRepository gives inbuilt/custom functions which creates sql query itself dont need to write sql query
@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{
    List<Product> findByCategoryId(Long categoryId);
    
}
