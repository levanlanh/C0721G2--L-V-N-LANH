package services;

import models.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl {
    Scanner sc = new Scanner(System.in);
    List<Customer> customers = new ArrayList<>();

    public void show() {
        for (Customer o : customers) {
            System.out.println(o);
        }
    }

    public void add() {
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
        System.out.println("Nhập mã khách hàng :");
        String maKhachHanh = sc.nextLine();
        System.out.println("Nhập loại khách hàng :");
        String loaiKhachHang = sc.nextLine();
        System.out.println("Nhập địa chỉ :");
        String diaChi = sc.nextLine();
        Customer customer = new Customer(hoTen,ngaySinh,gioiTinh,soCMND,soDienThoai,email,maKhachHanh,loaiKhachHang,diaChi);
        customers.add(customer);
    }

    public void edit() {
        show();
        System.out.println("Nhập mã khách hàng cần chỉnh sửa :");
        String maKhachHang = sc.nextLine();
        for (Customer o : customers) {
            if(o.getMaKhachHang().equals(maKhachHang)){
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
                System.out.println("Nhập loại khách hàng :");
                String loaiKhachHang = sc.nextLine();
                System.out.println("Nhập địa chỉ :");
                String diaChi = sc.nextLine();
                o.setHoVaTen(hoTen);
                o.setNgaySinh(ngaySinh);
                o.setGioiTinh(gioiTinh);
                o.setSoCMND(soCMND);
                o.setSoDienThoai(soDienThoai);
                o.setEmail(email);
                o.setLoaiKhachHang(loaiKhachHang);
                o.setDiaChi(diaChi);
            }
        }
    }
}
