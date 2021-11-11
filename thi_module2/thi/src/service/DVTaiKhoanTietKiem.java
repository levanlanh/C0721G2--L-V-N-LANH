package service;

import model.TaiKhoangThanhToan;
import model.TaiKhoangTietKiem;
import utils.ReadAndWriteTietKiem;
import utils.Validate;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DVTaiKhoanTietKiem {
    Scanner sc = new Scanner(System.in);
    List<TaiKhoangTietKiem> taiKhoangTietKiems = new ArrayList<>();

    public void add() {
        System.out.println("- Id tài khoản ");
        int idTaiKhoan = Integer.parseInt(sc.nextLine());
        System.out.println("- Mã tài khoản. ");
        String maTaiKhoan = sc.nextLine();
        System.out.println("- Tên chủ tài khoản.");
        String tenChuTaiKhoan = sc.nextLine();
        System.out.println("- Ngày tạo tài khoản.");
        String ngayTaoTaiKhoan = sc.nextLine();
        System.out.println("Số tiền gửi tiết kiệm");
        double soTienTietKiem = Double.parseDouble(Validate.regex(Validate.REGEX_SOTIENTIETKIEM, "số tiền phải lớn hơn 0"));
        System.out.println("Ngày gửi tiết kiệm");
        String ngayGuiTietKiem = sc.nextLine();
        System.out.println("lãi suất");
        double laiSuat = Double.parseDouble(sc.nextLine());
        System.out.println("kì hạn");
        String kiHan = sc.nextLine();
        TaiKhoangTietKiem taiKhoangTietKiem = new TaiKhoangTietKiem(idTaiKhoan, maTaiKhoan, tenChuTaiKhoan
                , ngayTaoTaiKhoan, soTienTietKiem, ngayGuiTietKiem, laiSuat, kiHan);
        taiKhoangTietKiems.add(taiKhoangTietKiem);
        ReadAndWriteTietKiem.write(taiKhoangTietKiems);
    }

    public void show() {
        taiKhoangTietKiems = ReadAndWriteTietKiem.read();
        for (TaiKhoangTietKiem o : taiKhoangTietKiems) {
            System.out.println(o);
        }
    }

    public void delete() {
        taiKhoangTietKiems = ReadAndWriteTietKiem.read();
        show();
        System.out.println("Nhập id cần xóa.");
        int id = Integer.parseInt(sc.nextLine());
         for (TaiKhoangTietKiem o : taiKhoangTietKiems) {
            if (o.getIdTaiKhoang() == id) {
                taiKhoangTietKiems.remove(o);
            }
        }
    }

    public void search(int id) {
        show();
        for (TaiKhoangTietKiem o : taiKhoangTietKiems) {
            if (o.getIdTaiKhoang() == id) {
                return;
            }
        }
    }
}
