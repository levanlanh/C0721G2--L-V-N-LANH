package demo.sort;

import java.util.Arrays;

public class CatTest {
    public static void main(String[] args) {
        Cat[] catList = new Cat[5];
        catList[0] = new Cat(1, "F");
        catList[1] = new Cat(1, "A");
        catList[2] = new Cat(6, "D");
        catList[3] = new Cat(4, "B");
        catList[4] = new Cat(3, "C");

//        Arrays.sort(catList, new SortByCatId());
        Arrays.sort(catList, new SortByCatName());
        for (Cat cat: catList){
            System.out.println(cat);
        }
    }
}
