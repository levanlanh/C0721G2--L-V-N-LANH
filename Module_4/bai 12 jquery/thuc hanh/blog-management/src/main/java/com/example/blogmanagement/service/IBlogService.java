package com.example.blogmanagement.service;


import com.example.blogmanagement.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IBlogService {
    List<Blog> getAll();

    Blog findById(Integer id);

    void save(Blog blog);


    void remove(Integer id);

    Page<Blog> findAll(Pageable of);
}
