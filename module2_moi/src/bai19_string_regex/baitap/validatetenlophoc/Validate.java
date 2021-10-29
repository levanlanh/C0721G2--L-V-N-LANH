package bai19_string_regex.baitap.validatetenlophoc;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Validate {
    public static final String TENLOPHOC = "^[C][A][P]\\d{4}[GHIKLM]$";
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
        System.out.println("nhập tên lớp học :");
        String tenLopHoc = Validate.regex(Validate.TENLOPHOC,"bắt đầu bằng CAP theo sau 4 số và kí tự [GHIKLM]");
    }
}
