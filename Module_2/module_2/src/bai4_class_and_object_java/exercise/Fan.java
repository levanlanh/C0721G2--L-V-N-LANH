package bai4_class_and_object_java.exercise;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed = this.SLOW;
    private boolean on = false;
    private int radius = 5;
    private String color = "blue";

    //Phương thức khởi tạo không tham số tạo đối tượng fan mặc định
    Fan() {

    }

    public Fan(int speed, String color, int radius, boolean on) {
        this.speed = speed;
        this.color = color;
        this.radius = radius;
        this.on = on;
    }

    public int getSpeed() {
        return speed;
    }

    public String getColor() {
        return color;
    }

    public int getRadius() {
        return radius;
    }

    public boolean getOn() {
        return on;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public String toString() {
        if (getOn()) {
            return    " quạt bật tốc độ : " + this.getSpeed() + " color : " + this.getColor() + " bán kính : " + this.getRadius();
        } else return "quạt tắt : " + "quạt màu : " + this.getColor() + " bán kính :" + getRadius();
    }


    public static void main(String[] args) {

        // tạo ra 2 đối tượng :
        Fan fan = new Fan();

        Fan fan1 = new Fan();
        fan1.setSpeed(fan1.FAST);
        fan1.setColor("yellow");
        fan1.setRadius(10);
        fan1.setOn(true);
        System.out.println(fan1.toString());



        Fan fan2 = new Fan();
        fan2.setSpeed(2);
        fan2.setColor("blue");
        fan2.setRadius(5);
        fan2.setOn(false);
        System.out.println(fan2.toString());


    }
}

