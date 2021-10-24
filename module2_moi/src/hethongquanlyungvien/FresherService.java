package hethongquanlyungvien;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FresherService implements InterfaceService {
    List<Fresher> freshers = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    @Override
    public void add() {
        System.out.println("Nhập id :");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập họ và tên : ");
        String hoVaTen = sc.nextLine();
        System.out.println("Nhập ngày sinh :");
        String ngaySinh = Validate.regex(Validate.REGEX_NGAYSINH, "số có độ dài 4 kí tự ");
        System.out.println("Nhập địa chỉ : ");
        String diaChi = sc.nextLine();
        System.out.println("Nhập điện thoại : ");
        int soDienThoai = Integer.parseInt(Validate.regex(Validate.REGEX_SODIENTHOAI, "số điện thoại phải 10 số."));
        System.out.println("Nhập email : ");
        String email = Validate.regex(Validate.REGEX_EMAIL, "nhập xxxx@xxx.xxx");
        System.out.println("Nhập loại ứng viên : ");
        String loaiUngVien = sc.nextLine();
        System.out.println("Nhập ngày tốt nghiệp : ");
        String ngayTotNghiep = sc.nextLine();
        System.out.println("Nhập xếp hạng tốt nghiệp : ");
        String xepHangTotNghiep = sc.nextLine();
        System.out.println("Nhập trường đại học :");
        String truongDaiHoc = sc.nextLine();
        Fresher fresher = new Fresher(id, hoVaTen, ngaySinh, diaChi, soDienThoai, email, loaiUngVien,
                ngayTotNghiep, xepHangTotNghiep, truongDaiHoc);
        freshers.add(fresher);
    }

    @Override
    public void edit() {
        show();
        System.out.println("nhập id bạn cần chỉnh sửa : ");
        int id = Integer.parseInt(sc.nextLine());
        for (Fresher o : freshers) {
            if (o.getId() == id) {
                System.out.println("Nhập họ và tên : ");
                String hoVaTen = sc.nextLine();
                System.out.println("Nhập ngày sinh :");
                String ngaySinh = Validate.regex(Validate.REGEX_NGAYSINH, "số có độ dài 4 kí tự ");
                System.out.println("Nhập địa chỉ : ");
                String diaChi = sc.nextLine();
                System.out.println("Nhập điện thoại : ");
                int soDienThoai = Integer.parseInt(Validate.regex(Validate.REGEX_SODIENTHOAI, "số điện thoại phải 10 số."));
                System.out.println("Nhập email : ");
                String email = Validate.regex(Validate.REGEX_EMAIL, "nhập xxxx@xxx.xxx");
                System.out.println("Nhập loại ứng viên : ");
                String loaiUngVien = sc.nextLine();
                System.out.println("Nhập ngày tốt nghiệp : ");
                String ngayTotNghiep = sc.nextLine();
                System.out.println("Nhập xếp hạng tốt nghiệp : ");
                System.out.println("nhập xếp loại : " + "\n" + "1. xuất sắc" + "\n" + "2. tốt" + "\n" + "3. khá" + "\n" + "4.kém");
                int choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 1:
                        o.setXepHangTotNghiep(Fresher.XUATSAC);
                        break;
                    case 2:
                        o.setXepHangTotNghiep(Fresher.TOT);
                        break;
                    case 3:
                        o.setXepHangTotNghiep(Fresher.KHA);
                        break;
                    case 4:
                        o.setXepHangTotNghiep(Fresher.KEM);
                        break;
                }
                System.out.println("Nhập trường đại học :");
                String truongDaiHoc = sc.nextLine();
                o.setHoVaTen(hoVaTen);
                o.setNgaySinh(ngaySinh);
                o.setDiaChi(diaChi);
                o.setSoDienThoai(soDienThoai);
                o.setEmail(email);
                o.setLoaiUngVien(loaiUngVien);
                o.setNgayTotNghiep(ngayTotNghiep);
                o.setTruongDaiHoc(truongDaiHoc);
            }
        }
    }

    @Override
    public void delete() {
        show();
        System.out.println("nhập id bạn muốn xóa : ");
        int id = Integer.parseInt(sc.nextLine());
        for (Fresher o : freshers) {
            if (o.getId() == id) {
                System.out.println("bạn có chắc muốn xóa không. \n1.yes\n2.no ");
                int choice = Integer.parseInt(sc.nextLine());
                if (choice == 1) {
                    freshers.remove(o);
                }
                break;
            }
        }
    }

    @Override
    public void show() {
        for (Fresher o : freshers) {
            System.out.println(o);
        }
    }

    public void search(int id) {
        show();
        for (Fresher o : freshers) {
            if (o.getId() == id) {
                return;
            }
        }
    }
}

