package hethongquanlysinhvien;

public class SinhVien implements Comparable<SinhVien> {
    private String maSinhVien;
    private String ten;
    private String diaChi;
    private double diemSo;

    public SinhVien(String maSinhVien, String ten, String diaChi, double diemSo) {
        this.maSinhVien = maSinhVien;
        this.ten = ten;
        this.diaChi = diaChi;
        this.diemSo = diemSo;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public double getDiemSo() {
        return diemSo;
    }

    public void setDiemSo(double diemSo) {
        this.diemSo = diemSo;
    }


    @Override
    public String toString() {
        return "SinhVien{" +
                "maSinhVien='" + maSinhVien + '\'' +
                ", ten='" + ten + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", diemSo=" + diemSo +
                '}';
    }

    public String thongTinSinhVien() {
        return maSinhVien + "," + ten + "," + diaChi + "," + diemSo;
    }

    @Override
    public int compareTo(SinhVien o) {
        return (int) this.getDiemSo() - (int) o.getDiemSo();
    }
}
