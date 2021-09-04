package bai3_array_java.exercise;

import java.util.Scanner;

public class AddElementToArray {
    public static void main(String[] args) {

        int[] array = {3, 4, 6, 7, 8, 9};
        Scanner scanner = new Scanner(System.in);
        System.out.println(" vị trí cần chèn vào mảng : ");
        int x = scanner.nextInt();

        System.out.println("nhập giá trị cần chèn : ");
        int value = scanner.nextInt();

        System.out.println("trước khi chèn ");

        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println(" ");
        for (int i = array.length - 1; i > x; i--) {
            array[i] = array[i - 1];
        }
        array[x] = value ;
        System.out.println("sau khi chèn ");
        for (int element : array) {
            System.out.print(element + " ");
        }
    }
}
