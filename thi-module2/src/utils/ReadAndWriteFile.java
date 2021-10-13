package utils;

import models.ThongTin;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    static final File file = new File("src\\thongtin.csv");

    public static void write(List<ThongTin> thongTins) {
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (ThongTin o : thongTins) {
                bufferedWriter.write(o.getThongTin());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<ThongTin> read() {
        List<ThongTin> thongTinList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while (true) {
                line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                String[] doc = line.split(",");
                String maSoSo = doc[0];
                int maKhachHang = Integer.parseInt(doc[1]);
                String ngayMoSo = doc[2];
                String thoiGianGui = doc[3];
                String kyHan = doc[4];
                String soTienGui = doc[5];
                String laiSuat = doc[6];
                String uuDai = doc[7];
                ThongTin thongTin = new  ThongTin(maSoSo,maKhachHang,ngayMoSo,thoiGianGui,kyHan,soTienGui,laiSuat,uuDai);
                thongTinList.add(thongTin);
            }
        } catch (Exception e) {
            System.err.println("bạn nhập không đúng yêu cầu nhập lại");
            e.printStackTrace();
        }
        return thongTinList;
    }
}
