package bai17_binary_file_serialization.exercise.quanlifilenhiphan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập sản phẩm");
        ListSanPham listSanPham = new ListSanPham();
        int login = 0;
        do {
            System.out.println("Menu");
            System.out.println("1.Hiển thị");
            System.out.println("2.Tìm kiếm thông tin sản phẩm");
            System.out.println("3.thêm sản phẩm");
            System.out.println("0.thoát chương trình");
            login = scanner.nextInt();
            scanner.nextLine();
            switch (login) {
                case 1:
                    listSanPham.display();
                    break;
                case 2:
                    System.out.println("nhập tên : ");
                    String maSanPham =scanner.nextLine();
                    listSanPham.search(maSanPham);
                    break;
                case 3:
                    listSanPham.add();
                    break;
                case 0:
                    break;

            }
        } while (login != 0);
    }
}
