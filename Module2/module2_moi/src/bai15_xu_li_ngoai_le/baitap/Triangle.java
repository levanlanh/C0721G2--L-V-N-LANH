package bai15_xu_li_ngoai_le.baitap;

import java.util.Scanner;

public class Triangle {
    public void Triangle3() throws IllegalTriangleException {

        System.out.println("Nhập vào 3 cạnh của tam giác :");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào cạnh a :");
        int a = sc.nextInt();
        System.out.println("Nhập vào cạnh b :");
        int b = sc.nextInt();
        System.out.println("Nhập vào cạnh c :");
        int c = sc.nextInt();
        if (a < 0 || b < 0 || c < 0 || a + b < c || a + c < b || b + c < a) throw new IllegalTriangleException();

    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        while (true) {
            try {
                triangle.Triangle3();
                break;
            } catch (IllegalTriangleException e) {
                System.out.println(e);
                System.err.println("lỗi yêu cầu nhập lại : ");
                e.printStackTrace();
                System.out.println("nhập lại ");
            }
        }

    }
}
