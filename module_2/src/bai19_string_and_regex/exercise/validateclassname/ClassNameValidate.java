package bai19_string_and_regex.exercise.validateclassname;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassNameValidate {
    //    Bắt đầu bằng một ký tự chữ hoa C hoặc A hoặc P
//
//    Không chứa các ký tự đặc biệt
//
//    Theo sau ký tự bắt đầu là 4 ký tự số
//
//    Kết thúc phải là 1 trong những ký tự chữ hoa sau: G, H, I, K, L, M
    public static final String CLASS_NAME_REGEX = "^[CAP]\\d{4}[GHIKLM]$";

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile(CLASS_NAME_REGEX);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("nhập vào tại đây :");
            String input = scanner.nextLine();
            Matcher matcher = pattern.matcher(input);
            if (matcher.matches()) {
                System.out.println("Oke");
                break;
            } else {
                System.err.println("Not Oke");
            }
        }
    }
}
