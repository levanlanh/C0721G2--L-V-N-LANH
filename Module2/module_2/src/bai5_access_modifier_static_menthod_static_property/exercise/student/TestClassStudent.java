package bai5_access_modifier_static_menthod_static_property.exercise.student;

import bai5_access_modifier_static_menthod_static_property.exercise.student.ClassStudent;

public class TestClassStudent {
    public static void main(String[] args) {
        ClassStudent student = new ClassStudent();
        student.setName("lanh");
        student.setClasses("C07");
        System.out.println(student.getName());
        System.out.println(student.getClasses());


    }
}
