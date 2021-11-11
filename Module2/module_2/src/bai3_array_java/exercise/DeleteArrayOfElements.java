package bai3_array_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteArrayOfElements {
    public static void main(String[] args) {
        // C2: array 1 (len) -> array 2 (len - 1)
        Scanner scanner = new Scanner(System.in);
        int[] a = {5, 4, 9, 8, 8, 8};

        System.out.println("Input value: ");
        int value = scanner.nextInt();

        int count = 0;
        // 5, 4, 9, 12, 8
        // a.length = 6, count = 1
        for (int i = 0; i < a.length - count; i++) {
            if (a[i] == value) {
                int pos = i;

                // pos = 3, a.length = 6, count = 0
                for (int j = pos; j < a.length - count - 1; j++) {
                    a[j] = a[j + 1];
                }
                count++;
            }
        }
        int[] b = Arrays.copyOf(a, a.length - count);
        System.out.println(Arrays.toString(b));
    }
}
