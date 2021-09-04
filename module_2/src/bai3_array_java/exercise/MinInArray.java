package bai3_array_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MinInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("kích thước của mảng đầu vào là : ");
        int size = scanner.nextInt();
        int[] arr = new int[size]; // khởi tạo mảng bằng từ khóa new.

        // nhập giá trị cho phần tử mảng
        System.out.println(" phần tử dầu vào : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("mảng arr là : ");
        System.out.println(Arrays.toString(arr));
        // tìm giá trị nhỏ nhất.
        int min = arr[0];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                index = i;
            }
        }
        System.out.println(" giá trị nhỏ nhất của mảng là : " + min + " vị trí là : " + index);

    }
}
