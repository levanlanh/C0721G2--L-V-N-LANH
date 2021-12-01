package repository;

import Model.Product;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ProductRepository implements IProductRepository {
    static Map<Integer, Product> productMap = new TreeMap<>();
    static {
        productMap.put(1, new Product(1,"Iphone 13",23212,"99%","USA"));
        productMap.put(2, new Product(2,"Samsung galaxy note 20 plus",60042,"full box","Korea"));
        productMap.put(3, new Product(3,"BlackBer L12",74212,"new 10%","USA"));
        productMap.put(4, new Product(4,"LG G3",412123,"99%","Korea"));
        productMap.put(5, new Product(5,"Iphone 10 pro Max",124889,"full box","USA"));
        productMap.put(6, new Product(6,"Xiaomi red mi 9 pro",98722,"98%","Japan"));

    }

    @Override
    public ArrayList<Product> findAll() {
        return new ArrayList<>(productMap.values());
    }

    @Override
    public Product findById(Integer id) {
        return productMap.get(id);
    }

    @Override
    public Product findByName(String name) {
        Set<Integer> set = productMap.keySet();
        for (Integer key : set) {
            if (productMap.get(key).getProductName().contains(name)){
                return productMap.get(key);
            }
        }
        return null;
    }

    @Override
    public void save(Product product) {
    productMap.put(product.getProductId(),product);
    }

    @Override
    public void update(Integer id, Product product) {
     productMap.put(id,product);
    }

    @Override
    public void delete(Integer id) {

    }
}
