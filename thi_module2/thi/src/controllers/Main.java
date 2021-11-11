package controllers;

import service.DVTaiKhoanThanhToan;
import service.DVTaiKhoanTietKiem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DVTaiKhoanThanhToan taiKhoangNganHang = new DVTaiKhoanThanhToan();
        DVTaiKhoanTietKiem taiKhoanTietKiem = new DVTaiKhoanTietKiem();
        Scanner sc = new Scanner(System.in);
        try {
            boolean flagMenu = true;
            while (flagMenu) {
                System.out.println("--CHƯƠNG TRÌNH QUẢN LÝ TÀI KHOẢN NGÂN HÀNG –");
                System.out.println("1. Tài khoảng thanh toán.");
                System.out.println("2. Tài khoảng tiết kiệm.");
                int choice1 = Integer.parseInt(sc.nextLine());
                switch (choice1) {
                    case 1:
                        boolean flag = true;
                        while (flag) {
                            System.out.println("--Tài khoảng thanh toán. –" + "\n" + "1. thêm mới. " + "\n"
                                    + "2.xóa. " + "\n" + "3. xem danh sách các tài khoảng ngân hàng." + "\n" + "4. tìm kiếm."
                                    + "\n" + "5. thoát.");
                            int choice = Integer.parseInt(sc.nextLine());
                            switch (choice) {
                                case 1:
                                    System.out.println("1.Thêm mới");
                                    taiKhoangNganHang.add();
                                    break;

                                case 2:
                                    System.out.println("2. xóa");
                                    taiKhoangNganHang.delete();
                                    break;
                                case 3:
                                    System.out.println("xem danh sách các tài khoảng ngân hàng.");
                                    taiKhoangNganHang.show();
                                    break;
                                case 4:
                                    System.out.println("tìm kiếm.");
                                    int id = Integer.parseInt(sc.nextLine());
                                    taiKhoangNganHang.search(id);
                                    break;
                                case 5:
                                    System.out.println("5.thoát");
                                    flag = false;
                            }
                        }
                        break;
                    case 2:
                        boolean flag1 = true;
                        while (flag1) {
                            System.out.println("--Tài khoảng tiết kiệm –" + "\n" + "1. thêm mới. " + "\n"
                                    + "2.xóa. " + "\n" + "3. xem danh sách các tài khoảng ngân hàng." + "\n" + "4. tìm kiếm."
                                    + "\n" + "5. thoát.");
                            int choice = Integer.parseInt(sc.nextLine());
                            switch (choice) {
                                case 1:
                                    System.out.println("1.Thêm mới");
                                    taiKhoanTietKiem.add();
                                    break;

                                case 2:
                                    System.out.println("2. xóa");
                                    taiKhoanTietKiem.delete();
                                    break;
                                case 3:
                                    System.out.println("xem danh sách các tài khoảng ngân hàng.");
                                    taiKhoanTietKiem.show();
                                    break;
                                case 4:
                                    System.out.println("tìm kiếm.");
                                    int id = Integer.parseInt(sc.nextLine());
                                    taiKhoanTietKiem.search(id);
                                    break;
                                case 5:
                                    System.out.println("5.thoát");
                                    flag1 = false;
                            }
                        }
                        break;
                }
            }

        } catch (NumberFormatException e) {
            System.out.println("Yêu cầu nhập lại");
        }
    }
}