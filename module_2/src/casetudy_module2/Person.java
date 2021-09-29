package casetudy_module2;

public abstract class Person {
    protected String name;
    protected String ngaySinh;
    protected boolean gioiTinh;
    protected int soCMND;
    protected String soDT;
    protected String email;

    public Person(String name, String ngaySinh, boolean gioiTinh, int soCMND, String soDT, String email) {

        this.name = name;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.soCMND = soCMND;
        this.soDT = soDT;
        this.email = email;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getSoCMND() {
        return soCMND;
    }

    public void setSoCMND(int soCMND) {
        this.soCMND = soCMND;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", ngaySinh='" + ngaySinh + '\'' +
                ", gioiTinh=" + gioiTinh +
                ", soCMND=" + soCMND +
                ", soDT=" + soDT +
                ", email='" + email + '\'' +
                '}';
    }
}
