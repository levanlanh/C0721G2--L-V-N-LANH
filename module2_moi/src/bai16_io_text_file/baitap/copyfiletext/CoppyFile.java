package bai16_io_text_file.baitap.copyfiletext;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CoppyFile {
    public static List<String> read(String soucre) {
        List<String> list = new ArrayList<>();
        try {
            File file = new File(soucre);
            if (!file.exists()) {
                System.out.println("file không tồn tại");
            }
            FileReader reader = new FileReader(file);
            BufferedReader buf = new BufferedReader(reader);
            String line;
            while ((line = buf.readLine()) != null) {
                list.add(line);
            }
            buf.close();
        } catch (Exception e) {
            System.out.println("lỗi đọc file");
        }
        return list;
    }

    public static void writer(String target, List<String> String) {
        File file = new File(target);
        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter br = new BufferedWriter(fw);
            for (String string : String) {
                br.write(string);
                br.newLine();
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        List<String> list = read("D:\\C0721G2--L-V-N-LANH\\module2_moi\\src\\bai16_io_text_file\\baitap\\copyfiletext\\file_1");
        writer("D:\\C0721G2--L-V-N-LANH\\module2_moi\\src\\bai16_io_text_file\\baitap\\copyfiletext\\file_2", list);
    }
}
