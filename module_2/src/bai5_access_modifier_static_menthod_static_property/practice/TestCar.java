package bai5_access_modifier_static_menthod_static_property.practice;

public class TestCar {
    public static void main(String[] args) {

        Car car1 = new Car("Mazda 3", "Skyactiv 3");

        System.out.println(Car.numberOfCars);

        Car car2 = new Car("Mazda 6", "Skyactiv 6");

        System.out.println(Car.numberOfCars);

    }
    }

