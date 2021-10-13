package demo.sort;

import java.util.Comparator;

public class SortByCatName implements Comparator<Cat> {
    @Override
    public int compare(Cat o1, Cat o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
