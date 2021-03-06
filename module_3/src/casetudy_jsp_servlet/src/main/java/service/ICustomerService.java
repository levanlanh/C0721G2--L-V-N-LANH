package service;

import model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();
    void save(Customer customer);
    void remove(int id);
    Customer findById(int id);
    void update(Customer employee);
    List<Customer> orderByName();
    List<Customer> search(String name,int id, String address );

}
