package hethongquanlysinhvien;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SinhVienManager {
    Scanner sc = new Scanner(System.in);
    List<SinhVien> sinhVienList = new ArrayList<>();


    public void add() {
        System.out.println("nhập mã sinh viên : ");
        String maSinhVien = Validate.regex(Validate.REGEX_MASINHVIEN,"nhập theo quy định STT-XXX");
        System.out.println("nhập tên :");
        String ten = sc.nextLine();
        System.out.println("nhập địa chỉ :");
        String diaChi = sc.nextLine();
        System.out.println("nhập điểm số :");
        Double diemSo = Double.parseDouble(sc.nextLine());
        SinhVien sinhVien = new SinhVien(maSinhVien, ten, diaChi, diemSo);
        sinhVienList.add(sinhVien);
        Collections.sort(sinhVienList);
        ReadAndWriteFile.write(sinhVienList);
    }

    public void show() {
        for (SinhVien o : sinhVienList) {
            System.out.println(o);
        }
    }

    public void delete() {
        ReadAndWriteFile.read();
        show();
        System.out.println("nhập mã sinh viên cần xóa . ");
        String maSinhVien = sc.nextLine();
        for (SinhVien o : sinhVienList) {
            if (o.getMaSinhVien().equals(maSinhVien)) {
                System.out.println("bạn có chắc muốn xóa không. \n1.yes\n2.no ");
                int choice = Integer.parseInt(sc.nextLine());
                if (choice == 1) {
                    sinhVienList.remove(o);
                }
                break;
            }
        }
        ReadAndWriteFile.write(sinhVienList);
    }

    public void edit() {
        ReadAndWriteFile.read();
        show();
        System.out.println("nhập mã sinh viên cần sửa .");
        String maSinhVien = sc.nextLine();
        for (SinhVien o : sinhVienList) {
            if (o.getMaSinhVien().equals(maSinhVien)) {
                System.out.println("nhập tên cần sửa. ");
                String ten = sc.nextLine();
                System.out.println("nhập địa chỉ cần sửa đổi. ");
                String diaChi = sc.nextLine();
                System.out.println("Nhập điểm cần sửa đổi. ");
                Double diemSo = Double.parseDouble(sc.nextLine());
                o.setTen(ten);
                o.setDiaChi(diaChi);
                o.setDiemSo(diemSo);
                ReadAndWriteFile.write(sinhVienList);
            }
        }
    }

    public boolean contains(String maSinhVien) {
        for (SinhVien o : sinhVienList) {
            if (o.getMaSinhVien().equals(maSinhVien)) {
                return true;
            }
        }
        return false;
    }

    public SinhVien search(String maNhanVien) {
        for (SinhVien o : sinhVienList) {
            if (o.getMaSinhVien().equals(maNhanVien)) {
                return o;
            }
        }
        return null;
    }
}
