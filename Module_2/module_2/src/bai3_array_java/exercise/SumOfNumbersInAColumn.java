package bai3_array_java.exercise;

import java.util.Scanner;
/// TÍNH TỔNG SỐ CỘT .
public class SumOfNumbersInAColumn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số hàng : ");
        int row = scanner.nextInt();
        System.out.println("nhập số cột : ");
        int col = scanner.nextInt();
        int number[][] = new int[row][col]; // khởi tạo mảng 2 chiều.
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("nhập các phần tử : " + i + " và " + j);
                number[i][j] = scanner.nextInt(); // nhập giá trị mảng 2 chiều.
            }
        }
        // hiển thị mảng 2 chiều.
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(number[i][j] + "\t");
            }
            System.out.println();
        }
        // tính số cột
        System.out.println("số cột muốn tính là :");
        int sum = 0;
        int v = scanner.nextInt();
        for(int i = 0;i<row;i++){
            sum += number[i][v];
        }
        System.out.println("kết quả tổng số cột là " + sum);
    }
}
