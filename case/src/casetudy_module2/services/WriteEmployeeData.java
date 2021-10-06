package casetudy_module2.services;

import casetudy_module2.models.Employee;

import java.io.*;
import java.util.List;

public class WriteEmployeeData {
    static File file = new File("src\\data\\employee.csv");
    public static void writerEmployee(List<Employee> list) {
        try {
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            for (Employee employee : list) {
                bufferedWriter.write(String.valueOf(employee));
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
