package com.codegym.repository;

import com.codegym.model.Blog;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

public class BlogRepository implements IBlogRepository{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Blog> findAll() {
        TypedQuery<Blog> query = entityManager.createQuery("select c from Blog c", Blog.class);
        return query.getResultList();
    }

    @Override
    public Blog findById(Integer id) {
        return null;
    }

    @Override
    public void save(Blog blog) {

    }

    @Override
    public void remove(Integer id) {

    }
}
