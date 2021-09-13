package bai5_access_modifier_static_menthod_static_property.practice;

// xây dựng lớp phương thức.
public class StaticMethod {
    private int rollno ;
    private String name;
    private static String college = "BBDIT";

    // hàm khởi tạo biến.
    StaticMethod(int r, String n) {
        rollno = r;
        name = n;
    }

    // phương thức static để thay đổi giá trị của biến static.
    static void change() {
        college = "CODEGYM";
    }

    // hiển thị giá trị phương thức.
    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
}
