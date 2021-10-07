import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        ThongTinManager thongTinManager = new ThongTinManager();
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("0. thêm danh sách thông tin.");
            System.out.println("1. Danh sách các môn học theo thời lượng lớn nhất đến nhỏ nhất.");
            System.out.println("2. Cập nhật môn học (không được phép chỉnh sửa Mã môn học).");
            System.out.println("3. Xoá môn học bất kì theo Mã môn học, nếu không có Mã môn học thì thực hiện throw Exception.");
            System.out.println("4. Thoát.");
            System.out.println("nhập sự lựa chọn.");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 0:
                    System.out.println("0. thêm danh sách thông tin.");
                    thongTinManager.add();
                case 1:
                    System.out.println("1. Danh sách các môn học theo thời lượng lớn nhất đến nhỏ nhất.");
                    thongTinManager.show();
                    break;
                case 2:
                    System.out.println("2. Cập nhật môn học (không được phép chỉnh sửa Mã môn học).");
                    thongTinManager.edit();
                    break;
                case 3:
                    System.out.println("3. Xoá môn học bất kì theo Mã môn học, nếu không có Mã môn học thì thực hiện throw Exception.");
                    thongTinManager.show();
                    String ten = sc.nextLine();
                    thongTinManager.delete(ten);
                    break;
                case 4:
                    System.out.println("4. Thoát.");
                    flag = false;
                    break;
                default:
                    System.out.println("nhập vào không đúng xin mời nhập lại");
            }
        }
    }
}
