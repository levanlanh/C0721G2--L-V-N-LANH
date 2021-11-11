package bai14_thuat_toan_sap_xep.exercise;

public class MethodInsertionSort {
    public void insertionSort(int[] list) {
        int value;
        int index;

        for (int i = 1; i < list.length; i++) {
            value = list[i]; // giá trị chèn
            index = i; // vị trí cần chèn

            // kiểm tra xem số phía trước có lớn hơn số cần chèn hay không.
            while (index > 0 && value < list[index - 1]) {
                list[index] = list[index - 1];
                index--;

            }
            list[index] = value;
        }
    }

    public void display(int[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] list = {4, 7, 5, 9, 2, 3, 6};
        MethodInsertionSort methodInsertionSort = new MethodInsertionSort();
        System.out.println("mảng trước khi chưa sắp xếp : ");
        methodInsertionSort.display(list);
        methodInsertionSort.insertionSort(list);
        System.out.println("");
        System.out.println("Mảng sau khi sắp xếp : ");
        methodInsertionSort.display(list);
    }
}
