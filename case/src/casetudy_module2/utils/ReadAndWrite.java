package casetudy_module2.utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    public static void writeFile(List<String> list, String pathFile, boolean append) {
        try {
            FileWriter fileWriter = new FileWriter(pathFile,append );
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (String line : list) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<String> readFIle(String pathFile) {
        List<String> listLine = new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(pathFile));
            String line = " ";
            String[]array = null;
            while ((line = bufferedReader.readLine()) != null) {
                array = line.split(",");
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
