package hethongquanlyungvien;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFileKinhNghiem {
    static File file = new File("src\\hethongquanlyungvien\\FileKinhNghiem.csv");

    public static void write(List<KinhNghiem> kinhNghiems) {
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (KinhNghiem o : kinhNghiems) {
                bufferedWriter.write(o.kinhNghiem());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<KinhNghiem> read() {
        List<KinhNghiem> kinhNghiems = new ArrayList<>();
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
                int namKinhNghiem = Integer.parseInt(doc[7]);
                String kyNangChuyenMon = doc[8];
                KinhNghiem kinhNghiem = new KinhNghiem(id, hoVaTen, ngaySinh, diaChi, soDienThoai, email,
                        loaiUngVien, namKinhNghiem, kyNangChuyenMon);
                kinhNghiems.add(kinhNghiem);
            }
        } catch (IOException e) {
            System.out.println("bạn nhập không đúng yêu cầu nhập lại");
            e.printStackTrace();
        }
        return kinhNghiems;
    }
}
