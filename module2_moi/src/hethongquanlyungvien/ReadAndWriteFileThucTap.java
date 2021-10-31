package hethongquanlyungvien;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFileThucTap {
    static File file = new File("src\\hethongquanlyungvien\\FileThucTap.csv");

    public static void write(List<ThucTap> thucTaps) {
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (ThucTap o : thucTaps) {
                bufferedWriter.write(o.thucTap());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<ThucTap> read() {
        List<ThucTap> thucTaps = new ArrayList<>();
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
                int id = Integer.parseInt(doc[0]);
                String hoVaTen = doc[1];
                String ngaySinh = doc[2];
                String diaChi = doc[3];
                int soDienThoai = Integer.parseInt(doc[4]);
                String email = doc[5];
                String loaiUngVien = doc[6];
                String chuyenNganh = doc[7];
                String hocKy = doc[8];
                String tenTruongDaiHoc = doc[9];
                ThucTap thucTap = new ThucTap(id, hoVaTen, ngaySinh, diaChi, soDienThoai, email,
                        loaiUngVien, chuyenNganh, hocKy, tenTruongDaiHoc);
                thucTaps.add(thucTap);
            }
        } catch (IOException e) {
            System.out.println("bạn nhập không đúng yêu cầu nhập lại");
            e.printStackTrace();
        }
        return thucTaps;
    }
}
