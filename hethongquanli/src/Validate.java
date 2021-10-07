import java.util.Scanner;
import java.util.regex.Pattern;

public class Validate {
    private  static Scanner sc = new Scanner(System.in);
    public static final String REGEX_MAMONHOC = "^[B][C][-][0-9]{4}$";
    public static final String REGEX_TENMONHOC = "^[A-Za-z]*$";

    public static String maMonHoc() {
        String input = "";
        boolean flag = true;
        while (flag) {
            input = sc.nextLine();
            if (Pattern.matches(REGEX_MAMONHOC, input)) {
                System.out.println("-------------------");
                flag = false;
            } else {
                System.out.println("Đầu vào không hợp lệ , vui lòng nhập BC-XXXX!");
            }
        }
        return input;
    }
    public static String tenMonHoc() {
        String input = "";
        boolean flag = true;
        while (flag) {
            input = sc.nextLine();
            if (Pattern.matches(REGEX_TENMONHOC, input)) {
                System.out.println("-------------------");
                flag = false;
            } else {
                System.out.println("Tên phim phải bắt đầu bằng chữ cái viết hóa vd :");
            }
        }
        return input;
    }
}
