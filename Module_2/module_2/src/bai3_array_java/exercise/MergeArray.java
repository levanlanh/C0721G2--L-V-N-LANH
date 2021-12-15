package bai3_array_java.exercise;
import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        int[]arr1 = new int[3];
        int[]arr2 = new int[4];
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập giá trị các phần tử arr1 :" );
        for(int i = 0 ; i < arr1.length;i++){
            arr1[i] = scanner.nextInt();
        }
        System.out.println("nhập giá trị các phần tử arr2 :");
        for( int j = 0;j<arr2.length;j++){
            arr2[j]= scanner.nextInt();
        }
        System.out.println("Array 1 : ");
        System.out.println(Arrays.toString(arr1));
        System.out.println("Array 2 : ");
        System.out.println(Arrays.toString(arr2));
        //Tạo mảng thứ 3 có kích thước bằng kích thước mảng 1 + kích thước mảng 2
        int [] arr3 = new int[arr1.length + arr2.length];
        for( int i =0 ; i< arr1.length;i++){
            arr3[i]=arr1[i];
        }
        for(int j = 0;j<arr2.length;j++){
            arr3[j+arr1.length] = arr2[j];
        }
        System.out.println("Array 3 :");
        System.out.println(Arrays.toString(arr3));


    }
}
