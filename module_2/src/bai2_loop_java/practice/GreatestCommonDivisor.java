package bai2_loop_java.practice;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        int a ;
        int b;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a : ");
       a = input.nextInt();
        System.out.println("Enter b : ");
        b = input.nextInt();
        //Sử dụng hàm abs() để trả về giá trị tuyệt đối (phần dương) của a, b
        a = Math.abs(a);
        b = Math.abs(b);
         if(a == 0 || b == 0){
             System.out.println(" Đây không phải là ước chung lớn nhất.");
         }
            while ( a != b){
                if(a>b){
                    a = a-b;
                }else {
                    b = b-a;
                }
            }
        System.out.println("ước chung lớn nhất của a và b là : " + a);


    }
}
