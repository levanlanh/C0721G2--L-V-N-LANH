package bai3_array_java.practice;

import java.util.Scanner;

public class FindValueInArray {
    public static void main(String[] args) {
        String[] students = {"long", "huy", "huyền", "bi"}; // khởi tạo mảng trực tiếp
        Scanner sr = new Scanner(System.in);
        System.out.println("nhập tên sinh viên : ");
        String input_name = sr.nextLine();
        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input_name)) {
                System.out.println("vị trí của sinh viên trong danh sách là : " + input_name + " là " + i);
                isExist = true;
                break;
            }
        }
        if(!isExist){
            System.out.println("không tìm thấy " + input_name + "trong danh sách");
        }
    }
}
