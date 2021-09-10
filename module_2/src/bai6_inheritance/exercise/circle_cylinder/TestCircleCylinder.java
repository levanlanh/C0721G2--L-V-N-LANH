package bai6_inheritance.exercise.circle_cylinder;

import java.util.Scanner;

public class TestCircleCylinder {
    public static void main(String[] args) {
        Circle circle1 = new Circle(4.0,"blue");
        Cylinder cylinder = new Cylinder(5.0,"red",5);
        System.out.println("thể tích hình trụ là :" + cylinder.getVolume() );
        System.out.println(cylinder.toString());
        System.out.println(circle1.toString());
    }
}
