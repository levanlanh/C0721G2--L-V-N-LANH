package Service;

import Model.Product;
import repository.IProductRepository;
import repository.ProductRepository;

import java.util.ArrayList;

public class ProductService implements IProductService {
    private static IProductRepository  iProductRepository = new ProductRepository();

    @Override
    public ArrayList<Product> findAll() {
        return this.iProductRepository.findAll();
    }

    @Override
    public Product findById(Integer id) {
        return iProductRepository.findById(id);
    }

    @Override
    public Product findByName(String name) {
        return null;
    }

    @Override
    public void save(Product product) {
    iProductRepository.save(product);
    }

    @Override
    public void update(Integer id, Product product) {
   iProductRepository.update(id,product);
    }

    @Override
    public void delete(Integer id) {

    }
}
