package bai11_dsa_stack_queue.baitap.daonguocphantustack;

import java.util.Arrays;
import java.util.Stack;

public class DaoNguocChuoi {
    public static void main(String[] args) {
        String str = "hello world!";
        Stack<Character> wStack = new Stack<>();
        char[] arr = new char[str.length()];
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            arr[i] = str.charAt(i);
        }
        System.out.println(arr);
        for (int i = 0; i < size; i++) {
            wStack.push(arr[i]);
        }
        System.out.println("mảng trước khi đảo ngược : " + wStack);
        for (int i = 0; i < size; i++) {
            arr[i] = wStack.pop();
        }
        System.out.println("mảng sau khi thay đổi : " + Arrays.toString(arr));

    }


}
