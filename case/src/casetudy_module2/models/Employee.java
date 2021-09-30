package casetudy_module2.models;

import casetudy_module2.Person;

import java.io.Serializable;

public class Employee extends Person implements Serializable {
    protected int maNhanVien;
    protected String trinhDo;
    protected String viTri;

    protected double luong;
    public final static String TRUNGHOC = "trunghoc";
    public final static String CAODANG = "caodang";
    public final static String DAIHOC = "daihoc";
    public final static String TIEUHOC = "tieuhoc";

    public final static String LETAN = "letan";
    public final static String NHANVIEN = "nhanvien";
    public final static String TAPVU = "tapvu";
    public final static String QUANLI = "quanli";
    public final static String GIAMDOC = "giamdoc";
    public final static String BAOVE = "baove";


    public Employee(String name,String ngaySinh, boolean gioiTinh, int soCMND, String soDT, String email, int maNhanVien, String trinhDo, String viTri, double luong) {
        super(name, ngaySinh, gioiTinh, soCMND, soDT, email);
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


    @Override
    public String toString() {
        return "Employee{" + super.toString()+
                "maNhanVien=" + maNhanVien +
                ", trinhDo='" + trinhDo + '\'' +
                ", vi tri =" + viTri +
                ", luong=" + luong +
                '}';
    }
}
