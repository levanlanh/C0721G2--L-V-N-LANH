package bai16_io_text_file.thuchanh.timgiatrilonnhat;

import java.util.List;

public class FindMaxValue {
    public static int findMax(List<Integer> numbers) {
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)) {
                max = numbers.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile("D:\\C0721G2--L-V-N-LANH\\module2_moi\\src\\bai16_io_text_file\\thuchanh\\timgiatrilonnhat\\numbers_text");
        int maxValue = findMax(numbers);
        readAndWriteFile.writeFile("D:\\C0721G2--L-V-N-LANH\\module2_moi\\src\\bai16_io_text_file\\thuchanh\\timgiatrilonnhat\\result_text", maxValue);
    }
}
