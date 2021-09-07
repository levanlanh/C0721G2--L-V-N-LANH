package bai3_array_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class AddElementToArray {
    public static void main(String[] args) {
        int[] arrN = {3, 4, 5, 6, 7, 8, 9};
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập phần tử muốn chèn : ");
        int x = scanner.nextInt();
        System.out.println("nhập vị trí cần chèn :");
        int index = scanner.nextInt();
        //khai báo một mảng mới.
        int[] arrayNew = new int[arrN.length + 1];
        System.out.print("phần tử mảng mới :");
        System.out.println(Arrays.toString(arrayNew));
        if (index < -1 && index > arrN.length - 1) {
            System.out.println("không chèn được phần tử vào mảng.");
        } else {
            for (int i = 0; i < arrayNew.length; i++) {
                if (index == i) {
                    arrayNew[i] = x;
                } else if (i < index) {
                    arrayNew[i] = arrN[i];
                } else arrayNew[i] =arrN[i - 1];
            }
        }
        System.out.println("Mảng mới :");
        System.out.println(Arrays.toString(arrayNew));
    }
}

