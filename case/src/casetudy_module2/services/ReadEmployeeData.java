package casetudy_module2.services;

import casetudy_module2.models.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ReadEmployeeData {
//    static File file = new File("src\\data\\employee.csv");
//    public static Set<String> readEmployee(String pathFile){
//        List<String> list = readFIle(pathFile);
//        try {
//
//            FileReader fileReader = new FileReader(pathFile);
//            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
//            String lineEmployee = "";
//            while ((lineEmployee = bufferedReader.readLine()) != null) {
//                String[] line = lineEmployee.split(",");
//                Employee employee = new Employee(line[0], line[1], Boolean.parseBoolean(line[2]),
//                        Integer.parseInt(line[3]), line[4], line[5],
//                        Integer.parseInt(line[6]), line[7], line[8], Integer.parseInt(line[9]));
//                list.add(employee);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return readEmployee(pathFile);
//    }
//
//    private static List<String> readFIle(String pathFile) {
//        List<String> listLine = new ArrayList<>();
//        try {
//            FileReader fileReader = new FileReader(pathFile);
//            BufferedReader bufferedReader = new BufferedReader(fileReader);
//            String line = " ";
//            while ((line = bufferedReader.readLine()) != null) {
//                listLine.add(line);
//            }
//            bufferedReader.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return listLine;
//    }
}
