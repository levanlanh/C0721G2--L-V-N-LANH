package quanlibophim;

public class main {
    public static void main(String[] args) {
        Ngay ngay1 = new Ngay(11,3,2021);
        Ngay ngay2 = new Ngay(9,2,2025);
        Ngay ngay3 = new Ngay(18,5,2021);

        HangSanXuat hangSanXuat1 = new HangSanXuat("Hãng A","việt Nam");
        HangSanXuat hangSanXuat2 = new HangSanXuat("Hãng C","Mỹ");
        HangSanXuat hangSanXuat3 = new HangSanXuat("Hãng B","Anh");

        BoPhim boPhim1 = new BoPhim("mặt trời",2018,hangSanXuat1,250,ngay1);
        BoPhim boPhim2 = new BoPhim("hoa ban",2017,hangSanXuat2,450,ngay2);
        BoPhim boPhim3 = new BoPhim("mặt trăng",2014,hangSanXuat3,150,ngay3);

        System.out.println("so sánh giá vé bộ phim 1 có rê hơn 3 hay không : "+ boPhim1.kiemTraGiaVe(boPhim3));
        System.out.println("so sánh giá vé bộ phim 1 có rê hơn 2 hay không : "+ boPhim1.kiemTraGiaVe(boPhim2));

        System.out.println("tên hãng sản xuất phim 1 : " + boPhim1.layTenHangSanXuat());
        System.out.println("tên hãng sản xuất phim 2 : " + boPhim2.layTenHangSanXuat());
        System.out.println("tên hãng sản xuất phim 3 : " + boPhim3.layTenHangSanXuat());

        System.out.println("giá sau khi khuyến mãi bộ phim 1 là : "+ boPhim1.giaSauKhiKhuyenMai(10));
        System.out.println("giá sau khi khuyến mãi bộ phim 2 là : "+ boPhim2.giaSauKhiKhuyenMai(50));
        System.out.println("giá sau khi khuyến mãi bộ phim 3 là : "+ boPhim3.giaSauKhiKhuyenMai(20));

    }
}
