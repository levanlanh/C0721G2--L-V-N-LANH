package bai11_dsa_stack_queue.baitap.demsolanxuathientrongchuoi;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class DemSoLanXuatHien {
    public static void main(String[] args) {
        String str = "Hôm nay trời đẹp đẹp quá trời luôn ";
        // chuyển thành chữ thường.
        str.toLowerCase();
        // tách chuỗi thành từ đưa vào mảng.
        String[] arr = str.split(" ");
        System.out.println(Arrays.toString(arr));
        // dùng treeMap có 2 cặp key và value.
        Map<String, Integer> treeMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            String key = arr[i];
            // contains kiểm tra xem có tồn tại hay ko.
            if (treeMap.containsKey(key)) {
                int value = treeMap.get(key); // lấy value
                treeMap.put(key, value + 1);
            } else {
                treeMap.put(key, 1);
            }
        }
        System.out.println(treeMap);
    }
}
