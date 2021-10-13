package bai7_abstract_class_interface.exercise.baitaplamthem;

public class Student {
    private String ten;
    private int tuoi;
    private double diem;

    public Student(String ten, int tuoi, double diem) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diem = diem;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ten='" + ten + '\'' +
                ", tuoi=" + tuoi +
                ", diem=" + diem +
                '}';
    }
}
