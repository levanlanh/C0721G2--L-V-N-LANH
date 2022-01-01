package com.example.blog.service;

import com.example.blog.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

public interface ICategoryService {
    List<Category> findAll();

    Category findById(Integer id);

    void remove(Integer id);

    void save(Category category);

    Page<Category> findAllPage(PageRequest of);
}
