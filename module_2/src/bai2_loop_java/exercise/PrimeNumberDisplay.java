package bai2_loop_java.exercise;


public class PrimeNumberDisplay {
    public static void main(String[] args) {
        int N = 0;
        int number = 2;
        int count = 0;
        boolean flag = true;
        System.out.println("hiển thị 20 phần tử số nguyên tố : ");
        while (N < 20) {
            flag = true;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(" số nguyên tố là : " + number);
                N++;
                count++;
            }
            number++;
        }
        System.out.println("số lần đếm là " + count);

    }
}


