package bai5_access_modifier_static_menthod_static_property.practice;

public class TestCar {
    public static void main(String[] args) {
        Car car1 = new Car("toyota","abc");
        System.out.println(Car.numberOfCars);
        Car ca2 = new Car("Suzuki","xyz");
        System.out.println(Car.numberOfCars);
    }
    }

