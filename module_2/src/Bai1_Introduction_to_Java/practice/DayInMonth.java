package Bai1_Introduction_to_Java.thuc_hanh;
import java.util.Scanner;
public class DayInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("só tháng bạn muốn đếm ngày là : ");
        int month = scanner.nextInt();
        switch (month){
            case 2 :
                System.out.println("tháng  " + month + "  là có 28 hoặc 29 ngày.");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("tháng  " + month + " là tháng có 31 ngày");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("tháng  " + month+ "  là tháng có 30 ngày");
                break;
            default:
                System.out.println("đây không phải là tháng.");

        }

    }
}
