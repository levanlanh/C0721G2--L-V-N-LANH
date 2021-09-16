package bai11_dSA_stack_queue.exercise.dao_nguoc_phan_tu_stack;

import java.util.Stack;

public class ReverseNumberStack {
    public static void main(String[] args) {
      Stack <Integer> wStack = new Stack<Integer>();
        for (int i = 0; i < 5; i++) {
            wStack.add(i);
        }
//        wStack.add(5);
//        wStack.add(3);
//        wStack.add(4);
//        wStack.add(7);
//        wStack.add(9);
        System.out.println("mảng trước khi đảo : " + wStack);
      Stack<Integer> wWord = new Stack<Integer>(); // tạo ra 1 mảng rỗng
        // xóa từng phần tử của wStack và đẩy vào wWord cho tới khi wStack rỗng.
      while (wStack.size()>0){
       wWord.push(wStack.remove(0));
      }
      // xóa từng phần tử khỏi wWord và đẩy trả về wStack.
      while (wWord.size()>0){
          wStack.add(wWord.pop());
      }
        System.out.println("mảng sau khi đảo ngược : " + wStack );
    }
}



