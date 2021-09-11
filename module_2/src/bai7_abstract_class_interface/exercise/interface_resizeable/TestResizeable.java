package bai7_abstract_class_interface.exercise.interface_resizeable;

public class TestResizeable {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();
        shapes[2] = new Square();
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] instanceof Circle) {
                System.out.println(((Circle) shapes[i]).getArea());
            } else if (shapes[i] instanceof Rectangle) {
                System.out.println(((Rectangle) shapes[i]).getArea());
            } else {
                System.out.println(((Square) shapes[i]).getArea());
            }
        }

        System.out.println("------------------------------");
        for (int i = 0; i < shapes.length; i++){
            double percen = (Math.random()*100)/100 ;
            if (shapes[i] instanceof Circle) {
                System.out.println(((Circle) shapes[i]).resize(percen));
            } else if (shapes[i] instanceof Rectangle) {
                System.out.println(((Rectangle) shapes[i]).resize(percen));
            } else {
                System.out.println(((Square) shapes[i]).resize(percen));
            }
    }

}}
