package bai2_loop_java.practice;
import java.util.Scanner;
public class CheckPrimes {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.println("nhập vào số nguyên tố : ");
        int number = sr.nextInt();
        if(number < 2){
            System.out.println(number + " is not a primes");
        }else {
            int i =2 ;
            boolean check = true;
            while (i<number){
                if(number%i==0){
                    check = false;
                    break;
                }
                i++;
            }
            if(check){
                System.out.println(number+" is a primes");
            }else {
                System.out.println(number+" is not a primes");
            }
        }

    }
}
