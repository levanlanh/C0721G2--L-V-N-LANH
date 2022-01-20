package com.example.bai_thi.service;



import com.example.bai_thi.model.ProductType;

import java.util.List;

public interface IProductTypeService {


    List<ProductType> getAll();

    ProductType findById(Integer id);

    void save(ProductType productType);

    List<ProductType> findByName(String name);

    void remove(Integer id);
}
