package casetudy_module2.models;

import casetudy_module2.Person;

public class Employee extends Person {
    protected int maNhanVien;
    protected String trinhDo;
    protected String viTri;
    protected double luong;

    public Employee() {
    }

    public Employee(String name,String ngaySinh, boolean gioiTinh, int soCMND, int soDT, String email, int maNhanVien, String trinhDo, String viTri, double luong) {
        super(name, ngaySinh, gioiTinh, soCMND, soDT, email);
        this.maNhanVien = maNhanVien;
        this.trinhDo = trinhDo;
        this.viTri = viTri;
        this.luong = luong;
    }

    public Employee(int maNhanVien, String trinhDo, String viTri, double luong) {
        this.maNhanVien = maNhanVien;
        this.trinhDo = trinhDo;
        this.viTri = viTri;
        this.luong = luong;
    }

    public int getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(int maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }
}
