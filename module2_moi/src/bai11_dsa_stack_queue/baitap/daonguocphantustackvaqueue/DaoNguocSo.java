package bai11_dsa_stack_queue.baitap.daonguocphantustack;

import java.util.Stack;

public class DaoNguocSo {
    public static void main(String[] args) {
        Stack<Integer> wStack = new Stack<>();
        for (int i = 0; i < 5; i++) {
            wStack.add(i);
        }
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
