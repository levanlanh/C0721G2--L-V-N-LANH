package bai10_dSA_danh_sach.exercise.phuong_thuc_cua_arraylist;

import bai10_dSA_danh_sach.practice.class_list_don_gian.MyList;

public class _MyListTest {
    public static void main(String[] args) {
            MyList<Integer> listInteger = new MyList<Integer>();
        listInteger.add(3 ,65);
        listInteger.add(2, 12);
        listInteger.add(1,2);
        listInteger.add(4,43);
        listInteger.add(0,31);


        System.out.println("element : "+listInteger.get(0));
        System.out.println("element : "+listInteger.get(1));
        System.out.println("element : "+listInteger.get(2));
        System.out.println("element : "+listInteger.get(3));
        System.out.println("element : "+listInteger.get(4));

        }

    }

