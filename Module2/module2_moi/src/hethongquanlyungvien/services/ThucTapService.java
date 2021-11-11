package hethongquanlyungvien.services;

import hethongquanlyungvien.utils.ReadAndWriteFileThucTap;
import hethongquanlyungvien.utils.Validate;
import hethongquanlyungvien.models.ThucTap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ThucTapService implements InterfaceService {
    Scanner sc = new Scanner(System.in);
    List<ThucTap> thucTaps = new ArrayList<>();

    @Override
    public void add() {
        System.out.println("Nhập id :");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập họ và tên : ");
        String hoVaTen = Validate.regex(Validate.REGEX_HOVATEN,"ngăn cách dấu bởi nút space .");
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
        System.out.println("Nhập chuyên ngành : ");
        String chuyenNganh = sc.nextLine();
        System.out.println("Nhập học kỳ :");
        String hocKy = sc.nextLine();
        System.out.println("Nhập tên trường đại học : ");
        String tenTruongDaiHoc = sc.nextLine();
        ThucTap thucTap = new ThucTap(id, hoVaTen, ngaySinh, diaChi, soDienThoai, email, loaiUngVien
                , chuyenNganh, hocKy, tenTruongDaiHoc);
        thucTaps.add(thucTap);
        ReadAndWriteFileThucTap.write(thucTaps);
    }

    @Override
    public void show() {
       thucTaps = ReadAndWriteFileThucTap.read();
        for (ThucTap o : thucTaps) {
            System.out.println(o);
        }
    }

    @Override
    public void edit() {
        ReadAndWriteFileThucTap.read();
        show();
        System.out.println("nhập id bạn cần chỉnh sửa : ");
        int id = Integer.parseInt(sc.nextLine());
        for (ThucTap o : thucTaps) {
            if (o.getId() == id) {
                System.out.println("Nhập họ và tên : ");
                String hoVaTen = Validate.regex(Validate.REGEX_HOVATEN,"ngăn cách dấu bởi nút space .");
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
                System.out.println("Nhập chuyên ngành : ");
                String chuyenNganh = sc.nextLine();
                System.out.println("Nhập học kỳ :");
                String hocKy = sc.nextLine();
                System.out.println("Nhập tên trường đại học : ");
                String tenTruongDaiHoc = sc.nextLine();
                o.setHoVaTen(hoVaTen);
                o.setNgaySinh(ngaySinh);
                o.setDiaChi(diaChi);
                o.setSoDienThoai(soDienThoai);
                o.setEmail(email);
                o.setLoaiUngVien(loaiUngVien);
                o.setChuyenNganh(chuyenNganh);
                o.setHocKy(hocKy);
                o.setTenTruongDaiHoc(tenTruongDaiHoc);
                ReadAndWriteFileThucTap.write(thucTaps);
            }
        }
    }

    @Override
    public void delete() {
        ReadAndWriteFileThucTap.read();
        show();
        System.out.println("nhập id bạn muốn xóa : ");
        int id = Integer.parseInt(sc.nextLine());
        for (ThucTap o : thucTaps) {
            if (o.getId() == id) {
                System.out.println("bạn có chắc muốn xóa không. \n1.yes\n2.no ");
                int choice = Integer.parseInt(sc.nextLine());
                if (choice == 1) {
                    thucTaps.remove(o);
                }
                break;
            }
        }
    }

    public void search(int id) {
        show();
        for (ThucTap o : thucTaps) {
            if (o.getId() == id) {
                return;
            }
        }
    }


}
