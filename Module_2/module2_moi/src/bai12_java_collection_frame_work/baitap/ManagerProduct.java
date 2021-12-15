package bai12_java_collection_frame_work.baitap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ManagerProduct {
    Scanner sc = new Scanner(System.in);
    List<Product> list = new ArrayList<>();

    public void show() {
        for (Product o : list) {
            System.out.println(o);
        }
    }

    public void add() {
        System.out.println("nhập mã sản phẩm :");
        int maSanPham = Integer.parseInt(sc.nextLine());
        System.out.println("nhập giá sản phẩm : ");
        double giaSanPham = Double.parseDouble(sc.nextLine());
        System.out.println("nhập tên sản phẩm :");
        String tenSanPham = sc.nextLine();
        Product product = new Product(maSanPham, giaSanPham, tenSanPham);
        list.add(product);
        Collections.sort(list);
        ReadAndWriteFile.write(list);
    }

    public void edit() {
        ReadAndWriteFile.read();
        show();
        System.out.println(" nhập mã cần sửa đổi : ");
        int maSanPham = Integer.parseInt(sc.nextLine());
        for (Product o : list) {
            if (o.getMaSanPham() == maSanPham) {
                System.out.println("nhập giá cần sửa đổi : ");
                double giaSanPham = Double.parseDouble(sc.nextLine());
                System.out.println("nhập tên sản phẩm cần sửa đổi:");
                String tenSanPham = sc.nextLine();
                o.setGiaSanPham(giaSanPham);
                o.setTenSanPham(tenSanPham);
                ReadAndWriteFile.write(list);
            }
        }
    }

    public void delete() {
        ReadAndWriteFile.read();
        show();
        System.out.println("nhập mã sản phẩm cần xóa : ");
        int maSanPham = Integer.parseInt(sc.nextLine());
        for (Product o : list) {
            if (o.getMaSanPham() == maSanPham) {
                System.out.println("bạn có chắc muốn xóa không. \n1.yes\n2.no ");
                int choice = Integer.parseInt(sc.nextLine());
                if (choice == 1) {
                    list.remove(o);
                }
            }
            break;
        }
        ReadAndWriteFile.write(list);
    }

    public Product search(String ten) {
        for (Product o : list) {
            if (o.getTenSanPham().equals(ten)) {
                return o;
            }
        }
        return null;
    }
}

