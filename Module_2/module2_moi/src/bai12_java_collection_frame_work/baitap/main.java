package bai12_java_collection_frame_work.baitap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        ManagerProduct managerProduct = new ManagerProduct();
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Sửa thông tin sản phẩm theo id");
            System.out.println("3. Xoá sản phẩm theo id");
            System.out.println("4. Hiển thị danh sách sản phẩm");
            System.out.println("5. Tìm kiếm sản phẩm theo tên");
            System.out.println("mời bạn chọn. ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("1. Thêm sản phẩm");
                    managerProduct.add();
                    break;
                case 2:
                    System.out.println("2. Sửa thông tin sản phẩm theo id");
                    managerProduct.edit();
                    break;
                case 3:
                    System.out.println("3. Xoá sản phẩm theo id");
                    managerProduct.delete();
                case 4:
                    System.out.println("4. Hiển thị danh sách sản phẩm");
                    managerProduct.show();
                    break;
                case 5:
                    System.out.println("5. Nhập tên sản phẩm cần tìm kiếm : ");
                    String ten = sc.nextLine();
                    System.out.println(managerProduct.search(ten));
                    break;
            }
        }
    }
}
