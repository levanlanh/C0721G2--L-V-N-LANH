package bai5_access_modifier_static_menthod_static_property.exercise.student;

import main.main.Student;

public class ClassStudent {
    private String name = "john";
    private String classes = "CO2";

    ClassStudent(){
    }

public ClassStudent(String name, String classes){
        this.name = name;
        this.classes = classes;
}
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getClasses() {
        return classes;
    }
}
