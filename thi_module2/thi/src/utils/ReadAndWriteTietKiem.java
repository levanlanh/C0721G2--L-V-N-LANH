package utils;

import model.TaiKhoangThanhToan;
import model.TaiKhoangTietKiem;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteTietKiem {
    static File file = new File("D:\\C0721G2--L-V-N-LANH\\thi\\src\\data\\file_tietkiem.csv");

    public static void write(List<TaiKhoangTietKiem> taiKhoangTietKiems) {
        try {
            FileWriter fileWriter = new FileWriter(file, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (TaiKhoangTietKiem o : taiKhoangTietKiems) {
                bufferedWriter.write(o.taiKhoanTietKiem());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<TaiKhoangTietKiem> read() {
        List<TaiKhoangTietKiem> taiKhoangTietKiems = new ArrayList<>();
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
                int idTaiKhoan = Integer.parseInt(doc[0]);
                String maTaiKhoan = doc[1];
                String tenChuTaiKhoan = doc[2];
                String ngayTaoTaiKhoan = doc[3];
                double soTienGuiTietKiem = Double.parseDouble(doc[4]);
                String ngayGuiTietKiem = doc[5];
                double laiSuat = Double.parseDouble(doc[6]);
                String kiHanVay = doc[7];

                TaiKhoangTietKiem taiKhoangTietKiem = new TaiKhoangTietKiem(idTaiKhoan, maTaiKhoan, tenChuTaiKhoan, ngayTaoTaiKhoan
                        , soTienGuiTietKiem, ngayGuiTietKiem, laiSuat, kiHanVay);
                taiKhoangTietKiems.add(taiKhoangTietKiem);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Bạn nhập không đúng .");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return taiKhoangTietKiems;
    }
}
