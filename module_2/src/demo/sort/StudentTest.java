package demo.sort;

import java.util.Arrays;

public class StudentTest {
    public static void main(String[] args) {
        Student[] studentList = new Student[5];
        studentList[0] = new Student(1, "F");
        studentList[1] = new Student(1, "A");
        studentList[2] = new Student(2, "D");
        studentList[3] = new Student(4, "B");
        studentList[4] = new Student(3, "C");

        for(Student student: studentList){
            System.out.println(student);
        }
        System.out.println("---------------------------------");
        Arrays.sort(studentList);

        for(Student student: studentList){
            System.out.println(student);
        }
    }
}
