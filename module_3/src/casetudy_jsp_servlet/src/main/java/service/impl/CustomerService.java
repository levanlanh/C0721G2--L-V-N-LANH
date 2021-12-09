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
        this.iCustomerRepository.save(customer);
    }

    @Override
    public void remove(int id) {
        this.iCustomerRepository.remove(id);
    }

    @Override
    public Customer findById(int id) {
        return this.iCustomerRepository.findById(id);
    }

    @Override
    public void update(Customer customer) {
        this.iCustomerRepository.update(customer);
    }

    @Override
    public List<Customer> orderByName() {
        return this.iCustomerRepository.orderByName();
    }

    @Override
    public List<Customer> search(String name,int id,String address) {
        return this.iCustomerRepository.search(name,id,address);
    }



}
