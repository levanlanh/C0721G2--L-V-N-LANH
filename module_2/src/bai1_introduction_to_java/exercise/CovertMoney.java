package bai1_introduction_to_java.exercise;
import java.util.Scanner;
public class CovertMoney {
    public static void main(String[] args) {
        double rate;
        double VND = 23000;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập giá trị số tiền USD : ");
        double USD = scanner.nextDouble();
        rate = USD*VND ;
        double rate1 = USD/VND;
        System.out.println("số tiền quy đổi từ VND sang USD là : " + rate1);
        System.out.println("số tiền quy đổi từ USD sang VND là : " + rate);
    }
}
