package bai16_io_text_file.exercise.copyfiletext;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
    public List<String> readFile(String filePath) {
        List<String> list = new ArrayList<>();
        try {
            File file = new File(filePath);

            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine()) != null) {
                list.add((line));
            }
            br.close();
        } catch (Exception e) {
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }
        return list;
    }

    public void writeFile(String filePanth, List<String> list) {
        try {
            FileWriter fileWriter = new FileWriter(filePanth, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (String lists : list) {
                bufferedWriter.write(lists);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
