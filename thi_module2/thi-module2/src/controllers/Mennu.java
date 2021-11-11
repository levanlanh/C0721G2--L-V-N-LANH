package controllers;

import services.ThongTinManager;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Mennu {
    public static void main(String[] args) {
        ThongTinManager thongTinManager = new ThongTinManager();
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("-CHƯƠNG TRÌNH QUẢN LÍ SỔ TIẾT KIỆM-");
            System.out.println("1. thêm mới sổ tiết kiệm");
            System.out.println("2. xóa sổ tiết kiệm");
            System.out.println("3. xem danh sách sổ tiết kiệm ");
            System.out.println("4. thoát");
            System.out.println(" chọn chức năng ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("1. thêm mới sổ tiết kiệm");
                    thongTinManager.add();
                    break;
                case 2:
                    System.out.println("2. xóa sổ tiết kiệm");
                    thongTinManager.delete();
                    break;
                case 3:
                    System.out.println("3. xem danh sách sổ tiết kiệm ");
                    thongTinManager.show();
                    break;
                case 4:
                    System.out.println("4. thoát");
                    break;
                default:
                    System.out.println("nhập vào không đúng xin mời nhập lại.");
            }
        }
    }


}
