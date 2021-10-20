package bai12_java_collection_frame_work.thuchanh.comparableandcomparator;

public class Student implements Comparable<Student>{
    private String ten;
    private int tuoi;
    private String diaChi;

    public Student(String ten, int tuoi, String diaChi) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
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

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ten='" + ten + '\'' +
                ", tuoi=" + tuoi +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.getTen().compareTo(o.getTen());
    }
}
