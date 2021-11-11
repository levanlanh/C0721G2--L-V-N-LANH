package services;

import models.Booking;
import models.Customer;
import models.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ReadAndWriteBooking {
    static File file = new File("D:\\C0721G2--L-V-N-LANH\\FuramaResortDaNang\\src\\data\\file_booking.csv");

    public static void write(Set<Booking> bookings) {
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Booking o : bookings) {
                bufferedWriter.write(o.booking());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Set<Booking> read() {
        Set<Booking> bookings = new TreeSet<>();
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while (true) {
                line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                String[] booking = line.split(",");
                int maBooking = Integer.parseInt(booking[0]);
                String ngayBatDau = booking[1];
                String ngayKetThuc = booking[2];
                Customer customer = new Customer(booking[3],booking[4],booking[5],Integer.parseInt(booking[6])
                        ,Integer.parseInt(booking[7]), booking[8],booking[9],booking[10],booking[11]);

            }
            //String hoVaTen, String ngaySinh, String gioiTinh, int soCMND, int soDienThoai, String email,
            //                    String maKhachHang, String loaiKhachHang, String diaChi)
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bookings;
    }
}
