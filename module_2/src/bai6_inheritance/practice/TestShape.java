package bai6_inheritance.practice;

public class TestShape {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);
        shape = new Shape("red",true);
        System.out.println(shape);

    }
}
