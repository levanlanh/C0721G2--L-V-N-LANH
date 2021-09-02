package bai1_introduction_to_java.exercise;
import java.util.Scanner;
class DisplayHello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập tên bạn vào đây : ");
       String name = scanner.nextLine();
        System.out.println("hello " + name);
    }
}
