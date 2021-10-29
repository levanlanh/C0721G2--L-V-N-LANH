package services;

public class Customer extends Person {
    private String maKhachHang;
    private String loaiKhachHang;
    private String diaChi;

    public static final String DIAMOND = "diamond";
    public static final String PLATINIUM = "platinium";
    public static final String GOLD = "gold";
    public static final String SILVER = "silver";
    public static final String MEMBER = "member";

    public Customer(String hoVaTen, String ngaySinh, String gioiTinh, int soCMND, int soDienThoai, String email,
                    String maKhachHang, String loaiKhachHang, String diaChi) {
        super(hoVaTen, ngaySinh, gioiTinh, soCMND, soDienThoai, email);
        this.maKhachHang = maKhachHang;
        this.loaiKhachHang = loaiKhachHang;
        this.diaChi = diaChi;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getLoaiKhachHang() {
        return loaiKhachHang;
    }

    public void setLoaiKhachHang(String loaiKhachHang) {
        this.loaiKhachHang = loaiKhachHang;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return "Customer{" + super.toString() +
                "maKhachHang='" + maKhachHang + '\'' +
                ", loaiKhachHang='" + loaiKhachHang + '\'' +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }
}
