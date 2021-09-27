package casetudy_module2.services;

import casetudy_module2.models.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class EmployeeServiceImpl implements EmployeeService {
    static Scanner scanner = new Scanner(System.in);
  private static final List<Employee> employee = new ArrayList<>();

  static {
      employee.add(new Employee("lanh","18/02/1999",true,231317412,"0987654321","vietnam@gmail.com",001,"cao đẳng","nhân viên",23000000));
      employee.add(new Employee("linh","23/04/1996",false,23453245,"0987654312","helo@gmail.com",002,"Đại học","trưởng phòng",34000000));
  }
  public void display(){
      for ( Employee employee: employee) {
          System.out.println(employee);
      }
  }
  public void add(){
      System.out.println("nhập tên :");
      String name = scanner.nextLine();
      System.out.println("nhập ngày sinh :");
      String ngaySinh = scanner.nextLine();
      System.out.println("nhập giới tính :");
      boolean gioiTinh = Boolean.parseBoolean(scanner.nextLine());
      System.out.println("nhập CMND : ");
      int soCMND = scanner.nextInt();
      System.out.println("nhập số điện thoại : ");
      String soDT = scanner.nextLine();
      System.out.println("nhập email : ");
      String email = scanner.nextLine();
      System.out.println("nhập mã nhân viên :");
      int maNhanVien = scanner.nextInt();
      System.out.println("nhập trình độ :");
      String trinhDo =scanner.nextLine();
      System.out.println("nhập vị trí :");
      String viTri = scanner.nextLine();
      System.out.println("nhập lương :");
      double luong = scanner.nextDouble();
      employee.add(new Employee(name,ngaySinh,gioiTinh,soCMND,soDT,email,maNhanVien,trinhDo,viTri,luong));
      display();
  }
//  public void editEmployee(String maNhanVien){
//      boolean flag = true;
//      for (int i = 0; i < employees.size() ; i++) {
//        if(employees.get(i).getMaNhanVien());
//      }
//  }
}
