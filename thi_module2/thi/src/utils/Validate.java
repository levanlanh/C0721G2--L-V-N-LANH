package utils;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Validate {
    static Scanner sc = new Scanner(System.in);

    public static final String REGEX_SOTIENTIETKIEM = "^[1-9]*$";
    public static final String REGEX_SOTHE = "^[1-9]*$";
    public static final String REGEX_SOTAIKHOAN = "^[1-9]*$";

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
}
