package services;

import models.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteEmployee {
    static File file = new File("D:\\C0721G2--L-V-N-LANH\\FuramaResortDaNang\\src\\data\\fileemployee.csv");

    public static void write(List<Employee> employees) {
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Employee o : employees) {
                bufferedWriter.write(o.employee());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Employee> read() {
        List<Employee> employees = new ArrayList<>();
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
                String maNhanVien = doc[6];
                String trinhDo = doc[7];
                String viTri = doc[8];
                double luong = Double.parseDouble(doc[9]);
                Employee employee = new Employee(hoVaTen, ngaySinh, gioiTinh, soCMND, soDienThoai, email, maNhanVien,
                        trinhDo, viTri, luong);
                employees.add(employee);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return employees;
    }
}
