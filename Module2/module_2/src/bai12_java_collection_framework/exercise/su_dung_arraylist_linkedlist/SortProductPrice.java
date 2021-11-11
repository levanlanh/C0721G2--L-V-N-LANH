package bai12_java_collection_framework.exercise.su_dung_arraylist_linkedlist;

import java.util.Comparator;

public class SortProductPrice implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {

        return (int) (o1.getPrice() - (o2.getPrice()));
    }
}

