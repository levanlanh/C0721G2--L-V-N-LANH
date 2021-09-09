package bai6_inheritance.exercise.circlecylinder;

import java.util.Scanner;

public class TestCircleCylinder {
    public static void main(String[] args) {
        Circle circle1 = new Circle(4.0,"blue");
        Cylinder cylinder = new Cylinder(5.0,"red",5);
        System.out.println("thể tích hình trụ là :" + cylinder.TheTich() );
        System.out.println(cylinder.toString());
        System.out.println(circle1.toString());
    }
}
