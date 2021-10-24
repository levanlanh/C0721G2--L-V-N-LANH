package hethongquanlyungvien;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Validate {
    static Scanner sc = new Scanner(System.in);
    public static final String REGEX_NGAYSINH = "^[0-9]{4}$";
    public static final String REGEX_SODIENTHOAI = "^[0-9][0-9]{9}$";
    public static final String REGEX_NAMKINHNGHIEM = "^[0-9]?[0-9]?$";
    public static final String REGEX_EMAIL = "^.+@.+\\..+$";


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
