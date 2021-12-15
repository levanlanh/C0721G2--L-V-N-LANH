package com.codegym;

import bai7_abstract_class_interface.exercise.interface_resizeable.Shape;

public class ShapeTest {

    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("red", false);
        System.out.println(shape);
    }
}
