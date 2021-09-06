package bai3_array_java.exercise;

import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        int[]arr1 = new int[6];
        int[]arr2 = new int[7];
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập giá trị phần tử arr1 :");
        for(int i = 0 ; i < arr1.length;i++){
            arr1[i] = scanner.nextInt();
        }
        System.out.println("nhập giá trị phần tử arr2 :");
        for( int j = 0;j<arr2.length;j++){
            arr2[j]= scanner.nextInt();
        }
        System.out.println();
    }
}
