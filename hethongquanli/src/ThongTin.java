public class ThongTin {
    private String maMonHoc;
    private String tenMonHoc;
    private String phienBan;
    private String doKho;
    private String thoiLuongHoc;

    public ThongTin(String maMonHoc, String tenMonHoc, String phienBan, String doKho, String thoiLuongHoc) {
        this.maMonHoc = maMonHoc;
        this.tenMonHoc = tenMonHoc;
        this.phienBan = phienBan;
        this.doKho = doKho;
        this.thoiLuongHoc = thoiLuongHoc;
    }

    public String getMaMonHoc() {
        return maMonHoc;
    }

    public void setMaMonHoc(String maMonHoc) {
        this.maMonHoc = maMonHoc;
    }

    public String getTenMonHoc() {
        return tenMonHoc;
    }

    public void setTenMonHoc(String tenMonHoc) {
        this.tenMonHoc = tenMonHoc;
    }

    public String getPhienBan() {
        return phienBan;
    }

    public void setPhienBan(String phienBan) {
        this.phienBan = phienBan;
    }

    public String getDoKho() {
        return doKho;
    }

    public void setDoKho(String doKho) {
        this.doKho = doKho;
    }

    public String getThoiLuongHoc() {
        return thoiLuongHoc;
    }

    public void setThoiLuongHoc(String thoiLuongHoc) {
        this.thoiLuongHoc = thoiLuongHoc;
    }

    @Override
    public String toString() {
        return "ThongTin{" +
                "maMonHoc='" + maMonHoc + '\'' +
                ", tenMonHoc='" + tenMonHoc + '\'' +
                ", phienBan='" + phienBan + '\'' +
                ", doKho='" + doKho + '\'' +
                ", thoiLuongHoc='" + thoiLuongHoc + '\'' +
                '}';
    }
public String getThongTin(){
        return getMaMonHoc() +","+getTenMonHoc()+","+getPhienBan()+","+getDoKho()+","+getThoiLuongHoc();
}
}
