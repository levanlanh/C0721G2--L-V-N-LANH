package services;

import models.Facility;
import models.Room;
import models.Villa;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class ReadAndWriteRoom {
    static File file = new File("D:\\C0721G2--L-V-N-LANH\\FuramaResortDaNang\\src\\data\\file_room.csv");

    public static void write(Map<Facility, Integer> rooms) {
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Map.Entry<Facility, Integer> o : rooms.entrySet()) {
                bufferedWriter.write(o.getKey().facility() + "," + o.getValue());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Map<Facility, Integer> read() {
        Map<Facility, Integer> rooms = new LinkedHashMap<>();
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
                String dichVuMienPhi = doc[5];
                Facility room = new Room(tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoiToiDa, kieuThue,dichVuMienPhi );
                rooms.put(room, Integer.parseInt(doc[6]));
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return rooms;
    }
}
