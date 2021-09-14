package bai10_dSA_danh_sach.exercise.phuong_thuc_cua_arraylist;


import java.util.Arrays;

public class _MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];


    public _MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public _MyList(int capacity) {
        elements = new Object[capacity];
    }

    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }

    public void add(int index, E e) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
        } else {
            if (size == elements.length) {
                ensureCapa();
            }
            size++;
            for (int i = size - 1; i > index; i--) {
                elements[i] = elements[i - 1];
            }
            elements[index] = e;
        }
    }

    public E remove(int index) {
        ensureCapa();
        if (index >= 0 && index < size) {
            for (int i = index; i < elements.length - 1; i++) {
                elements[i] = elements[i + 1];
            }
        }
        size--;
        return (E) elements;
    }

    public int size() {
        return size;
    }

    public _MyList<E> clone(){
        _MyList<E> clone = new _MyList<>();
        for (int i=0;elements[i]!=null;i++){
            clone.add((E) elements[i]);
        }
        return clone;
    }
}
