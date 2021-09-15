package bai11_dSA_stack_queue.exercise.dao_nguoc_phan_tu_stack;

import java.util.Arrays;
import java.util.Stack;

public class Reverse_String_Stack {
    public static void main(String[] args) {

        String str = " hello world!";
        Stack<Character> stack = new Stack<Character>();
        char[] arr = new char[str.length()];
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            arr[i] = str.charAt(i);
        }
        System.out.println(arr);
        for (int i = 0; i < size; i++) {
            stack.push(arr[i]);
        }
        System.out.println("Mảng kí tự trước khi đảo ngược :" + stack);

        for (int i = 0; i < size; i++) {
            arr[i] = stack.pop();
        }
        System.out.println("Mảng kí tự sau khi đảo ngược :" + Arrays.toString(arr));
  }

}
