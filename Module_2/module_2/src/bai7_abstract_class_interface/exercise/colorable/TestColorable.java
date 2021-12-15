package bai7_abstract_class_interface.exercise.colorable;

import bai7_abstract_class_interface.exercise.interface_resizeable.Circle;
import bai7_abstract_class_interface.exercise.interface_resizeable.Rectangle;
import bai7_abstract_class_interface.exercise.interface_resizeable.Shape;
import bai7_abstract_class_interface.exercise.colorable.Square;

public class TestColorable {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Square();
        shapes[1] = new Circle();
        shapes[2] = new Rectangle();

        for (Shape shape : shapes) {
            if (shape instanceof Colorable) {
                Colorable colorable = (Square) shape;
                colorable.howToColor();
            } else if (shape instanceof Circle) {
                System.out.println("Cricle Area :" + ((Circle) shape).getArea());
            } else {
                System.out.println("Rectangle Area : " + ((Rectangle) shape).getArea());
            }
        }
    }
}
