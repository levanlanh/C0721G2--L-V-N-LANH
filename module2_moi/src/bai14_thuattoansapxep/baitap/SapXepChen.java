package bai14_thuattoansapxep.baitap;

import java.util.Arrays;

public class SapXepChen {
    static int[] list = {12, 14, 312, 31, 23, 123};

    public static void insertSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int temp = list[i];
            int j = i - 1;
            for (; j >= 0 && list[j] > temp ; j--) {
                list[j+1] = list[j];
            }
            list[j+1] = temp ;
        }
    }
    public static void main(String[] args) {
        insertSort(list);
        System.out.println(Arrays.toString(list));
    }
}
