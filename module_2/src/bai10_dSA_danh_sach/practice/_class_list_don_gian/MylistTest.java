package bai10_dSA_danh_sach.practice.class_list_don_gian;
import bai10_dSA_danh_sach.practice.class_list_don_gian;
public class MylistTest {
    public static void main(String[] args) {

        bai10_dSA_danh_sach.practice.class_list_don_gian.MyList<Integer> listInteger = new MyList<Integer>();
        listInteger.add(1, 1);
        listInteger.add(1, 2);
        listInteger.add(1, 3);
        listInteger.add(1, 3);
        listInteger.add(1, 4);



        System.out.println("element 4: " + listInteger.get(4));
        System.out.println("element 1: " + listInteger.get(1));
        System.out.println("element 2: " + listInteger.get(2));

    }
}
