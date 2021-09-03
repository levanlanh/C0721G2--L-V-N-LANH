package bai2_loop_java.exercise;

public class PrimeNumberDisplay100 {
    public static void main(String[] args) {

        for (int A = 2; A < 100; A++) {
            boolean flag = true;
            for (int i = 2; i < Math.sqrt(A); i++) {
                if (A % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println("số nguyên tố là : " + A);
            }
        }

    }
}
