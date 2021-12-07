package service.impl;

import model.Customer;

import repository.ICustomerRepository;
import repository.impl.CustomerRepository;
import service.ICustomerService;

import java.util.List;

public class CustomerService implements ICustomerService {
    ICustomerRepository iCustomerRepository = new CustomerRepository();
    @Override
    public List<Customer> findAll() {
        return iCustomerRepository.findAll();
    }

    @Override
    public void save(Customer customer) {
        
    }

    @Override
    public void remove(int id) {

    }

    @Override
    public Customer findById(int id) {
        return null;
    }

    @Override
    public void update(Customer employee) {

    }

    @Override
    public List<Customer> findByName(String name) {
        return null;
    }
}
