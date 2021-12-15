package bai11_dSA_stack_queue.exercise.dem_so_lan_xuat_hien_trong_chuoi_su_dung_map;

import java.util.Arrays;
import java.util.TreeMap;

public class TreeMapCount {
    public static void main(String[] args) {

        String str = "bốn năm sáu bảy tám bốn ba hai bảy";
        str.toLowerCase();
        String[] arr = str.split(" ");
        System.out.println(Arrays.toString(arr));
        TreeMap<String,Integer> treeMap = new TreeMap<>();
        for (int i = 0; i < arr.length; i++) {
           String key = arr[i];
            if (treeMap.containsKey(key)) {
                treeMap.put(key, treeMap.get(key) + 1);
            } else {
                treeMap.put(key, 1);
            }
        }
        System.out.println(treeMap);

    }

}



