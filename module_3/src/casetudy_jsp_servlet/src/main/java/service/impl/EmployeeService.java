package service.impl;

import model.Customer;
import model.Employee;
import repository.impl.BaseRepository;
import repository.impl.EmployeeRepository;
import service.ICustomerService;
import service.IEmployeeService;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
    public Employee findById(int id) {
        return this.employeeRepository.findById(id);
    }

    @Override
    public void update(Employee employee) {
        this.employeeRepository.update(employee);
    }

    @Override
    public List<Employee> orderByName() {
        return this.employeeRepository.orderByName();
    }

    @Override
    public List<Employee> search(String name) {
        return this.employeeRepository.search(name);
    }
}
