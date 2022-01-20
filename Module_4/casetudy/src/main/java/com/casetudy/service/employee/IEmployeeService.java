package com.casetudy.service.employee;

import com.casetudy.model.employee.Employee;

import java.util.List;

public interface IEmployeeService  {
    List<Employee> findAll();

    void save(Employee employee);

    Employee findById(Integer id);

    void remove(Integer employeeId);

    List<Employee> findByName(String name);
}
