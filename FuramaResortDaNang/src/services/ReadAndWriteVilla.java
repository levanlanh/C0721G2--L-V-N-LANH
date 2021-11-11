package services;

import models.Customer;
import models.Facility;
import models.Villa;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ReadAndWriteVilla {
    static File file = new File("D:\\C0721G2--L-V-N-LANH\\FuramaResortDaNang\\src\\data\\file_villa.csv");

    public static void write(Map<Facility, Integer> villas) {
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Map.Entry<Facility, Integer> o : villas.entrySet()) {
                bufferedWriter.write(o.getKey().facility() + "," + o.getValue());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Map<Facility, Integer> read() {
        Map<Facility, Integer> villas = new LinkedHashMap<>();
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
                String tenDichVu = doc[0];
                double dienTichSuDung = Double.parseDouble(doc[1]);
                double chiPhiThue = Double.parseDouble(doc[2]);
                int soLuongNguoiToiDa = Integer.parseInt(doc[3]);
                String kieuThue = doc[4];
                String tieuChuanPhong = doc[5];
                double dienTichHoBoi = Double.parseDouble(doc[6]);
                int soTang = Integer.parseInt(doc[7]);
                Villa villa = new Villa(tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoiToiDa, kieuThue, tieuChuanPhong
                        , dienTichHoBoi, soTang);
                villas.put(villa, Integer.parseInt(doc[8]));
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return villas;
    }
}
