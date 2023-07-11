package com.example.redisDemo.repository;

import com.example.redisDemo.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepo extends JpaRepository<Product,Integer> {
}
