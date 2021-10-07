package fileToCsv;

import casetudy_module2.models.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeToCsv {
    public static File file = new File("D:\\C0721G2--L-V-N-LANH\\case\\src\\data\\employee.csv");

    public static List<Employee> readEmployess() {
        List<Employee> employeeList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader br = new BufferedReader(fileReader);
            String line = " ";
            while ((line = br.readLine()) != null) {
                String[] employess = line.split(",");
                String name = employess[0];
                String ngaySinh = employess[1];
                boolean gioiTinh = Boolean.parseBoolean(employess[2]);
                int soCMND = Integer.parseInt(employess[3]);
                String soDT = employess[4];
                String email = employess[5];
                int maNhanVien = Integer.parseInt(employess[6]);
                String trinhDo = employess[7];
                String viTri = employess[8];
                double luong = Double.parseDouble(employess[9]);
                employeeList.add( new Employee(name,ngaySinh,gioiTinh,soCMND,soDT,email,maNhanVien,trinhDo,viTri,luong));
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("không đọc được file");
        }
        return employeeList;
    }

    public static void writeEmployee(List<Employee> employees) {
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Employee employee : employees) {
                bufferedWriter.write(employee.getEmbloyee());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


