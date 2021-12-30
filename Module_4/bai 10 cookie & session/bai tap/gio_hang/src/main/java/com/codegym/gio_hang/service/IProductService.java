package com.codegym.gio_hang.service;



import com.codegym.gio_hang.model.Product;

import java.util.Optional;

public interface IProductService {
    Iterable<Product> findAll();
    Optional<Product> findById(Long id);
    Product findId(Long id);
}
