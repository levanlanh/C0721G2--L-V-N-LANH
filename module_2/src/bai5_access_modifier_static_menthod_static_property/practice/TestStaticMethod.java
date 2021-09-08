package bai5_access_modifier_static_menthod_static_property.practice;

public class TestStaticMethod {
    public static void main(String[] args) {
        // Gọi phương thức thay đổi.
        StaticMethod.change();
        // tạo đối tượng
        StaticMethod s1 = new StaticMethod(12,"long");
        StaticMethod s2 = new StaticMethod(13,"linh");
        // hiển thị phương thức .
        s1.display();
        s2.display();
    }

}
