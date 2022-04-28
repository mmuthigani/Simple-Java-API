package com.test.testproject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.testproject.classes.Products;

@Repository
public interface ProductRepository extends JpaRepository<Products, Integer> {

    // custom query to search to blog post by title or content
    List<Products> findByTitleContainingOrContentContaining(String text, String textAgain);    
}