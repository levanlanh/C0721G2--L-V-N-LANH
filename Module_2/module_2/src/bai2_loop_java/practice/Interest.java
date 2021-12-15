package bai2_loop_java.practice;
import java.util.Scanner;
public class Interest {
    public static void main(String[] args) {
        double money =1.0;
        int month = 1;
        double interestRate = 1.0;
        Scanner input = new Scanner(System.in);
        System.out.println("nhập số tiền bạn gửi : ");
        money = input.nextDouble();
        System.out.println("nhập số tháng :");
        month = input.nextInt();
        System.out.println("nhập số lãi suất");
        interestRate = input.nextDouble();
        double interest = money*(interestRate/100)/12*month;
        System.out.println("só tiền lãi là : "+interest);
    }
}
