package hethongquanlyungvien;

public abstract class UngVien {
    private int id;
    private String hoVaTen;
    private String ngaySinh;
    private String diaChi;
    private int soDienThoai;
    private String email;
    private String loaiUngVien;

    public UngVien(int id, String hoVaTen, String ngaySinh, String diaChi, int soDienThoai,
                   String email, String loaiUngVien) {
        this.id = id;
        this.hoVaTen = hoVaTen;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
        this.email = email;
        this.loaiUngVien = loaiUngVien;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(int soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLoaiUngVien() {
        return loaiUngVien;
    }

    public void setLoaiUngVien(String loaiUngVien) {
        this.loaiUngVien = loaiUngVien;
    }

    @Override
    public String toString() {
        return "UngVien{" +
                "id=" + id +
                ", hoVaTen='" + hoVaTen + '\'' +
                ", ngaySinh='" + ngaySinh + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", soDienThoai=" + soDienThoai +
                ", email='" + email + '\'' +
                ", loaiUngVien='" + loaiUngVien + '\'' +
                '}';
    }
}