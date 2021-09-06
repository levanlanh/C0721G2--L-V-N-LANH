package bai4_class_and_object_java.practice;

import java.awt.*;
import java.util.Scanner;

public class RectangleClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập chiều width :");
        double width = scanner.nextDouble();
        System.out.println("nhập chiều height :");
        double height = scanner.nextDouble();

        //Khởi tạo một đối tượng thuộc lớp Rectangle với phương thức khởi tạo chứa 2 tham số width, height
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println(rectangle.display());
        System.out.printf("Diện tích hình chữ nhật là %s và width là %s height là %s \n", rectangle.getArea(), rectangle.width, rectangle.height);
        rectangle.painting();
    }
}

//Tạo lớp Rectangle, khai báo các thuộc tính (properties), định nghĩa các phương thức khởi tạo (contructors).
class Rectangle {
    double width;
    double height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Định nghĩa các phương thức hành vi getArea(), getPerimeter(), display().
    public double getArea() {
        return this.width * this.height;
    }

    public double getPrimenter() {
        return (this.width + this.height) * 2;
    }

    public String display() {
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }

    void painting() {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                System.out.print(" * ");
            }
            System.out.println("  ");
        }
    }
}

