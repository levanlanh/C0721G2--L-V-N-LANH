package model;

public class TaiKhoangThanhToan extends NganHang {
    private int soThe;
    private double soTienTrongThe;

    public TaiKhoangThanhToan(int idTaiKhoang, String maTaiKhoang, String tenChuTaiKhoang, String ngayTaoTaiKhoang,
                              int soThe, double soTienTrongThe) {
        super(idTaiKhoang, maTaiKhoang, tenChuTaiKhoang, ngayTaoTaiKhoang);
        this.soThe = soThe;
        this.soTienTrongThe = soTienTrongThe;
    }


    public int getSoThe() {
        return soThe;
    }

    public void setSoThe(int soThe) {
        this.soThe = soThe;
    }

    public double getSoTienTrongThe() {
        return soTienTrongThe;
    }

    public void setSoTienTrongThe(double soTienTrongThe) {
        this.soTienTrongThe = soTienTrongThe;
    }

    @Override
    public String toString() {
        return "TaiKhoangThanhToan{" +super.toString()+
                "soThe=" + soThe +
                ", soTienTrongThe=" + soTienTrongThe +
                '}';
    }

    public String taiKhoanThanhToan(){
        return getIdTaiKhoang() + "," + getMaTaiKhoang() + "," + getTenChuTaiKhoang() + "," + getNgayTaoTaiKhoang()
                + "," + soThe+","+soTienTrongThe;
    };
}
