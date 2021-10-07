import java.util.Scanner;
import java.util.regex.Pattern;

public class Validate {
    private  static Scanner sc = new Scanner(System.in);
    public static final String REGEX_MAMONHOC = "^[B][C][-][0-9]{4}$";
    public static final String REGEX_TENMONHOC = "^[A-Za-z]*$";
    public static final String REGEX_DOKHO = "^[K][H][O]|[D][E]|[B][T]$";
    public static final String REGEX_PHIENBAN = "^[0-9]*[.][0-9]*$";

public static String regex(String regex,String msg){
    while (true){
        System.out.println(msg);
        String input = sc.nextLine();
        if(Pattern.matches(regex,input)){
            return input;
        }else {
            System.out.println("mời bạn nhập lại ");
        }
    }
}
public static String msg(){
    return " có định dạnh DE KHO BT";
}}
//    public static String doKho(){
//        String input = "";
//        boolean flag = true;
//        while (flag) {
//            input = sc.nextLine();
//            if (Pattern.matches(REGEX_DOKHO, input)) {
//                System.out.println("-------------------");
//                flag = false;
//            } else {
//                System.out.println("Đầu vào không hợp lệ , có định dạng KHO,DE,BT!");
//            }
//        }
//        return input;
//    }
//    public static String maMonHoc() {
//        String input = "";
//        boolean flag = true;
//        while (flag) {
//            input = sc.nextLine();
//            if (Pattern.matches(REGEX_MAMONHOC, input)) {
//                System.out.println("-------------------");
//                flag = false;
//            } else {
//                System.out.println("Đầu vào không hợp lệ , vui lòng nhập BC-XXXX!");
//            }
//        }
//        return input;
//    }
//    public static String tenMonHoc() {
//        String input = "";
//        boolean flag = true;
//        while (flag) {
//            input = sc.nextLine();
//            if (Pattern.matches(REGEX_TENMONHOC, input)) {
//                System.out.println("-------------------");
//                flag = false;
//            } else {
//                System.out.println("Tên phim phải bắt đầu bằng chữ cái viết hóa vd :");
//            }
//        }
//        return input;
//    }
//}
