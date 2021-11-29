public class KhachHang {
    String Name;
    String dateOfBirth;
    String address;
    String img;

    public KhachHang() {
    }

    public KhachHang(String name, String dateOfBirth, String address, String img) {
        Name = name;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.img = img;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
