package bai10_dSA_danh_sach.practice.class_list_don_gian;

import java.util.Arrays;

public class MyList<E> {
    //  Bước 1: Tạo lớp MyList với các thuộc tính như mô tả
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    // Bước 2: Cài đặt phương thức ensureCapa() mục đích tăng kích thước mảng gấp đôi
    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }
    //Bước 3: Cài đặt phương thức add() thêm phần tử vào cuối mảng .
    public void add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }
    //Bước 4: Cài đặt phương thức get()
    //Mục đích: Phương thức get() trả về phần tử vừa ở vị trí thứ i trong danh sách.
    public E get(int i) {
        if (i>= size || i <0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (E) elements[i];
    }
}