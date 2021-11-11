package bai17_binary_file_serialization.practice.docghidanhsachsinhvien;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void writeToObject(File file, List<Student> students) {
        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(students);
            fos.close();
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        File file = new File("D:\\C0721G2--L-V-N-LANH\\module_2\\src\\bai17_binary_file_serialization\\practice\\docghidanhsachsinhvien\\student.txt");
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Vũ Kiều Anh", "Hà Nội"));
        students.add(new Student(2, "Nguyễn Minh Quân", "Hà Nội"));
        students.add(new Student(3, "Đặng Huy Hoà", "Đà Nẵng"));
        students.add(new Student(4, "Nguyễn Khánh Tùng", "Hà Nội"));
        students.add(new Student(5, "Nguyễn Khắc Nhật", "Hà Nội"));
        writeToObject(file, students);
        List<Student> students1 = readDataFromFile (file);
        for ( Student sr: students1) {
            System.out.println(sr);
        }
    }

    public static List<Student> readDataFromFile(File file) {
        List<Student> students = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            students = (List<Student>) ois.readObject();
            fis.close();
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return students;
    }
}
