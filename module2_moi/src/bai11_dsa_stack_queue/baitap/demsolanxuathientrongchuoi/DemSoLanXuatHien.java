package bai11_dsa_stack_queue.baitap.demsolanxuathientrongchuoi;


import java.util.Arrays;
import java.util.TreeMap;


public class DemSoLanXuatHien {
    public static void main(String[] args) {
        String str = "Hôm nay trời đẹp đẹp quá trời luôn ";

        // chuyển thành chữ thường.
        str.toLowerCase();

        // tách chuỗi thành từ.
        String[] arr = str.split(" ");
        System.out.println(Arrays.toString(arr));
        // dùng treeMap có 2 cặp key và value.
        TreeMap<String, Integer> treeMap = new TreeMap<>();
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
