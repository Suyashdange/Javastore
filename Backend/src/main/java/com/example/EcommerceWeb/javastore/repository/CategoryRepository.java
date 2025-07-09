package com.example.EcommerceWeb.javastore.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.EcommerceWeb.javastore.model.Category;

//JpaRepository gives inbuilt/custom functions which creates sql query itself dont need to write sql query
@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{
    
}
