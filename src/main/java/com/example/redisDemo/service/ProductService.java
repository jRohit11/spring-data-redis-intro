package com.example.redisDemo.service;

import com.example.redisDemo.model.Product;
import com.example.redisDemo.repository.ProjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProjectRepo projectRepo;
    public Product addProduct(Product product){
        return projectRepo.save(product);
    }

    public List<Product> getAll(){
        return projectRepo.findAll();
    }

    public Product getById(int id){
        return projectRepo.findById(id).get();
    }
}
