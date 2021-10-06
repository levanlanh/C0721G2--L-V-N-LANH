package checkvalidate;

import java.util.Scanner;
import java.util.regex.Pattern;

public class CheckFacility {
    private static Scanner sc = new Scanner(System.in);
    private static final String MADICHVU = "^[1-9]+$";
    private static final String DIENTICH = "^[1-9][0-9]{2,}$";
    private static final String DIENTICH1 = "^[3-9][1-9]$";
    private static final String CHIPHI = "^[1-9][0-9]{4,}$";
    private static final String TIEUCHUANPHONG = "^[AB]$";
    private static final String SOLUONG = "^[1-9]|[1][0-9]$";
    private static final String SOTANG = "^[1-9][0-9]?$";

    public static String dienTich() {
        while (true) {
            String dienTich = sc.nextLine();
            if (Pattern.matches(DIENTICH, dienTich) || Pattern.matches(DIENTICH1, dienTich)) {
                return dienTich;
            } else {
                System.err.println("mời bạn nhập lại diện tích phải lớn hơn 30 .");
            }
        }
    }

    public static String maDichVu() {
        while (true) {
            String maDichVu = sc.nextLine();
            if (Pattern.matches(MADICHVU, maDichVu)) {
                return maDichVu;
            } else {
                System.out.println("mời bạn nhập lại mã dịch vụ .");
            }
        }
    }

    public static String chiPhi() {
        while (true) {
            String chiPhi = sc.nextLine();
            if (Pattern.matches(CHIPHI, chiPhi)) {
                return chiPhi;
            } else {
                System.out.println("mời bạn nhập lại Chi phí .");
            }
        }
    }

    public static String tieuChuanPhong() {
        while (true) {
            String tieuChuanPhong = sc.nextLine();
            if (Pattern.matches(TIEUCHUANPHONG, tieuChuanPhong)) {
                return tieuChuanPhong;
            } else {
                System.out.println("mới bạn nhập lại tiêu chuẩn phòng .");
            }
        }
    }

    public static String soLuong() {
        while (true) {
            String soLuong = sc.nextLine();
            if (Pattern.matches(SOLUONG, soLuong)) {
                return soLuong;
            } else {
                System.out.println("mời bạn nhập lại số lượng .");
            }
        }
    }

    public static String soTang() {
        while (true) {
            String soTang = sc.nextLine();
            if (Pattern.matches(SOTANG, soTang)) {
                return soTang;
            } else {
                System.out.println("mời bạn nhập lại số tầng .");
            }
        }
    }
}
