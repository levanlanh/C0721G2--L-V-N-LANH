package bai4_class_and_object_java.practice;

import java.awt.*;
import java.util.Scanner;

public class Rectangle {
    double width;
    double height;

    public Rectangle() {

    }

    public Rectangle(double width, double height) {
        this.height = height;
        this.width = width;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    public String display() {
        return "Rectangle{" + "width = " + width + ", height = " + height;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter the width: ");
        double width = scanner.nextDouble();
        System.out.print("Enter the height: ");
        double height = scanner.nextDouble();

        Rectangle rectangle = new Rectangle(width, height);
        System.out.println(" Hình chữ nhật của bạn :\n" + rectangle.display());
        System.out.println("Chu vi hình chữ nhật : " + rectangle.getPerimeter());
        System.out.println("diện tích hình chữ nhật: " + rectangle.getArea());
    }

}


