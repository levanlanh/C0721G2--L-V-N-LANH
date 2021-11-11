package model;

public class TaiKhoangTietKiem extends NganHang {
    private double soTienGuiTietKiem;
    private String ngayGuiTietKiem;
    private double laiSuat;
    private String KiHanVay;

    public double getSoTienGuiTietKiem() {
        return soTienGuiTietKiem;
    }

    public void setSoTienGuiTietKiem(double soTienGuiTietKiem) {
        this.soTienGuiTietKiem = soTienGuiTietKiem;
    }

    public String getNgayGuiTietKiem() {
        return ngayGuiTietKiem;
    }

    public void setNgayGuiTietKiem(String ngayGuiTietKiem) {
        this.ngayGuiTietKiem = ngayGuiTietKiem;
    }

    public double getLaiSuat() {
        return laiSuat;
    }

    public void setLaiSuat(double laiSuat) {
        this.laiSuat = laiSuat;
    }

    public String getKiHanVay() {
        return KiHanVay;
    }

    public void setKiHanVay(String kiHanVay) {
        KiHanVay = kiHanVay;
    }

    public TaiKhoangTietKiem(int idTaiKhoang, String maTaiKhoang, String tenChuTaiKhoang, String ngayTaoTaiKhoang
            , double soTienGuiTietKiem, String ngayGuiTietKiem, double laiSuat, String kiHanVay) {
        super(idTaiKhoang, maTaiKhoang, tenChuTaiKhoang, ngayTaoTaiKhoang);
        this.soTienGuiTietKiem = soTienGuiTietKiem;
        this.ngayGuiTietKiem = ngayGuiTietKiem;
        this.laiSuat = laiSuat;
        KiHanVay = kiHanVay;

    }

    @Override
    public String toString() {
        return "TaiKhoangTietKiem{" + super.toString()+
                "soTienGuiTietKiem=" + soTienGuiTietKiem +
                ", ngayGuiTietKiem='" + ngayGuiTietKiem + '\'' +
                ", laiSuat=" + laiSuat +
                ", KiHanVay='" + KiHanVay + '\'' +
                '}';
    }
    public String taiKhoanTietKiem(){
        return getIdTaiKhoang()+","+getMaTaiKhoang()+","+getTenChuTaiKhoang()+","+getNgayTaoTaiKhoang()
                +","+  soTienGuiTietKiem +","+ ngayGuiTietKiem +","+ laiSuat+","+ getKiHanVay() ;
    }
}
