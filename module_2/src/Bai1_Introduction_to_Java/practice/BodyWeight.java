package bai1_introduction_to_java.practice;

import java.util.Scanner;

public class BodyWeight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("weight :");
        double weight, height, bmi;
        System.out.println("nhập số cân nặng : ");
        weight = scanner.nextDouble();

        System.out.println("nhập số chiều cao : ");
        height = scanner.nextDouble();
        bmi = weight*Math.pow(height,2);
        System.out.println("chỉ số cơ thể là : " + bmi);

        if(bmi <18 ){
            System.out.println(bmi + " thiếu cân  ");
        }else if(bmi<25){
            System.out.println(bmi + " bình thường 'Normal' ");
        }else if(bmi <30){
            System.out.println(bmi + " thừa cân 'Overweight'");
        }else {
            System.out.println(bmi + " béo phì 'Obese'");
        }

    }
}
