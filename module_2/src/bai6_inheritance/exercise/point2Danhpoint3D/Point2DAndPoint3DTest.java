package bai6_inheritance.exercise.point2Danhpoint3D;

public class Point2DAndPoint3DTest {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        point2D.setX((float) 1.4);
        point2D.setY((float) 3.4);
        System.out.println(point2D.toString());

        Point3D point3D = new Point3D();
        point3D.setZ((float) 2.3);
        System.out.println(point3D.toString());

    }
}
