package model;

public abstract class NganHang {
    private int idTaiKhoang;
    private String maTaiKhoang;
    private String tenChuTaiKhoang;
    private String ngayTaoTaiKhoang;

    public NganHang(int idTaiKhoang, String maTaiKhoang, String tenChuTaiKhoang, String ngayTaoTaiKhoang) {
        this.idTaiKhoang = idTaiKhoang;
        this.maTaiKhoang = maTaiKhoang;
        this.tenChuTaiKhoang = tenChuTaiKhoang;
        this.ngayTaoTaiKhoang = ngayTaoTaiKhoang;
    }

    public NganHang() {

    }

    public int getIdTaiKhoang() {
        return idTaiKhoang;
    }

    public void setIdTaiKhoang(int idTaiKhoang) {
        this.idTaiKhoang = idTaiKhoang;
    }

    public String getMaTaiKhoang() {
        return maTaiKhoang;
    }

    public void setMaTaiKhoang(String maTaiKhoang) {
        this.maTaiKhoang = maTaiKhoang;
    }

    public String getTenChuTaiKhoang() {
        return tenChuTaiKhoang;
    }

    public void setTenChuTaiKhoang(String tenChuTaiKhoang) {
        this.tenChuTaiKhoang = tenChuTaiKhoang;
    }

    public String getNgayTaoTaiKhoang() {
        return ngayTaoTaiKhoang;
    }

    public void setNgayTaoTaiKhoang(String ngayTaoTaiKhoang) {
        this.ngayTaoTaiKhoang = ngayTaoTaiKhoang;
    }

    @Override
    public String toString() {
        return "NganHang{" +
                "idTaiKhoang=" + idTaiKhoang +
                ", maTaiKhoang='" + maTaiKhoang + '\'' +
                ", tenChuTaiKhoang='" + tenChuTaiKhoang + '\'' +
                ", ngayTaoTaiKhoang='" + ngayTaoTaiKhoang + '\'' +
                '}';
    }


}
