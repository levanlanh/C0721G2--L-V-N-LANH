package utils;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Validate {
    private static Scanner sc = new Scanner(System.in);
    public static final String REGEX_MASOSO = "^[S][T][K][-][0-9]{4}$";
    public static final String REGEX_SOTIENGUI = "^[1-9][0-9]{6,}$";
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

