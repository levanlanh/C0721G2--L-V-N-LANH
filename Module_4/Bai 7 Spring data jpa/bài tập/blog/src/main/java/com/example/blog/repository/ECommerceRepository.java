package com.example.blog.repository;

import com.example.blog.model.ECommerce;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ECommerceRepository extends JpaRepository<ECommerce,Integer> {

    List<ECommerce> findAll(); 
}
