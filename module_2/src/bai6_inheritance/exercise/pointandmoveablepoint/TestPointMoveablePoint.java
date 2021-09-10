package bai6_inheritance.exercise.pointandmoveablepoint;

import java.util.Arrays;

public class TestPointMoveablePoint {
    public static void main(String[] args) {
        Point point = new Point(2.3f,3.6f);
        System.out.println(Arrays.toString(point.getXY()));

        MoveablePoint moveablePoint = new MoveablePoint(3,4);
       moveablePoint.move();
        System.out.println(moveablePoint);
        System.out.println(moveablePoint.move().getX());
        System.out.println(moveablePoint.move().getY());





    }
}
