package hethongquanlyungvien.models;



public class Fresher extends UngVien {
    private String ngayTotNghiep;
    private String xepHangTotNghiep;
    private String truongDaiHoc;

    public final static String XUATSAC = "xuatsac";
    public final static String TOT = "tot";
    public final static String KHA = "kha";
    public final static String KEM = "kem";
    public Fresher(int id, String hoVaTen, String ngaySinh, String diaChi, int soDienThoai, String email,
                   String loaiUngVien, String ngayTotNghiep, String xepHangTotNghiep, String truongDaiHoc) {
        super(id, hoVaTen, ngaySinh, diaChi, soDienThoai, email, loaiUngVien);
        this.ngayTotNghiep = ngayTotNghiep;
        this.xepHangTotNghiep = xepHangTotNghiep;
        this.truongDaiHoc = truongDaiHoc;
    }

    public String getNgayTotNghiep() {
        return ngayTotNghiep;
    }

    public void setNgayTotNghiep(String ngayTotNghiep) {
        this.ngayTotNghiep = ngayTotNghiep;
    }

    public String getXepHangTotNghiep() {
        return xepHangTotNghiep;
    }

    public void setXepHangTotNghiep(String xepHangTotNghiep) {
        this.xepHangTotNghiep = xepHangTotNghiep;
    }

    public String getTruongDaiHoc() {
        return truongDaiHoc;
    }

    public void setTruongDaiHoc(String truongDaiHoc) {
        this.truongDaiHoc = truongDaiHoc;
    }

    @Override
    public String toString() {
        return "Fresher{" + super.toString()+
                "ngayTotNghiep='" + ngayTotNghiep + '\'' +
                ", xepHangTotNghiep='" + xepHangTotNghiep + '\'' +
                ", truongDaiHoc='" + truongDaiHoc + '\'' +
                '}';
    }

    public String fresher() {
        return ungVien()+ "," +ngayTotNghiep+ "," +xepHangTotNghiep+ "," +truongDaiHoc;
    }

}
