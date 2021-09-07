package bai4_class_and_object_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class StopWatch {
    private double startTime;
    private double endTime;

    public double getStartTime() {
        return startTime;
    }

    public void setStartTime(double startTime) {
        this.startTime = startTime;
    }

    public double getEndTime() {
        return endTime;
    }

    public void setEndTime(double endTime) {
        this.endTime = endTime;
    }

    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void stop() {
        this.endTime = System.currentTimeMillis();
    }

    public double getElapsedTime() {
        double result;
        return result = (this.endTime - this.startTime);
    }

    public static void main(String[] args) {
        StopWatch watch = new StopWatch();
        watch.start();
        int[] arr = new int[100000];
        System.out.println(" tạo mảng : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.floor(((Math.random() * 100000) + 1));
        }
        Arrays.sort(arr); //sắp xếp mảng.
        System.out.print(Arrays.toString(arr) + "\n");
        watch.stop();
        System.out.println("Đã trôi qua : " + watch.getElapsedTime());


    }
}
