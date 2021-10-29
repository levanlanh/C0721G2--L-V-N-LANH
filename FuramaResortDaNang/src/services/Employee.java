package services;

public class Employee extends Person {
    private String maNhanVien;
    private String trinhDo;
    private String viTri;
    private double luong;

    public static final String TRUNGCAP = "trung cấp";
    public static final String CAODANG = "cao đẳng";
    public static final String DAIHOC = "đại học";
    public static final String SAUDAIHOC = "sau đại học";

    public static final String LETAN = " lễ tân ";
    public static final String PHUCVU = " phục vụ ";
    public static final String CHUYENVIEN = " chuyên viên ";
    public static final String GIAMSAT = " giám sát ";
    public static final String QUANLY = " quản lí ";
    public static final String GIAMDOC = " giám đốc ";

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public Employee(String hoVaTen, String ngaySinh, String gioiTinh, int soCMND, int soDienThoai, String email,
                    String maNhanVien, String trinhDo, String viTri, double luong) {
        super(hoVaTen, ngaySinh, gioiTinh, soCMND, soDienThoai, email);
        this.maNhanVien = maNhanVien;
        this.trinhDo = trinhDo;
        this.viTri = viTri;
        this.luong = luong;

    }

    @Override
    public String toString() {
        return "Employee{" + super.toString()+
                "maNhanVien='" + maNhanVien + '\'' +
                ", trinhDo='" + trinhDo + '\'' +
                ", viTri='" + viTri + '\'' +
                ", luong=" + luong +
                '}';
    }
}
