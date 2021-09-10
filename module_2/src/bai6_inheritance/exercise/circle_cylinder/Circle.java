package bai6_inheritance.exercise.circlecylinder;

public class Circle {
    double darius ;
    String color;
    public Circle(){
    }

    public Circle(double darius, String color) {
        this.darius = darius;
        this.color = color;
    }

    public double getDarius() {
        return darius;
    }

    public void setDarius(double darius) {
        this.darius = darius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "darius=" + darius +
                ", color='" + color + '\'' +
                '}';
    }
}
