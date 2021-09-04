package bai3_array_java.exercise;

import java.util.Scanner;

public class DeleteArrayOfElements {
    public static void main(String[] args) {
        int[] number = {4, 5, 7, 8, 6, 9};
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vị trí cần xóa :");
        int x = scanner.nextInt();
        int add = number.length;
        System.out.println("trước khi xóa.");
        for( int element : number){
            System.out.print(element + " ");
        }

        System.out.println(" ");

        for (int i = x; i < number.length-1; i++) {
            number[i] = number[i + 1];
        }
        System.out.println("sau khi xóa.");
//        for( int element : number){
//            System.out.print(element + " ");
//        }
      add--;
        for (int i = 0; i < add; i++) {
            System.out.print(number[i] + " ");
        }
    }
}
