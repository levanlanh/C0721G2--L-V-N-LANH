package hethongquanlyungvien;

public class ThucTap extends UngVien {
    private String chuyenNganh;
    private String hocKy;
    private String tenTruongDaiHoc;

    public ThucTap(int id, String hoVaTen, String ngaySinh, String diaChi, int soDienThoai, String email,
                   String loaiUngVien, String chuyenNganh, String hocKy, String tenTruongDaiHoc) {
        super(id, hoVaTen, ngaySinh, diaChi, soDienThoai, email, loaiUngVien);
        this.chuyenNganh = chuyenNganh;
        this.hocKy = hocKy;
        this.tenTruongDaiHoc = tenTruongDaiHoc;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    public String getHocKy() {
        return hocKy;
    }

    public void setHocKy(String hocKy) {
        this.hocKy = hocKy;
    }

    public String getTenTruongDaiHoc() {
        return tenTruongDaiHoc;
    }

    public void setTenTruongDaiHoc(String tenTruongDaiHoc) {
        this.tenTruongDaiHoc = tenTruongDaiHoc;
    }

    @Override
    public String toString() {
        return "ThucTap{" +
                "chuyenNganh='" + chuyenNganh + '\'' +
                ", hocKy='" + hocKy + '\'' +
                ", tenTruongDaiHoc='" + tenTruongDaiHoc + '\'' +
                '}';
    }
}
