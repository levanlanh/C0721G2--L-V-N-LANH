package hethongquanlysinhvien;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
       SinhVienManager sinhVienManager = new SinhVienManager();
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag){
            System.out.println("1. thêm mới danh sách sinh viên.");
            System.out.println("2. hiển thị danh sách sinh viên.");
            System.out.println("3. sửa thông tin sinh viên.");
            System.out.println("4. xóa danh sách sinh viên.");
            System.out.println("5. kiểm tra xem đã có trong danh sách chưa.");
            System.out.println("6. Nhập vào mã sinh viên và hiển thị thông tin của sinh viên đó");
            System.out.println("7. thoát ");
            System.out.println("mời nhập lựa chọn .");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1 :
                    System.out.println("1. thêm mới danh sách sinh viên.");
                    sinhVienManager.add();
                    break;
                case 2 :
                    System.out.println("2. hiển thị danh sách sinh viên.");
                    sinhVienManager.show();
                    break;
                case 3 :
                    System.out.println("3. sửa thông tin sinh viên.");
                   sinhVienManager.edit();
                    break;
                case 4 :
                    System.out.println("4. xóa danh sách sinh viên.");
                    sinhVienManager.delete();
                    break;
                case 5 :
                    System.out.println("5. vui lòng nhập mã sinh viên cần tìm.");
                    String o = sc.nextLine();
                    System.out.println(sinhVienManager.contains(o));
                    break;
                case 6 :
                    System.out.println("6. Nhập vào mã sinh viên cần hiển thị thông tin của sinh viên đó");
                    String ma = sc.nextLine();
                    System.out.println(sinhVienManager.search(ma));
                    break;
                case 7 :
                    System.out.println(" thoát khỏi chương trình. ");
                    return;
                default:
                    System.out.println("mời bạn nhập lại.");
            }
        }
    }
}
