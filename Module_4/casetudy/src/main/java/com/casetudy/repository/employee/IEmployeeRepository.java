package com.casetudy.repository.employee;

import com.casetudy.model.employee.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IEmployeeRepository extends JpaRepository<Employee,Integer> {
    @Query(value="select * from customer where employee.employee_name like concat('%',?1,'%')",nativeQuery = true)
    List<Employee> findByName(String name);
}
