package bai5_access_modifier_static_menthod_static_property.exercise.accessmodifier;

public class Circle {
    private double radius = 1.0;
    private String color = "red";
    Circle(){

    }
    Circle(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return  this.radius*this.radius*Math.PI ;
    }
}
