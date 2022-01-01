package com.example.blog.repository;

import com.example.blog.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.net.CacheRequest;

@Repository
public interface ICategoryRepository extends JpaRepository<Category,Integer> {

}
