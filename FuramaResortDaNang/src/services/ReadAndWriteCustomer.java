package services;

import models.Customer;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteCustomer {
    static File file = new File("D:\\C0721G2--L-V-N-LANH\\FuramaResortDaNang\\src\\data\\file_customer.csv");

    public static void write(List<Customer> customers) {
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Customer o : customers) {
                bufferedWriter.write(o.customer());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Customer> read() {
        List<Customer> customers = new ArrayList<>();
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
                String hoVaTen = doc[0];
                String ngaySinh = doc[1];
                String gioiTinh = doc[2];
                int soCMND = Integer.parseInt(doc[3]);
                int soDienThoai = Integer.parseInt(doc[4]);
                String email = doc[5];
                String maKhachHang = doc[6];
                String loaiKhachHang = doc[7];
                String diaChi = doc[8];
                Customer customer = new Customer(hoVaTen, ngaySinh, gioiTinh, soCMND, soDienThoai, email, maKhachHang
                        , loaiKhachHang, diaChi);
                customers.add(customer);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return customers;
    }
}
