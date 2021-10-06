package casetudy_module2.models;

public class Customer extends Person {
    private int maKH;
    private String loaiKH;
    private String diaChi;

    public final static String KIMCUONG = "kimcuong";
    public final static String BACHKIM = "bachkim";
    public final static String VANG = "vang";
    public final static String BAC = "bac";


    public Customer(String name, String ngaySinh, boolean gioiTinh, int soCMND, String soDT, String email,
                    int maKH, String loaiKH, String diaChi) {
        super(name, ngaySinh, gioiTinh, soCMND, soDT, email);
        this.maKH = maKH;
        this.loaiKH = loaiKH;
        this.diaChi = diaChi;
    }

    public int getMaKh() {
        return maKH;
    }

    public void setMaKh(int maKH) {
        this.maKH = maKH;
    }

    public String getLoaiKH() {
        return loaiKH;
    }

    public void setLoaiKH(String loaiKH) {
        this.loaiKH = loaiKH;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return "Customer{" +
                super.toString() +
                ", mã khách hàng ='" + maKH + '\'' +
                ", loại khách hàng ='" + loaiKH + '\'' +
                ", địa chỉ ='" + diaChi + '\'' +
                '}';
    }

    public String getCustomer() {
        return name + "," + ngaySinh + "," + gioiTinh + "," + soCMND + "," + soDT + "," + email + "," + maKH
                + "," + loaiKH + "," + diaChi;
    }
}

