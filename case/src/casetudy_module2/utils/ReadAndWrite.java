package casetudy_module2.utils;

import casetudy_module2.models.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    public static void writeFile( List<String> list, String path,boolean append) {
        File file = new File(path);
        try {
            FileWriter writer = new FileWriter(path,append);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            for (String string : list) {
              bufferedWriter.write(string);
              bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<String> readFIle(String path) {
        List<String> listLine = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = " ";
            while ((line = bufferedReader.readLine()) != null) {
                listLine.add(line);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listLine;
    }


}
