package repository;

import Model.Product;

import java.util.ArrayList;

public interface IProductRepository {
    ArrayList<Product> findAll();
    Product findById(Integer id);
    Product findByName(String name);
    void save (Product product);
    void update (Integer id, Product product);
    void delete (Integer id);
}
