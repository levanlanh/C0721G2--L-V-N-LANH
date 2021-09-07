package bai4_class_and_object_java.exercise;

public class Fan {
    final int Slow = 1;
    final int Medium =2;
    final  int Fast = 3;
    private int speed = this.Slow;
    private boolean on = false;
    private int radius = 5;
    private String color = "blue";
    //Phương thức khởi tạo không tham số tạo đối tượng fan mặc định
    public void Fan (){
    }
    public Fan (int speed,String color, int radius,boolean on){
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
    public  boolean getOn(){
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
            return " quạt bật tốc độ : " + this.getSpeed() + " color : " + this.getColor() + " bán kính : " + this.getRadius();
        }else return  "quạt tắt : " + "quạt màu : " + this.getColor() + " bán kính :" + getRadius() ;
    }



    public static void main(String[] args) {

        // tạo ra 2 đối tượng :

        Fan fan1 = new Fan(3,"yellow",10,true);
        System.out.println(fan1);
        fan1.toString();


        Fan fan2 = new Fan(2,"blue",5,false);
        System.out.println(fan2);
        fan2.toString();

    }
}

