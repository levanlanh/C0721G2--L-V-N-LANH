package demo.sort;

import java.util.Comparator;

public class SortByCatId implements Comparator<Cat> {
    @Override
    public int compare(Cat o1, Cat o2) {
        return o1.getId() - o2.getId();
    }

//    @Override
//    public int compare(Object o1, Object o2) {
//        return 0;
//    }
}
