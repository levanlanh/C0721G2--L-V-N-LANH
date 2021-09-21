package casetudy_module2.models;

import casetudy_module2.Person;

public class Customer extends Person {
    private int maKh;
    private String loaiKH;
    private String diaChi;

    public Customer() {
    }

    public Customer(int maKh, String loaiKH, String diaChi) {
        this.maKh = maKh;
        this.loaiKH = loaiKH;
        this.diaChi = diaChi;
    }

    public Customer(String name, String ngaySinh, boolean gioiTinh, int soCMND, int soDT, String email, int maKh, String loaiKH, String diaChi) {
        super(name, ngaySinh, gioiTinh, soCMND, soDT, email);
        this.maKh = maKh;
        this.loaiKH = loaiKH;
        this.diaChi = diaChi;
    }

    public int getMaKh() {
        return maKh;
    }

    public void setMaKh(int maKh) {
        this.maKh = maKh;
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
