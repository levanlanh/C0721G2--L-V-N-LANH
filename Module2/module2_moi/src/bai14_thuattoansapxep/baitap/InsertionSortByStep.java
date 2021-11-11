package bai14_thuattoansapxep.baitap;

import java.util.Arrays;

public class InsertionSortByStep {
    static int []list2 = {123,12,3,55,44,4,1,2} ;
    public static void insertionSort(int []list){
        int i ,value ,position;
        for(i = 1 ; i < list.length;i++){
            value = list[i] ;
            position = i ;
            while(position > 0 && list[position-1] > value){
                list[position] = list[position-1];
                position--;
                System.out.println("di chuyển phần tử :" + list[position]);
            }
            if(position != i ){
                System.out.println("chèn phần tử : " + value
                        + " ví trí :" + position);
                list[position] = value ;
            }
            System.out.println("vòng lặp :" + i );
            System.out.println(Arrays.toString(list));

        }
    }
    public static void main(String[] args) {
        insertionSort(list2);
    }
}
