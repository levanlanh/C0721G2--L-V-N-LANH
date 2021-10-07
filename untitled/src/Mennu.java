import models.DanhSach;

import java.util.Scanner;

public class Mennu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DanhSach danhSach = new DanhSach();
        int selection ;
        do {
            System.out.println("1. Danh sách toàn bộ suất chiếu của rạp");
            System.out.println("2. Thêm mới một suất chiếu");
            System.out.println("3. Xoá suất chiếu bất kì theo Mã suất chiếu, trước khi xoá thì cần hiển thị confirm.");
            System.out.println("4. Thoát");
            System.out.println("chọn thư mục:");
            selection= sc.nextInt();
            switch (selection){
                case 1:
                    System.out.println("1. Danh sách toàn bộ suất chiếu của rạp");
                     danhSach.show();
                    break;
                case 2 :
                    System.out.println("2. Thêm mới một suất chiếu");
                    danhSach.add();
                    break;
                case 3:
                    System.out.println("3. Xoá suất chiếu bất kì theo Mã suất chiếu, trước khi xoá thì cần hiển thị confirm.");
                    danhSach.delete();
                    break;
                case 4:
                    System.out.println("thoát");
                    break;
            }
        }while (selection != 4 );
    }


}
