package bai10_dSA_danh_sach.exercise.phuong_thuc_cua_linkedlist;

public class MyLinkedListTest {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList mylinkedlist = new MyLinkedList(10);
        mylinkedlist.add(2,12);
        mylinkedlist.add(24);
        mylinkedlist.add(3,33);
        mylinkedlist.add(16);
        mylinkedlist.addLast(19);
        mylinkedlist.printList();
        System.out.print(mylinkedlist.contains(30));
        mylinkedlist.remove(0);
        mylinkedlist.printList();
    }
}
