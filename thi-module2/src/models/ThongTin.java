package models;

public class ThongTin {
    private String maSoSo;
    private int maKhachHang;
    private String ngayMoSo;
    private String thoiGianGui;
    private String kyHan;
    private String soTienGui;
    private String laiSuat;
    private String uuDai;

    public ThongTin(String maSoSo, int maKhachHang, String ngayMoSo, String thoiGianGui, String kyHan,
                    String soTienGui, String laiSuat, String uuDai) {
        this.maSoSo = maSoSo;
        this.maKhachHang = maKhachHang;
        this.ngayMoSo = ngayMoSo;
        this.thoiGianGui = thoiGianGui;
        this.kyHan = kyHan;
        this.soTienGui = soTienGui;
        this.laiSuat = laiSuat;
        this.uuDai = uuDai;
    }

    public String getThongTin() {
        return maSoSo + "," + maKhachHang + "," + ngayMoSo + "," + thoiGianGui + "," + kyHan + "," + soTienGui + "," + laiSuat + "," + uuDai;
    }

    public String getMaSoSo() {
        return maSoSo;
    }

    public void setMaSoSo(String maSoSo) {
        this.maSoSo = maSoSo;
    }

    public int getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(int maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getNgayMoSo() {
        return ngayMoSo;
    }

    public void setNgayMoSo(String ngayMoSo) {
        this.ngayMoSo = ngayMoSo;
    }

    public String getThoiGianGui() {
        return thoiGianGui;
    }

    public void setThoiGianGui(String thoiGianGui) {
        this.thoiGianGui = thoiGianGui;
    }

    public String getKyHan() {
        return kyHan;
    }

    public void setKyHan(String kyHan) {
        this.kyHan = kyHan;
    }

    public String getSoTienGui() {
        return soTienGui;
    }

    public void setSoTienGui(String soTienGui) {
        this.soTienGui = soTienGui;
    }

    public String getLaiSuat() {
        return laiSuat;
    }

    public void setLaiSuat(String laiSuat) {
        this.laiSuat = laiSuat;
    }

    public String getUuDai() {
        return uuDai;
    }

    public void setUuDai(String uuDai) {
        this.uuDai = uuDai;
    }

    @Override
    public String toString() {
        return "ThongTin{" +
                "maSoSo='" + maSoSo + '\'' +
                ", maKhachHang=" + maKhachHang +
                ", ngayMoSo='" + ngayMoSo + '\'' +
                ", thoiGianGui='" + thoiGianGui + '\'' +
                ", kyHan='" + kyHan + '\'' +
                ", soTienGui='" + soTienGui + '\'' +
                ", laiSuat='" + laiSuat + '\'' +
                ", uuDai='" + uuDai + '\'' +
                '}';
    }
}
