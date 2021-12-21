package com.codegym.service;

import com.codegym.model.SanPham;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;


@Service
public class SanPhamServiceImpl implements ISanPhamService{
    private static SessionFactory sessionFactory;
    private static EntityManager entityManager;

    static {
        try {
            sessionFactory = new Configuration()
                    .configure("hibernate.conf.xml")
                    .buildSessionFactory();
            entityManager = sessionFactory.createEntityManager();
        } catch (HibernateException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<SanPham> findAll() {
        String string = "select s from SanPham s";
        TypedQuery<SanPham> query1 = entityManager.createQuery(string, SanPham.class);
        return query1.getResultList();
    }

    @Override
    public void save(SanPham sanPham) {

    }

    @Override
    public SanPham findById(int id) {
        return null;
    }

    @Override
    public void update(int id, SanPham sanPham) {

    }

    @Override
    public void remove(int id) {

    }
}
