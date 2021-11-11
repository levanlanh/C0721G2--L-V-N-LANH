package bai2_loop_java.exercise;

public class PrimeNumberDisplay100 {
    public static void main(String[] args) {

        for (int a = 2; a < 100; a++) {
            boolean flag = true;
            for (int i = 2; i < Math.sqrt(a); i++) {
                if (a % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println("số nguyên tố là : " + a);
            }
        }

    }
}
