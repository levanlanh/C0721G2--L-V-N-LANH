package services;

import models.ThongTin;
import utils.ReadAndWriteFile;
import utils.Validate;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ThongTinManager implements ThongTinSevices {
    static Scanner sc = new Scanner(System.in);
    private static List<ThongTin> thongTins = new ArrayList<>();

    public void add() {
        System.out.println("nhập mã sổ số ");
        String maSoSo = Validate.regex(Validate.REGEX_MASOSO, "nhập theo STK-XXXX");
        System.out.println("nhập mã khách hàng ");
        int maKhachHang = Integer.parseInt(sc.nextLine());
        System.out.println("nhập ngày mở số ");
        String ngayMoSo = sc.nextLine();
        System.out.println("Nhập thời gian gửi ");
        String thoiGianGui = sc.nextLine();
        System.out.println("nhập kỳ hạn ");
        String kyHan = sc.nextLine();
        System.out.println("nhập số tiền gửi ");
        String soTienGui = Validate.regex(Validate.REGEX_SOTIENGUI, "số tiền nhỏ nhất là 1000000");
        System.out.println("nhập lãi suất ");
        String laiSuat = sc.nextLine();
        System.out.println("nhập ưu đãi ");
        String uuDai = sc.nextLine();
        ThongTin thongTin = new ThongTin(maSoSo, maKhachHang, ngayMoSo, thoiGianGui, kyHan, soTienGui, laiSuat, uuDai);
        thongTins.add(thongTin);
        ReadAndWriteFile.write(thongTins);
    }

    public void show() {
        for (ThongTin o : thongTins) {
            System.out.println(o);
        }
    }

    public void delete() {
        show();
        thongTins = ReadAndWriteFile.read();
        System.out.println("nhập mã sổ số cần xóa : ");
        String maSoSo = sc.nextLine();
        for (ThongTin o : thongTins) {
            if (o.getMaSoSo().contains(maSoSo)) {
                System.out.println("bạn có chắc muốn xóa hay không. \n1.yes\n2.no");
                int choice = Integer.parseInt(sc.nextLine());
                if (choice == 1) {
                    thongTins.remove(o);
                }
                break;
            }
        }
        ReadAndWriteFile.write(thongTins);
    }
}