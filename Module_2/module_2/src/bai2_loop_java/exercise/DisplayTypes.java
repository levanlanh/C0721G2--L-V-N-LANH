package bai2_loop_java.exercise;

import java.util.Scanner;

public class DisplayTypes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = 1;
        while (choice != 0) {
            System.out.println("Mennu");
            System.out.println("1.Print the rectangle");
            System.out.println("2.Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
            System.out.println("3.Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.println("Enter your choice : ");
            choice = input.nextInt();
            int n = 5;
            switch (choice) {
                case 1:
                    System.out.println("Print the rectangle");
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < n; j++) {
                            System.out.print(" *");
                        }
                        System.out.println("");
                    }
                    break;

                case 2:
                    System.out.println("2.Print the square triangle");
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < n - i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    break;

                case 3:
                    System.out.println("3.Print isosceles triangle");
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < n + i; j++) {
                            if (i + j < n - 1) {
                                System.out.print(" ");
                            } else {
                                System.out.print("*");
                            }

                        }
                        System.out.println("");
                    }break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println(" No choice!");
                    System.out.println("");


            }
        }
        System.out.println(choice);
    }
}

