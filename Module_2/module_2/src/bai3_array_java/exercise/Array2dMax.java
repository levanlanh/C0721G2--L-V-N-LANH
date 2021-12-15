package bai3_array_java.exercise;
import java.util.Scanner;
public class Array2dMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Nhập số hàng :");
        int arrRow = scanner.nextInt();
        System.out.println("Nhập số cột");
        int arrCol = scanner.nextInt();
        int[][] arr = new int[arrRow][arrCol];
        // người dùng nhập phần tử.
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.println("số phần tử của hàng là " + row + " cột là " + col);
                arr[row][col] = scanner.nextInt();
            }
        }
        // hiển thị arr.
        System.out.println(" hiển thị arr");
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + "  ");
            }
            System.out.println();
        }
        // tìm giá trị lớn nhất của mảng 2 chiều :
        int max = arr[0][0];
        int row = 0;
        int col = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j] ;
                    row = i;
                    col = j;
                }
            }
        }
        System.out.println(" giá trị lớn nhất của mảng 2 chiều là : " + max + " hàng " + row + " cột " + col);
    }
}