package com.test.testproject.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.testproject.classes.Products;
import com.test.testproject.repository.ProductRepository;

@RestController
public class ProductController {
    @Autowired
    ProductRepository ProductRepository;

    @GetMapping("/products")
    public List<Products> index(){
        return ProductRepository.findAll();
    }
    
    @PostMapping("/products")
    public Products create(@RequestBody Map<String, String> body){
        String title = body.get("title");
        String content = body.get("content");
        return ProductRepository.save(new Products(title, content));
    }
}
