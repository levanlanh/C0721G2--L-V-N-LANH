package bai3_array_java.exercise;

import java.util.Scanner;

public class SumOfNumbersOnTheDiagonal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số lượng hàng :");
        int rowArr = scanner.nextInt();
        System.out.println("nhập số lượng cột :");
        int colArr = scanner.nextInt();
        int[][] arr = new int[rowArr][colArr];
        /// người dùng nhập vào số hàng số cột :
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.println(" số lượng hàng là : " + row + " cột là " + col);
                arr[row][col] = scanner.nextInt();
            }
        }
        // hiển thị arr
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + "\t");
            }
            System.out.println();
        }
        // tính tổng các đường chéo
        int sum = 0;
        int sum1=0;
        for( int i = 0 ; i < arr.length;i++){
            for(int j = 0 ; j<arr.length;j++){
                if(i==j){
                   sum += arr[i][j];
                }
                if(i+j==arr.length-1){
                    sum1 += arr[i][j];
                }
            }

        }
        System.out.println("Tổng đường chéo chính : " + sum);
        System.out.println("Tổng đường chéo phụ : " + sum1);
    }
}