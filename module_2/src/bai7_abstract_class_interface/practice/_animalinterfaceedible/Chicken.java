package bai7_abstract_class_interface.practice._animalinterfaceedible;

public class Chicken extends Animal implements Edible{
    @Override
    public String makeSound() {
        System.out.println( " ò ó o");
        return null;
    }
    @Override
    public String howToEat() {
        return "could be fried";
    }
}
