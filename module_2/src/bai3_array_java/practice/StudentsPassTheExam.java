package bai3_array_java.practice;

import java.util.Scanner;

public class StudentsPassTheExam {
    public static void main(String[] args) {
        int size ;
        int[]array;
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("số lượng sinh viên là : ");
            size = scanner.nextInt();
            if(size>30){
                System.out.println("số lượng sinh viên không được quá 30");
            }
        }while (size > 30);
        // Nhập giá trị cho các phần tử của mảng.
        array = new int[size];
        for( int i = 0 ; i<array.length;i++){
            System.out.println("điểm của các sinh viên là : "+ (i+1));
            array[i]=scanner.nextInt();
            int count = 0;
            System.out.println("danh sách điểm thi :");
            for(int j = 0 ; j < array.length;j++){
                System.out.print(array[j] + "\t");
                if(array[j] > 5 && array[j] < 10){
                    count++;
                }
            }
            System.out.println();
            System.out.println("số học sinh thi đậu là : " + count);
        }
    }
}
