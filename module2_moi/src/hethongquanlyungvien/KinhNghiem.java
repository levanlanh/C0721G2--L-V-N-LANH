package hethongquanlyungvien;

public class KinhNghiem extends UngVien {
    private int namKinhNghiem;
    private String kyNangChuyenMon;

    public KinhNghiem(int id, String hoVaTen, String ngaySinh, String diaChi, int soDienThoai, String email,
                      String loaiUngVien, int namKinhNghiem, String kyNangChuyenMon) {
        super(id, hoVaTen, ngaySinh, diaChi, soDienThoai, email, loaiUngVien);
        this.namKinhNghiem = namKinhNghiem;
        this.kyNangChuyenMon = kyNangChuyenMon;
    }

    public int getNamKinhNghiem() {
        return namKinhNghiem;
    }

    public void setNamKinhNghiem(int namKinhNghiem) {
        this.namKinhNghiem = namKinhNghiem;
    }

    public String getKyNangChuyenMon() {
        return kyNangChuyenMon;
    }

    public void setKyNangChuyenMon(String kyNangChuyenMon) {
        this.kyNangChuyenMon = kyNangChuyenMon;
    }

    public String kinhNghiem() {
        return ungVien()+ "," + namKinhNghiem+ "," +kyNangChuyenMon;
    }
}
