package bai6_inheritance.exercise.circlecylinder;

public class Cylinder  extends Circle{
    double heigth;
    public Cylinder(){
    }

    public Cylinder(double heigth) {
        this.heigth = heigth;
    }

    public Cylinder(double darius, String color,double heigth ) {
        super(darius, color);
        this.heigth = heigth;
    }

    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }

    public double TheTich (){
        return Math.PI*this.darius*this.darius*this.heigth;
   }

    @Override
    public String toString() {
        return "Cylinder{" +
                "heigth=" + heigth +
                ", darius=" + darius +
                ", color='" + color + '\'' +
                '}';
    }
}
