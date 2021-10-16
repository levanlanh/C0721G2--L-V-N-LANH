package hethongquanlysinhvien;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    static final File file = new File("src\\hethongquanlysinhvien\\thongtin");

    public static void write(List<SinhVien> sinhViens) {
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (SinhVien o : sinhViens) {
                bufferedWriter.write(o.thongTinSinhVien());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<SinhVien> read() {
        List<SinhVien> sinhViens = new ArrayList<>();
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
                String maSinhVien = doc[0];
                String ten = doc[1];
                String diaChi = doc[2];
                Double diemSo = Double.parseDouble(doc[3]);
                SinhVien sinhVien = new SinhVien(maSinhVien, ten, diaChi, diemSo);
                sinhViens.add(sinhVien);
            }
        } catch (IOException e) {
            System.out.println("bạn nhập không đúng yêu cầu nhập lại");
            e.printStackTrace();
        }
        return sinhViens;
    }
}
