package bai4_class_and_object_java.exercise;

import java.util.Scanner;

class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {
        double delta;
        return delta = this.b * this.b - 4 * this.a * this.c;
    }

    public double getRoot1() {
        double r1;
        return r1 = (-this.b + Math.pow(getDiscriminant(), 0.5)) / 2 * this.a;
    }

    public double getRoot2() {
        double r2;
        return r2 = (-this.b - Math.pow(getDiscriminant(), 0.5)) / 2 * this.a;
    }

    public String display() {
        if (getDiscriminant() >= 0) {
            return ("hiển thị 2 nghiệm :" + getRoot1() + " và " + getRoot2());
        } else if (getDiscriminant() == 0) {
            return ("Phương trình có 1 nghiệm." + getRoot1());
        } else {
            return "phương trình vô nghiệm";
        }
    }

    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.println("nhập giá trị a :");
        double a = sr.nextDouble();
        System.out.println("nhập giá trị b :");
        double b = sr.nextDouble();
        System.out.println("nhập giá trị c :");
        double c = sr.nextDouble();
        QuadraticEquation result = new QuadraticEquation(a, b, c);
        System.out.println("a = " + result.getA());
        System.out.println("b = " + result.getB());
        System.out.println("c = " + result.getC());
        System.out.println("KetQua = :" + result.display());
    }
}
