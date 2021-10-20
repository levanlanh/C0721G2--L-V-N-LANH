package quanlibophim;

public class BoPhim {
    private String tenPhim;
    private int nam;
    private HangSanXuat hangSanXuat;
    private double giaVe;
    private Ngay ngayChieu;

    public BoPhim(String tenPhim, int nam, HangSanXuat hangSanXuat, double giaVe, Ngay ngayChieu) {
        this.tenPhim = tenPhim;
        this.nam = nam;
        this.hangSanXuat = hangSanXuat;
        this.giaVe = giaVe;
        this.ngayChieu = ngayChieu;
    }

    public String getTenPhim() {
        return tenPhim;
    }

    public void setTenPhim(String tenPhim) {
        this.tenPhim = tenPhim;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    public HangSanXuat getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(HangSanXuat hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public double getGiaVe() {
        return giaVe;
    }

    public void setGiaVe(double giaVe) {
        this.giaVe = giaVe;
    }

    public Ngay getNgayChieu() {
        return ngayChieu;
    }

    public void setNgayChieu(Ngay ngayChieu) {
        this.ngayChieu = ngayChieu;
    }

    @Override
    public String toString() {
        return "BoPhim{" +
                "tenPhim='" + tenPhim + '\'' +
                ", nam=" + nam +
                ", hangSanXuat=" + hangSanXuat +
                ", giaVe=" + giaVe +
                ", ngayChieu=" + ngayChieu +
                '}';
    }

    public boolean kiemTraGiaVe(BoPhim o) {
        return this.getGiaVe() < o.getGiaVe();
    }

    public String layTenHangSanXuat() {
        return this.hangSanXuat.getTenHangSanXuat();
    }

    public double giaSauKhiKhuyenMai(double x) {
        return this.giaVe * (1 - x / 100);
    }
}
