package models;

public class RapPhim {
    private String maSuatChieu;
    private String tenPhim;
    private String ngayChieu;
    private int soLuongVe;

    public RapPhim(String maSuatChieu, String tenPhim, String ngayChieu, int soLuongVe) {
        this.maSuatChieu = maSuatChieu;
        this.tenPhim = tenPhim;
        this.ngayChieu = ngayChieu;
        this.soLuongVe = soLuongVe;
    }

    public String getMaSuatChieu() {
        return maSuatChieu;
    }

    public void setMaSuatChieu(String maSuatChieu) {
        this.maSuatChieu = maSuatChieu;
    }

    public String getTenPhim() {
        return tenPhim;
    }

    public void setTenPhim(String tenPhim) {
        this.tenPhim = tenPhim;
    }

    public String getNgayChieu() {
        return ngayChieu;
    }

    public void setNgayChieu(String ngayChieu) {
        this.ngayChieu = ngayChieu;
    }

    public int getSoLuongVe() {
        return soLuongVe;
    }

    public void setSoLuongVe(int soLuongVe) {
        this.soLuongVe = soLuongVe;
    }
public String getRapPhim (){
        return maSuatChieu+","+tenPhim+","+ngayChieu+","+soLuongVe;
}
    @Override
    public String toString() {
        return "RapPhim{" +
                "maSuatChieu=" + maSuatChieu +
                ", tenPhim='" + tenPhim + '\'' +
                ", ngayChieu='" + ngayChieu + '\'' +
                ", soLuongVe=" + soLuongVe +
                '}';
    }
}
