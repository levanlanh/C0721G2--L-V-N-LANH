package models;

public abstract class Person {
    public String hoVaTen;
    public String ngaySinh;
    public String gioiTinh;
    public int soCMND;
    public int soDienThoai;
    public String email;

    public Person(String hoVaTen, String ngaySinh, String gioiTinh, int soCMND, int soDienThoai, String email) {
        this.hoVaTen = hoVaTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.soCMND = soCMND;
        this.soDienThoai = soDienThoai;
        this.email = email;
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

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getSoCMND() {
        return soCMND;
    }

    public void setSoCMND(int soCMND) {
        this.soCMND = soCMND;
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
    public String person(){
        return hoVaTen +","+ngaySinh+","+gioiTinh+","+soCMND+","+soDienThoai+","+email;
    }

    @Override
    public String toString() {
        return "hoVaTen='" + hoVaTen + '\'' +
                ", ngaySinh='" + ngaySinh + '\'' +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", soCMND=" + soCMND +
                ", soDienThoai=" + soDienThoai +
                ", email='" + email + '\'' +
                '}';
    }
}
