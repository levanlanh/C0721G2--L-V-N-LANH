package services;

import interface_services.EmployeeService;
import models.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    List<Employee> employees = new ArrayList<>();
    Scanner sc = new Scanner(System.in);


    public void show() {
       employees = ReadAndWriteEmployee.read();
        for (Employee e : employees) {
            System.out.println(e);
        }
    }

    public void add() {
        System.out.println("Nhập mã nhân viên :");
        String maNhanVien = sc.nextLine();
        System.out.println("Nhập họ tên :");
        String hoTen = sc.nextLine();
        System.out.println("Nhập ngày sinh :");
        String ngaySinh = sc.nextLine();
        System.out.println("Nhập giới tính :");
        String gioiTinh = sc.nextLine();
        System.out.println("Nhập số CMND : ");
        int soCMND = Integer.parseInt(sc.nextLine());
        System.out.println("nhập số điện thoại :");
        int soDienThoai = Integer.parseInt(sc.nextLine());
        System.out.println("nhập email :");
        String email = sc.nextLine();
        System.out.println("Nhập trình độ :");
        String trinhDo = sc.nextLine();
        System.out.println("Nhập vị trí :");
        String viTri = sc.nextLine();
        System.out.println("Nhập lương :");
        double luong = Double.parseDouble(sc.nextLine());
        Employee employee = new Employee(hoTen, ngaySinh, gioiTinh, soCMND, soDienThoai, email, maNhanVien, trinhDo, viTri, luong);
        employees.add(employee);
        ReadAndWriteEmployee.write(employees);
    }

    public void edit() {
        ReadAndWriteEmployee.read();
        show();
        System.out.println("Nhập mã nhân viên cần chỉnh sửa : ");
        String maNhanVien = sc.nextLine();
        for (Employee e : employees) {
            if (e.getMaNhanVien().equals(maNhanVien)) {
                System.out.println("Nhập họ tên :");
                String hoTen = sc.nextLine();
                System.out.println("Nhập ngày sinh :");
                String ngaySinh = sc.nextLine();
                System.out.println("Nhập giới tính :");
                String gioiTinh = sc.nextLine();
                System.out.println("Nhập số CMND : ");
                int soCMND = Integer.parseInt(sc.nextLine());
                System.out.println("nhập số điện thoại :");
                int soDienThoai = Integer.parseInt(sc.nextLine());
                System.out.println("nhập email :");
                String email = sc.nextLine();
                System.out.println("Nhập trình độ :");
                String trinhDo = sc.nextLine();
                System.out.println("Nhập vị trí :");
                String viTri = sc.nextLine();
                System.out.println("Nhập lương :");
                double luong = Double.parseDouble(sc.nextLine());
                e.setHoVaTen(hoTen);
                e.setNgaySinh(ngaySinh);
                e.setGioiTinh(gioiTinh);
                e.setSoCMND(soCMND);
                e.setSoDienThoai(soDienThoai);
                e.setEmail(email);
                e.setTrinhDo(trinhDo);
                e.setViTri(viTri);
                e.setLuong(luong);
                ReadAndWriteEmployee.write(employees);
            }
        }
    }
}
