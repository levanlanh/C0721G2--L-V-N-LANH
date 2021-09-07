package main.main;

public class main {
    public static void main(String[] args) {
        // khởi tạo đối tượng.
        Student student = new Student();


        student.setName("lanh");
        student.setBirthday(1999);
        student.setCode("s32");

        System.out.println("------------------------");

        System.out.println("name : "+ student.getName());
        System.out.println("code : " + student.getCode());
        System.out.println("birthday : "+ student.getBirthday());

    }
}
