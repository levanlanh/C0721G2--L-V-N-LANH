package Service;

import Model.Product;

import java.util.ArrayList;
import java.util.List;

public interface IProductService {
    ArrayList<Product> findAll();
    Product findById(Integer id);
    Product findByName(String name);
    void save (Product product);
    void update (Integer id, Product product);
    void delete (Integer id);
    List<Product> searchByName(String name);
}
