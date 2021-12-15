package quanlymaytinh;

public class main {
    public static void main(String[] args) {
        Ngay ngay1 = new Ngay(11, 4, 2021);
        Ngay ngay2 = new Ngay(12, 7, 2021);
        Ngay ngay3 = new Ngay(18, 2, 2009);

        QuocGia quocGia1 = new QuocGia("NB", "nhật bản");
        QuocGia quocGia2 = new QuocGia("VN", "việt nam");
        QuocGia quocGia3 = new QuocGia("USA", "mỹ");

        HangSanXuat hangSanXuat1 = new HangSanXuat("dell",quocGia1 );
        HangSanXuat hangSanXuat2 = new HangSanXuat("macbook", quocGia2);
        HangSanXuat hangSanXuat3 = new HangSanXuat("LG", quocGia3);

        MayTinh mayTinh1 = new MayTinh(hangSanXuat1,ngay1,9340000,5);
        MayTinh mayTinh2 = new MayTinh(hangSanXuat2,ngay2,6470000,9);
        MayTinh mayTinh3 = new MayTinh(hangSanXuat3,ngay3,13980000,7);
        System.out.println("kiểm tra xem giá máy tính 1 có lớn hơn 3 không : "+ mayTinh1.kiemTraGiaThapHon(mayTinh3));
        System.out.println("kiểm tra xem giá máy tính 1 có lớn hơn 2 không : "+ mayTinh1.kiemTraGiaThapHon(mayTinh2));
        System.out.println("tên quốc gia sản xuất máy tính 1 : " + quocGia1.getTenQuocGia());
        System.out.println("tên quốc gia sản xuất máy tính 2 : " + quocGia2.getTenQuocGia());
        System.out.println("tên quốc gia sản xuất máy tính 3 : " + quocGia3.getTenQuocGia());

    }
}
