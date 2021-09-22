package casetudy_module2.services;

import casetudy_module2.models.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {
  private static List<Employee> employees = new ArrayList<>();

  static {
      employees.add(new Employee("lanh","18/02/1999",true,231317412,"0987654321","vietnam@gmail.com",001,"cao đẳng","nhân viên",23000000));
      employees.add(new Employee("linh","23/04/1996",false,23453245,"0987654312","helo@gmail.com",002,"Đại học","trưởng phòng",34000000));
  }
}
