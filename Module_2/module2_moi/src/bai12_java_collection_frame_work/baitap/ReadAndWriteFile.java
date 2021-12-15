package bai12_java_collection_frame_work.baitap;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    static File file = new File("src\\bai12_java_collection_frame_work\\baitap\\thongtin");

    public static void write(List<Product> productList) {
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Product o : productList) {
                bufferedWriter.write(o.thongTinProduct());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Product> read() {
        List<Product> productList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = " ";
            while (true) {
                line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                String[] doc = line.split(",");
                int maSanPham = Integer.parseInt(doc[0]);
                double giaSanPham = Double.parseDouble(doc[1]);
                String tenSanPham = doc[2];
                Product product = new Product(maSanPham, giaSanPham, tenSanPham);
                productList.add(product);
            }
        } catch (IOException e) {
            System.err.println("bạn nhập không đúng yêu cầu nhập lại");
            e.printStackTrace();
        }
        return productList;
    }
}
