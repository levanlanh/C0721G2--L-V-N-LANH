package bai10_danhsach.baitap.linkedlist;

public class MyLinkedListTest {
    public static void main(String[] args) {
        System.out.println("Test");
        MyLinkedList<Integer> linkedList = new MyLinkedList(10);
        MyLinkedList<Integer> linkedList1 ;
        linkedList.addFirst(11);
        linkedList.addFirst(12);
        linkedList.addFirst(13);
        linkedList.add(4,9);
        linkedList.add(4,9);
        linkedList.addLast(15);
        linkedList.remove(2);
        System.out.println(linkedList.contains(9));
        System.out.println("--------------------------");
        linkedList1 = linkedList.clone();
        for(int i=0; i<linkedList1.size(); i++) {
            System.out.println("Elements at: " + (i+1) + " is " + linkedList1.get(i));
        }
        System.out.println("--------------------------");
        System.out.println("Index 3: " + linkedList.indexOf(3));// đã xóa 9.
        System.out.println("--------------------------");
        System.out.println("Size : " + linkedList.size());
        System.out.println("--------------------------");
        System.out.println("Element at 4: " + linkedList.get(4));
        System.out.println("--------------------------");
        linkedList.printList();
    }
}
