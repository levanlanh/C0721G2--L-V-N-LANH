package hethongquanlyungvien.utils;

import hethongquanlyungvien.models.Fresher;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFileFresher {
    static File file = new File("src\\hethongquanlyungvien\\fileFresher.csv");

    public static void write(List<Fresher> freshers) {
        try {
            FileWriter fileWriter = new FileWriter(file,true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Fresher o : freshers) {
                bufferedWriter.write(o.fresher());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Fresher> read() {
        List<Fresher> freshers = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while (true) {
                line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                String[]doc = line.split(",");
                int id = Integer.parseInt(doc[0]);
                String hoVaTen = doc[1];
                String ngaySinh = doc[2];
                String diaChi = doc[3];
                int soDienThoai = Integer.parseInt(doc[4]);
                String email = doc[5];
                String loaiUngVien = doc[6];
                String ngayTotNghiep = doc[7];
                String xepHangTotNghiep = doc[8];
                String truongDaiHoc = doc[9];
                Fresher fresher = new Fresher(id, hoVaTen, ngaySinh, diaChi, soDienThoai, email,
                        loaiUngVien, ngayTotNghiep, xepHangTotNghiep, truongDaiHoc);
                freshers.add(fresher);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Bạn nhập không đúng .");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return freshers;
    }
}