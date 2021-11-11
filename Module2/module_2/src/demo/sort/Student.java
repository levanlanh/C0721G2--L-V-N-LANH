package demo.sort;

public class Student implements Comparable{
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

//    @Override
//    public int compareTo(Student o) {
//        return 0;
//    }

    @Override
    public int compareTo(Object o) {
        if(o ==null || !(o instanceof Student)){
            return 0;
        }
        Student otherStudent = (Student) o;
//        return  otherStudent.getName().compareTo(this.name);
//        return this.name.compareTo(otherStudent.getName());
//        if(this.id > otherStudent.getId()){
//            return 10000; //tra ve so duong
//        } else if( this.id < otherStudent.getId()){
//            return -50;
//        } else {
//            return 0;
//        }

        int result =  this.id - otherStudent.getId();
        if(result == 0){
            return this.name.compareTo(otherStudent.getName());
        }
        return result;
    }
}
