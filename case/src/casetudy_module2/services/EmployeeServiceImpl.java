package casetudy_module2.services;

import casetudy_module2.models.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class EmployeeServiceImpl implements EmployeeService {
    static Scanner scanner = new Scanner(System.in);
    private static List<Employee> employee = new ArrayList<>();

    static {
        employee.add(new Employee("lanh", "18/02/1999", true, 231317412, "0987654321",
                "vietnam@gmail.com", 001, "Cao dang", "nhân viên", 23000000));
        employee.add(new Employee("linh", "23/04/1996", false, 23453245, "0987654312",
                "helo@gmail.com", 002, "dai hoc", "trưởng phòng", 34000000));
    }

    public void show() {
        for (Employee employee : employee) {
            System.out.println(employee);
        }
    }

    @Override
    public void edit() {

    }

    public void add() {
        System.out.println("nhập tên :");
        String name = scanner.nextLine();
        System.out.println("nhập ngày sinh :");
        String ngaySinh = scanner.nextLine();
        System.out.println("nhập giới tính :");
        boolean gioiTinh = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("nhập CMND : ");
        int soCMND = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập số điện thoại : ");
        String soDT = scanner.nextLine();
        System.out.println("nhập email : ");
        String email = scanner.nextLine();
        System.out.println("nhập mã nhân viên :");
        int maNhanVien = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập trình độ :");
        String trinhDo = scanner.nextLine();
        System.out.println("nhập vị trí :");
        String viTri = scanner.nextLine();
        System.out.println("nhập lương :");
        double luong = Double.parseDouble(scanner.nextLine());
        Employee employees = new Employee(name, ngaySinh, gioiTinh, soCMND,
                soDT, email, maNhanVien, trinhDo, viTri, luong);
        employee.add(employees);

    }

    public void edit(String name) {
        show();
        System.out.println("nhập tên nhân viên cần chỉnh sửa : ");
        name = scanner.nextLine();
        for (Employee o : employee) {
            if (o.getName().equals(name)) {
                boolean flag = true;
                while (flag) {
                    flag = false;
                    try {
                        System.out.println("1.edit name" + "\n" + "2. edit ngaySinh" + "\n" + "3. edit gioiTinh" + "\n"
                                + "4 . edit soCMND" + "\n" + "5. edit soDT" + "\n" + "6. edit email" + "\n"
                                + "7. edit maNhanVien" + "\n" + "8. edit trinhDo" + "\n" + "9. edit viTri" + "\n"
                                + "10. edit luong");
                        int choice = Integer.parseInt(scanner.nextLine());
                        switch (choice) {
                            case 1:
                                System.out.println("nhập tên :");
                                o.setName(scanner.nextLine());
                                break;
                            case 2:
                                System.out.println("nhập ngày sinh :");
                                o.setNgaySinh(scanner.nextLine());
                                break;
                            case 3:
                                System.out.println("nhập giới tính :");
                                o.setGioiTinh(Boolean.parseBoolean(scanner.nextLine()));
                                break;
                            case 4:
                                System.out.println("nhập CMND : ");
                                o.setSoCMND(Integer.parseInt(scanner.nextLine()));
                                break;
                            case 5:
                                System.out.println("nhập số điện thoại : ");
                                o.setSoDT(scanner.nextLine());
                                break;
                            case 6:
                                System.out.println("nhập email : ");
                                o.setEmail(scanner.nextLine());
                                break;
                            case 7:
                                System.out.println("nhập mã nhân viên :");
                                o.setMaNhanVien(Integer.parseInt(scanner.nextLine()));
                                break;
                            case 8:
                                boolean flag1 = true;
                                while (flag1) {
                                    flag1 = false;
                                    try {
                                        System.out.println("trình độ " + "\n" + "1.TRUNGHOC" + "\n" + "2.CAODANG" + "\n"
                                                + "3.DAIHOC" + "\n" + "4.TIEUHOC");
                                        int choice1 = Integer.parseInt(scanner.nextLine());
                                        switch (choice1) {
                                            case 1:
                                                o.setTrinhDo(Employee.TRUNGHOC);
                                                break;
                                            case 2:
                                                o.setTrinhDo(Employee.CAODANG);
                                                break;
                                            case 3:
                                                o.setTrinhDo(Employee.DAIHOC);
                                                break;
                                            case 4:
                                                o.setTrinhDo(Employee.TIEUHOC);
                                                break;
                                        }
                                    } catch (Exception e1) {
                                        System.err.println("Đầu vào không hợp lệ, hãy nhập số");
                                        flag1 = true;
                                    }
                                }
                            case 9:
                                boolean flag2 = true;
                                while (flag2) {
                                    flag2 = false;
                                    try {
                                        System.out.println("Chức vụ " + "\n" + "1.LE TAN" + "\n" + "2.NHAN VIEN" + "\n"
                                                + "3.TAP VU" + "\n" + "4.QUAN LI" + "\n" + "5.GIAM DOC" + "\n" + "6.BAO VE");
                                        int choice2 = Integer.parseInt(scanner.nextLine());
                                        switch (choice2) {
                                            case 1:
                                                o.setViTri(Employee.LETAN);
                                                break;
                                            case 2:
                                                o.setViTri(Employee.NHANVIEN);
                                                break;
                                            case 3:
                                                o.setViTri(Employee.TAPVU);
                                                break;
                                            case 4:
                                                o.setViTri(Employee.QUANLI);
                                                break;
                                            case 5:
                                                o.setViTri(Employee.GIAMDOC);
                                                break;
                                            case 6:
                                                o.setViTri(Employee.BAOVE);
                                                break;
                                        }
                                    } catch (Exception exception) {
                                        System.out.println("Đầu vào không hợp lệ, hãy nhập số");
                                        flag2 = true;
                                    }
                                }
                            case 10:
                                System.out.println("nhập lương :");
                                o.setLuong(Double.parseDouble(scanner.nextLine()));
                                break;
                        }
                    } catch (Exception error) {
                        System.out.println("Đầu vào không hợp lệ. Giá trị vẫn không thể chỉnh sửa, hãy thử lại");
                        flag = true;
                    }
                }
            }
        }
        show();
    }
}
