package models;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DanhSach {
    private static Scanner sc = new Scanner(System.in);
    public static List<RapPhim> rapPhims = new ArrayList<>();

    static {
        rapPhims.add(new RapPhim("CL-0980", "xe đạp ơi", "11/07.2021", 30));
        rapPhims.add(new RapPhim("CL-0990", "hồi đáp", "12/07/2021", 30));
    }

    public void show() {
        for (RapPhim rapPhim : rapPhims) {
            System.out.println(rapPhim);
        }
    }

    public void add() {
        System.out.println("nhập mã suất chiếu :");
        String maSuatChieu = CheckValidate.maSuatChieu();
        System.out.println("nhập tên phim :");
        String tenPhim = CheckValidate.tenPhim();
        System.out.println("nhập ngày chiếu");
        String ngayChieu = sc.nextLine();
        System.out.println("nhập số lượng vé :");
        int soLuongVe = Integer.parseInt(CheckValidate.soLuong());
        rapPhims.add(new RapPhim(maSuatChieu, tenPhim, ngayChieu, soLuongVe));
    }

    public void delete() {
        show();
        System.out.println("nhập mã xuất chiếu cần xóa : ");
        String maSuatChieu = sc.nextLine();
        for (RapPhim o : rapPhims) {
            if (o.getMaSuatChieu().equals(maSuatChieu)) {
                 rapPhims.remove(o);
            }
        }
    }
}
