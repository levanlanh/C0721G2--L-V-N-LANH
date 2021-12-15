package repository;

import model.Customer;
import model.Employee;

import java.util.List;

public interface IEmployeeRepository {
    List<Employee> findAll();
    void save(Employee employee);
    void remove(int id);
    Employee findById(int id);
    void update(Employee employee);
    List<Employee> orderByName();
    List<Employee> search(String name );
}
