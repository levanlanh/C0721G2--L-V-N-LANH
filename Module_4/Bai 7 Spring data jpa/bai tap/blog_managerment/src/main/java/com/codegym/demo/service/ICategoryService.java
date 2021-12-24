package com.codegym.demo.service;


import com.codegym.demo.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

public interface ICategoryService {
    List<Category> findAll();

    Category findById(String id);

    void remove(String id);

    void save(Category category);

    Page<Category> findAllPage(PageRequest of);

    List<Category> findByName(String name);
}
