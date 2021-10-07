package models;

import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.regex.Pattern;

public class CheckValidate {
    public static SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
    public static final String REGEX_MASUATCHIEU = "^[C][I][-][0-9]{4}$";
    public static final String REGEX_TENPHIM = "^[A-Za-z]$";
    public static final String REGEX_SOLUONG = "^[3-9][0-9]$";
    protected static Scanner sc = new Scanner(System.in);

    public static String maSuatChieu() {
        String input = "";
        boolean flag = true;
        while (flag) {
            input = sc.nextLine();
            if (Pattern.matches(REGEX_MASUATCHIEU, input)) {
                System.out.println("-------------------");
                flag = false;
            } else {
                System.out.println("Đầu vào không hợp lệ , vui lòng nhập CI-XXXX!");
            }
        }
        return input;
    }

    public static String tenPhim() {
        String input = "";
        boolean flag = true;
        while (flag) {
            input = sc.nextLine();
            if (Pattern.matches(REGEX_TENPHIM, input)) {
                System.out.println("-------------------");
                flag = true;
            } else {
                System.out.println("Tên phim phải bắt đầu bằng chữ cái viết hóa vd : Hoa Bàng");
            }
        }
        return input;
    }

    public static String soLuong() {
        String input = "";
        boolean flag = true;
        while (flag) {
            input = sc.nextLine();
            if (Pattern.matches(REGEX_SOLUONG, input)) {
                System.out.println("--------------------");
                flag = false;
            } else {
                System.out.println(" số vé từ 30 trở lên và nhỏ hơn 100 ");
            }
        }
        return input;
    }
}
