package luyentapkethuaabtract;

public class Test {
    public static void main(String[] args) {
        HangSanXuat hangSanXuat1 = new HangSanXuat("hãng 1", " việt nam");
        HangSanXuat hangSanXuat2 = new HangSanXuat("hãng 2", " Nhật Bản");
        HangSanXuat hangSanXuat3 = new HangSanXuat("hãng 3", " Mỹ");

        PhuongTienDiChuyen oto = new XeOto("xe oto",hangSanXuat1,"xăng");
        PhuongTienDiChuyen mayBay = new MayBay("máy bay",hangSanXuat3,"dầu");
        PhuongTienDiChuyen xeDap = new XeDap("Xe đạp",hangSanXuat2);

        System.out.println("lấy tên hãng sản xuất : " + oto.layTenHangSanXuat());
        System.out.println("lấy tên hãng sản xuất : " + xeDap.layTenHangSanXuat());
        System.out.println("lấy tên hãng sản xuất : " + mayBay.layTenHangSanXuat());

        System.out.println("bắt đầu ");
        oto.batDau();
        xeDap.batDau();
        mayBay.batDau();
        System.out.println("dừng lại ");
        oto.dungLai();
        xeDap.dungLai();
        mayBay.dungLai();
        System.out.println("vận tốc của phương tiện là : ");
        System.out.println(" vận tốc oto là : "+ oto.layVanToc());
        System.out.println(" vận tốc máy bay là : "+ mayBay.layVanToc());
        System.out.println(" vận tốc xe đạp là : "+ xeDap.layVanToc());
    }
}
