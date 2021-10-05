package casetudy_module2.models;

public abstract class Facility {
    protected String nameDv;
    protected String maDichVu;
    protected double dienTichSuDung;
    protected double chiPhiThue;
    protected int soluongNguoi;
    protected String kieuThue;

    public final static String HOURS = "hours";
    public final static String DATE = "date";
    public final static String MONTH = "month";
    public final static String YEAR= "year";

    public String getNameDv() {
        return nameDv;
    }

    public void setNameDv(String nameDv) {
        this.nameDv = nameDv;
    }

    public String getMaDichVu() {
        return maDichVu;
    }

    public void setMaDichVu(String maDichVu) {
        this.maDichVu = maDichVu;
    }

    public double getDienTichSuDung() {
        return dienTichSuDung;
    }

    public void setDienTichSuDung(double dienTichSuDung) {
        this.dienTichSuDung = dienTichSuDung;
    }

    public double getChiPhiThue() {
        return chiPhiThue;
    }

    public void setChiPhiThue(double chiPhiThue) {
        this.chiPhiThue = chiPhiThue;
    }

    public int getSoluongNguoi() {
        return soluongNguoi;
    }

    public void setSoluongNguoi(int soluongNguoi) {
        this.soluongNguoi = soluongNguoi;
    }

    public String getKieuThue() {
        return kieuThue;
    }

    public void setKieuThue(String kieuThue) {
        this.kieuThue = kieuThue;
    }

    public Facility(String nameDv, String maDichVu, double dienTichSuDung, double chiPhiThue, int soluongNguoi, String kieuThue) {
        this.nameDv = nameDv;
        this.maDichVu = maDichVu;
        this.dienTichSuDung = dienTichSuDung;
        this.chiPhiThue = chiPhiThue;
        this.soluongNguoi = soluongNguoi;
        this.kieuThue = kieuThue;

    }
}

