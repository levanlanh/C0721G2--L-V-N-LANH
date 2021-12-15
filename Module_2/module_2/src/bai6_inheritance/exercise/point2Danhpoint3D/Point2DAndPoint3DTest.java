package bai6_inheritance.exercise.point2Danhpoint3D;

import java.util.Arrays;

public class Point2DAndPoint3DTest {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(2.3f,3.4f);
        System.out.println("point : "+ point2D.toString() );
        System.out.println(Arrays.toString(point2D.getXY()));

        Point3D point3D = new Point3D(3.5f,2.4f,3.4f);
        System.out.println("point : "+ point3D.toString() );
        System.out.println(Arrays.toString(point3D.getXYZ()));

    }
}
