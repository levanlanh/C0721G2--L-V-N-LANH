package hethongquanlysinhvien;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Validate {
    static Scanner sc = new Scanner(System.in);
    public static final String REGEX_MASINHVIEN = "^[S][T][T][-][0-9]{3}$";

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
