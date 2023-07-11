package com.example.redisDemo.controller;

import com.example.redisDemo.model.Product;
import com.example.redisDemo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/add")
    public ResponseEntity<Object> addProduct(@RequestBody Product product){
        return new ResponseEntity<>(productService.addProduct(product), HttpStatus.CREATED);
    }

    @GetMapping("/findAll")
    public ResponseEntity<Object> getAll(){
        return new ResponseEntity<>(productService.getAll(),HttpStatus.FOUND);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getById(@PathVariable int id){
        return new ResponseEntity<>(productService.getById(id),HttpStatus.FOUND);
    }
}
