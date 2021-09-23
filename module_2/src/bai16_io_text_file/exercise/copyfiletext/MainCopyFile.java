package bai16_io_text_file.exercise.copyfiletext;

import java.util.List;

public class MainCopyFile {
    public static void main(String[] args) {
        CopyFile copyFile = new CopyFile();
       List<String> list = copyFile.readFile("D:\\C0721G2--L-V-N-LANH\\module_2\\src\\bai16_text_file\\exercise\\copyfiletext\\source_file");
        copyFile.writeFile("D:\\C0721G2--L-V-N-LANH\\module_2\\src\\bai16_text_file\\exercise\\copyfiletext\\target_file",list);
    }
}
