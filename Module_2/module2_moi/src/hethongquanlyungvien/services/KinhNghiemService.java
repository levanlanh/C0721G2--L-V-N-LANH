package hethongquanlyungvien.services;

import hethongquanlyungvien.utils.ReadAndWriteFileKinhNghiem;
import hethongquanlyungvien.utils.Validate;
import hethongquanlyungvien.models.KinhNghiem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KinhNghiemService implements InterfaceService {
    Scanner sc = new Scanner(System.in);
    List<KinhNghiem> kinhNghiems = new ArrayList<>();

    public void add() {
        System.out.println("Nhập id :");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập họ và tên : ");
        String hoVaTen = Validate.regex(Validate.REGEX_HOVATEN,"ngăn cách dấu bởi nút space .");
        System.out.println("Nhập ngày sinh :");
        String ngaySinh = Validate.regex(Validate.REGEX_NGAYSINH,"số có độ dài 4 kí tự ");
        System.out.println("Nhập địa chỉ : ");
        String diaChi = sc.nextLine();
        System.out.println("Nhập điện thoại : ");
        int soDienThoai = Integer.parseInt(Validate.regex(Validate.REGEX_SODIENTHOAI,"số điện thoại phải 10 số."));
        System.out.println("Nhập email : ");
        String email = Validate.regex(Validate.REGEX_EMAIL,"nhập xxxx@xxx.xxx");
        System.out.println("Nhập loại ứng viên : ");
        String loaiUngVien = sc.nextLine();
        System.out.println("Nhập năm kinh nghiệm : ");
        int namKinhNghiem = Integer.parseInt(Validate.regex(Validate.REGEX_NAMKINHNGHIEM,"số năm kinh nghiệm từ 0-100"));
        System.out.println("Nhập kỹ năm chuyên môn : ");
        String kyNangChuyenMon = sc.nextLine();
        KinhNghiem kinhNghiem = new KinhNghiem(id, hoVaTen, ngaySinh, diaChi, soDienThoai, email, loaiUngVien,
                namKinhNghiem, kyNangChuyenMon);
        kinhNghiems.add(kinhNghiem);
        ReadAndWriteFileKinhNghiem.write(kinhNghiems);
    }

    public void show() {
       kinhNghiems = ReadAndWriteFileKinhNghiem.read();
        for (KinhNghiem o : kinhNghiems) {
            System.out.println(o);
        }
    }

    public void edit() {
        ReadAndWriteFileKinhNghiem.read();
        show();
        System.out.println("nhập id nhân viên cần chỉnh sửa : ");
        int id = Integer.parseInt(sc.nextLine());
        for (KinhNghiem o : kinhNghiems) {
            if (o.getId() == id) {
                System.out.println("Nhập họ và tên : ");
                String hoVaTen = Validate.regex(Validate.REGEX_HOVATEN,"ngăn cách dấu bởi nút space .");
                System.out.println("Nhập ngày sinh :");
                String ngaySinh = Validate.regex(Validate.REGEX_NGAYSINH,"số có độ dài 4 kí tự ");
                System.out.println("Nhập địa chỉ : ");
                String diaChi = sc.nextLine();
                System.out.println("Nhập điện thoại : ");
                int soDienThoai = Integer.parseInt(Validate.regex(Validate.REGEX_SODIENTHOAI,"số điện thoại phải 10 số."));
                System.out.println("Nhập email : ");
                String email = Validate.regex(Validate.REGEX_EMAIL,"nhập xxxx@xxx.xxx");
                System.out.println("Nhập loại ứng viên : ");
                String loaiUngVien = sc.nextLine();
                System.out.println("Nhập năm kinh nghiệm : ");
                int namKinhNghiem = Integer.parseInt(Validate.regex(Validate.REGEX_NAMKINHNGHIEM,"số năm kinh nghiệm từ 0-100"));
                System.out.println("Nhập kỹ năm chuyên môn : ");
                String kyNangChuyenMon = sc.nextLine();
                o.setHoVaTen(hoVaTen);
                o.setNgaySinh(ngaySinh);
                o.setDiaChi(diaChi);
                o.setSoDienThoai(soDienThoai);
                o.setEmail(email);
                o.setLoaiUngVien(loaiUngVien);
                o.setNamKinhNghiem(namKinhNghiem);
                o.setKyNangChuyenMon(kyNangChuyenMon);
                ReadAndWriteFileKinhNghiem.write(kinhNghiems);
            }
        }
    }

    public void search(int id) {
        ReadAndWriteFileKinhNghiem.read();
        show();
        for (KinhNghiem o : kinhNghiems) {
            if (o.getId() == id) {
                return;
            }
        }
    }

    public void delete() {
        ReadAndWriteFileKinhNghiem.read();
        show();
        System.out.println("nhập id bạn muốn xóa : ");
        int id = Integer.parseInt(sc.nextLine());
        for (KinhNghiem o : kinhNghiems) {
            if (o.getId() == id) {
                System.out.println("bạn có chắc muốn xóa không. \n1.yes\n2.no ");
                int choice = Integer.parseInt(sc.nextLine());
                if (choice == 1) {
                    kinhNghiems.remove(o);
                }
                break;
            }
        }
        ReadAndWriteFileKinhNghiem.write(kinhNghiems);
    }
}
