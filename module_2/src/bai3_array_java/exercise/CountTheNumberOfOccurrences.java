package bai3_array_java.exercise;

import java.util.Scanner;

public class CountTheNumberOfOccurrences {
    public static void main(String[] args) {
        // ĐẾM SỐ LẦN XUẤT HIỆN CỦA 1 KÝ TỰ TRONG CHUỖI.
// Hàm str.length() trả về tổng số ký tự trong một chuỗi str
//Hàm str.charAt(i) trả về ký tự ở vị trí thứ i trong chuỗi str

        String str = "asdfgdadgfsffgds";
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập ký tự cần tìm : ");
        String kyTu = scanner.nextLine();
        for( int i = 0; i< str.length(); i++){
            if(str.charAt(i)== kyTu.charAt(0)){
                count++;
            }
        }
        System.out.println("số lần xuất hiện của ký tự " + kyTu + " là " + count);

    }
}
