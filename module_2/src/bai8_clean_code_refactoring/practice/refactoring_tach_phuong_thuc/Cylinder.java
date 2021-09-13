package bai8_clean_code_refactoring.practice.refactoring_tach_phuong_thuc;

public class Cylinder {
    public static double getVolume(int radius, int height){
        double baseArea = getbaseArea(radius);
        double perimeter = getPerimeter(radius);
        double volume = perimeter * height + 2 * baseArea;
        return volume;
    }
    private static double getPerimeter(int radius){
        return 2*Math.PI* radius;
    }
    private static double getbaseArea(int radius){
        return Math.PI*radius*radius;
    }
}
