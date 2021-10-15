package bai10_danhsach.baitap.arraylist;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> elementsArray = new MyList<Integer>();
        elementsArray.add(0, 1);
        elementsArray.add(1, 2);
        elementsArray.add(2, 3);
        elementsArray.add(3, 4);
        elementsArray.add(4, 5);
        System.out.println("Current size: " + elementsArray.size());
        for (int i = 0; i < elementsArray.size(); i++) {
            System.out.println("element " + i + ": " + +elementsArray.get(i));
        }
        System.out.println("--------------------------");
        elementsArray.remove(3);

        System.out.println("Current size: " + elementsArray.size());
        for (int i = 0; i < elementsArray.size(); i++) {
            System.out.println("element " + i + ": " + +elementsArray.get(i));
        }
        System.out.println("--------------------------");

        MyList<Integer> newList = elementsArray.clone();
        for (int i = 0; i < newList.size(); i++) {
            System.out.println("element " + 0 + ": " + newList.get(0));
            System.out.println("element " + 1 + ": " + newList.get(1));
            System.out.println("element " + 3 + ": " + newList.get(3));
        }
        System.out.println("Number 1 in list is: " + elementsArray.contains(1));
        System.out.println("--------------------------");
        System.out.println("Position of number 3 in list: " + elementsArray.indexOf(3));
        System.out.println("--------------------------");
        elementsArray.clear();
        System.out.println("Current size: " + elementsArray.size());
    }
}
