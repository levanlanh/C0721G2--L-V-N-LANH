package com.example.blog.service;

import com.example.blog.model.Blog;
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
