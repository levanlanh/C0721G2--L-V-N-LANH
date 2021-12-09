package repository;

import model.Customer;

import java.util.List;

public interface ICustomerRepository {
    List<Customer> findAll();
    void save(Customer customer);
    void remove(int id);
    Customer findById(int id);
    void update(Customer customer);
    List<Customer> orderByName();
    List<Customer> search(String name, int id,String address );

}
