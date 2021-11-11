package quanlymaytinh;

public class HangSanXuat {
    private String hangSanXuat;
    private QuocGia quocGia;

    public HangSanXuat(String hangSanXuat, QuocGia quocGia) {
        this.hangSanXuat = hangSanXuat;
        this.quocGia = quocGia;
    }

    public String getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(String hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public QuocGia getQuocGia() {
        return quocGia;
    }

    public void setQuocGia(QuocGia quocGia) {
        this.quocGia = quocGia;
    }


}
