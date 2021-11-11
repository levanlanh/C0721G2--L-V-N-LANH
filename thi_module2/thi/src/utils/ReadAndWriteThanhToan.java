package utils;

import model.TaiKhoangThanhToan;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteThanhToan {
    static File file = new File("D:\\C0721G2--L-V-N-LANH\\thi\\src\\data\\file_thanhtoan.csv");

    public static void write(List<TaiKhoangThanhToan> taiKhoangThanhToans) {
        try {
            FileWriter fileWriter = new FileWriter(file, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (TaiKhoangThanhToan o : taiKhoangThanhToans) {
                bufferedWriter.write(o.taiKhoanThanhToan());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<TaiKhoangThanhToan> read() {
        List<TaiKhoangThanhToan> taiKhoangThanhToans = new ArrayList<>();
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
                int soThe = Integer.parseInt(doc[4]);
                double soTienTrongThe = Double.parseDouble(doc[5]);
                TaiKhoangThanhToan taiKhoangThanhToan = new TaiKhoangThanhToan(idTaiKhoan, maTaiKhoan, tenChuTaiKhoan, ngayTaoTaiKhoan
                        , soThe, soTienTrongThe);
                taiKhoangThanhToans.add(taiKhoangThanhToan);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Bạn nhập không đúng .");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return taiKhoangThanhToans;
    }
}
