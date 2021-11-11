package quanlyquyensach;

public class Test {
    public static void main(String[] args) {
        Ngay ngay1 = new Ngay(21,3,2021);
        Ngay ngay2 = new Ngay(26,6,2021);
        Ngay ngay3 = new Ngay(30,9,2021);

        TacGia tacGia1 = new TacGia("lanh ",ngay1);
        TacGia tacGia2 = new TacGia("long ",ngay2);
        TacGia tacGia3 = new TacGia("linh ",ngay3);

        Sach sach1 = new Sach("hoa bang lan",230,2021,tacGia1);
        Sach sach2 = new Sach("hoa lan",280,2023,tacGia2);
        Sach sach3 = new Sach("tu tu",380,2021,tacGia3);

        sach1.inTenSach();
        sach3.inTenSach();
        sach2.inTenSach();
        System.out.println("--------------------");
        System.out.println("so sanh nxb sách 1 vs sách 3 : " + sach1.kiemTraCungNamXuatBan(sach3));
        System.out.println("so sanh nxb sách 1 vs sách 2 : " + sach1.kiemTraCungNamXuatBan(sach2));
        System.out.println("--------------------");
        System.out.println("sách 1 sau khi giảm 10% là : " + sach1.giaSauKhiGiam(10));
        System.out.println("sách 2 sau khi giảm 20% là : " + sach2.giaSauKhiGiam(20));
        System.out.println("sách 3 sau khi giảm 30% là : " + sach3.giaSauKhiGiam(30));
    }
}
