package bai12_java_collection_frame_work.thuchanh.comparableandcomparator;

import java.util.*;

public class main {
    public static void main(String[] args) {
        Student student1 = new Student("hoa", 14, "hn");
        Student student2 = new Student("toàng", 44, "hn");
        Student student3 = new Student("coán", 35, "hn");
        Student student4 = new Student("oa", 44, "hn");

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        Collections.sort(students);
        for (Student o : students) {
            System.out.println(o);
        }
        // dùng comparator
        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(students, ageComparator);
        System.out.println("so sánh theo tuổi :");
        for (Student tr : students) {
            System.out.println(tr);
        }
    }
}
