import java.util.*;

public class ThongTinManager {
    Scanner sc = new Scanner(System.in);
    public static List<ThongTin> thongTins = new ArrayList<>();

//    static {
//        thongTins.add(new ThongTin("BC-1234", "văn", "1.1", "dễ", "130"));
//        thongTins.add(new ThongTin("BC-1534", "Toán", "1.4", "vừa", "180"));
//    }

    public void show() {
        thongTins = ReadAndWriteFile.read();
        for (ThongTin thongtin : thongTins) {
            System.out.println(thongtin);
        }
    }

    public void add() {
        System.out.println("Nhập mã môn học ");
        String maMonHoc = Validate.maMonHoc();
        System.out.println("Tên môn học ");
        String tenMonHoc = Validate.tenMonHoc();
        System.out.println("Phiên bản ");
        String phienBan = sc.nextLine();
        System.out.println("độ khó ");
        String doKho = sc.nextLine();
        System.out.println("thời lượng học ");
        String thoiLuongHoc = sc.nextLine();
        thongTins.add(new ThongTin(maMonHoc, tenMonHoc, phienBan, doKho, thoiLuongHoc));
        ReadAndWriteFile.write(thongTins);


    }

    public void edit() {
        show();
        System.out.println("nhập tên môn học cần chỉnh sửa ");
        String tenMonHoc = sc.nextLine();
        for (ThongTin thongtin : thongTins) {
            if (thongtin.getTenMonHoc().equals(tenMonHoc)) {
                System.out.println("Phiên bản ");
                String phienBan = sc.nextLine();
                System.out.println("độ khó ");
                String doKho = sc.nextLine();
                System.out.println("thời lượng học ");
                String thoiLuongHoc = sc.nextLine();
                thongtin.setPhienBan(phienBan);
                thongtin.setDoKho(doKho);
                thongtin.setThoiLuongHoc(thoiLuongHoc);
            }
        }
    }

    public void delete() {
        show();
        System.out.println("nhập tên môn học cần xóa : ");
        String tenMonHoc = sc.nextLine();
        for (ThongTin o : thongTins) {
            if (o.getTenMonHoc().equals(tenMonHoc)) {
                thongTins.remove(o);
            }
        }
    }
}
