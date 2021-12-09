package service.impl;

import model.Customer;
import model.Employee;
import repository.impl.EmployeeRepository;
import service.ICustomerService;
import service.IEmployeeService;

import java.util.List;

public class EmployeeService implements IEmployeeService {
    EmployeeRepository employeeRepository = new EmployeeRepository();

    @Override
    public List<Employee> findAll() {
        return this.employeeRepository.findAll();
    }

    @Override
    public void save(Employee employee) {
    this.employeeRepository.save(employee);
    }

    @Override
    public void remove(int id) {
        this.employeeRepository.remove(id);
    }

    @Override
    public Customer findById(int id) {
        return null;
    }

    @Override
    public void update(Employee employee) {

    }

    @Override
    public List<Employee> orderByName() {
        return null;
    }

    @Override
    public List<Employee> search(String name, int id, String address) {
        return null;
    }
}
