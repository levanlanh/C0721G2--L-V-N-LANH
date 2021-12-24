package com.codegym.demo.service.impl;


import com.codegym.demo.model.Category;
import com.codegym.demo.repository.ICategoryRepository;

import com.codegym.demo.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "iCateGoryService")
public class CategoryService implements ICategoryService {
    @Autowired
    @Qualifier("iCategoryRepository")
    ICategoryRepository iCategoryRepository;

    @Override
    public List<Category> findAll() {
        return iCategoryRepository.findAll();
    }

    @Override
    public Category findById(String id) {
        return iCategoryRepository.findById(id).orElse(null);
    }

    @Override
    public void remove(String id) {
iCategoryRepository.deleteById(id);
    }

    @Override
    public void save(Category category) {
iCategoryRepository.save(category);
    }

    @Override
    public Page<Category> findAllPage(PageRequest of) {
        return iCategoryRepository.findAll(of);
    }

    @Override
    public List<Category> findByName(String name) {
        return iCategoryRepository.findByName("%"+name+"%");
    }
}
