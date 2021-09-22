package casetudy_module2.models;

import casetudy_module2.Person;

public class Customer extends Person {
    private int maKH;
    private String loaiKH;
    private String diaChi;


    public Customer(String name, String ngaySinh, boolean gioiTinh, int soCMND, String soDT, String email, int maKH, String loaiKH, String diaChi) {
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
}
