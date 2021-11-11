package service;

import model.TaiKhoangThanhToan;
import utils.ReadAndWriteThanhToan;
import utils.Validate;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DVTaiKhoanThanhToan {
    List<TaiKhoangThanhToan> taiKhoangThanhToans = new ArrayList<>();
    Scanner sc = new Scanner(System.in);


    public void add() {
        System.out.println("- Id tài khoản ");
        int idTaiKhoan = Integer.parseInt(sc.nextLine());
        System.out.println("- Mã tài khoản. ");
        String maTaiKhoan = sc.nextLine();
        System.out.println("- Tên chủ tài khoản.");
        String tenChuTaiKhoan = sc.nextLine();
        System.out.println("- Ngày tạo tài khoản.");
        String ngayTaoTaiKhoan = sc.nextLine();
        System.out.println("Số thẻ .");
        int soThe = Integer.parseInt(Validate.regex(Validate.REGEX_SOTHE, "phải lớn hơn 0."));
        System.out.println("Số tiền trong tài khoản.");
        double soTienTrongTaiKhoan = Double.parseDouble(Validate.regex(Validate.REGEX_SOTAIKHOAN, "phải lớn hơn không."));
        TaiKhoangThanhToan taiKhoangThanhToan = new TaiKhoangThanhToan(idTaiKhoan, maTaiKhoan, tenChuTaiKhoan,
                ngayTaoTaiKhoan, soThe, soTienTrongTaiKhoan);
        taiKhoangThanhToans.add(taiKhoangThanhToan);
        ReadAndWriteThanhToan.write(taiKhoangThanhToans);
    }

    public void show() {
        taiKhoangThanhToans = ReadAndWriteThanhToan.read();
        for (TaiKhoangThanhToan o : taiKhoangThanhToans) {
            System.out.println(o);
        }
    }

    public void delete() {
       // taiKhoangThanhToans = ReadAndWriteThanhToan.read();
        show();
        System.out.println("Nhập id cần xóa.");
        int id = Integer.parseInt(sc.nextLine());
        for (TaiKhoangThanhToan o : taiKhoangThanhToans) {
            if (o.getIdTaiKhoang() == id) {
                System.out.println("bạn có chắc muốn xóa không. \n1.yes\n2.no ");
                int choice = Integer.parseInt(sc.nextLine());
                if (choice == 1) {
                    taiKhoangThanhToans.remove(o);
                }
                break;
            }
        }
    }

    public void search(int id) {
        taiKhoangThanhToans = ReadAndWriteThanhToan.read();
        show();
        for (TaiKhoangThanhToan o : taiKhoangThanhToans) {
            if (o.getIdTaiKhoang() == id) {
                return;
            }
        }
    }
}
