package bai19_string_regex.baitap.sodienthoai;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Validate {
    public static final String SODIENTHOAI = "^[(][8][4][)][-][(][0]\\d{9}[)]$";
    static Scanner sc = new Scanner(System.in);

    public static String regex(String regex, String msg) {
        while (true) {
            System.out.println(msg);
            String input = sc.nextLine();
            if (Pattern.matches(regex, input)) {
                return input;
            } else {
                System.out.println("mời bạn nhập lại ");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("nhập vào số điện thoại: ");
        String soDienThoai = Validate.regex(Validate.SODIENTHOAI,"(84)-(0xxxxxxxxx)");
    }
}
