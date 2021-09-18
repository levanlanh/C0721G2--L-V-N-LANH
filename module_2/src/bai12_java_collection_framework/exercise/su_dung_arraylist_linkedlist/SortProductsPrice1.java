package bai12_java_collection_framework.exercise.su_dung_arraylist_linkedlist;

import java.util.Comparator;

public class SortProductsPrice1 implements Comparator<Product> {
    @Override
    public int compare(Product o2, Product o1) {

        return (int) (o1.getPrice() - (o2.getPrice()));
    }
}

