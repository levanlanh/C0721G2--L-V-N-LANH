package casetudy_module2.models;

public class House extends Facility {
    private int tieuChuanPhong;
    private int soTang;

    public House() {
    }

    public House(String nameDv, double dienTichSuDung, double chiPhiThue, int soluongNguoi, String kieuThue, int tieuChuanPhong, int soTang) {
        super(nameDv, dienTichSuDung, chiPhiThue, soluongNguoi, kieuThue);
        this.tieuChuanPhong = tieuChuanPhong;
        this.soTang = soTang;
    }

    public House(int tieuChuanPhong, int soTang) {
        this.tieuChuanPhong = tieuChuanPhong;
        this.soTang = soTang;
    }

    public int getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong(int tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;

    }
}
