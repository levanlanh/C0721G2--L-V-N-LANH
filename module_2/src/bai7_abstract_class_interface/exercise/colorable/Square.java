package bai7_abstract_class_interface.exercise.colorable;

import bai7_abstract_class_interface.exercise.interface_resizeable.Rectangle;
import bai7_abstract_class_interface.exercise.interface_resizeable.Resizeable;
import bai7_abstract_class_interface.exercise.interface_resizeable.Shape;

public class Square extends Rectangle implements Colorable{
    private double size = 5.0;

    public Square() {
    }

    public Square(double size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getArea() {
        return this.size * this.size;
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSize()
                + " with area is "
                + getArea();
    }


    @Override
    public void howToColor() {
        System.out.println("Color all four sides..");
    }
}
