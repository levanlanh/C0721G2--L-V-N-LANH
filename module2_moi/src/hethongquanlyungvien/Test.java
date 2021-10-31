package hethongquanlyungvien;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        KinhNghiemService heThongQuanLyUngVien = new KinhNghiemService();
        FresherService fresherService = new FresherService();
        ThucTapService thucTapService = new ThucTapService();
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("Hệ Thống Quản Lý Thí Sinh" + "\n" + "1. kinh nghiệm" +
                    "\n" + "2. fresher" + "\n" + "3. thực tập" + "\n" +
                    "4. thoát" + "\n" + "Nhập sự lựa chọn.");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1: {
                    boolean flag1 = true;
                    while (flag1) {
                        System.out.println("1.kinh nghiệm" + "\n" + "1.add danh sách" + "\n" + "2.show danh sách" +
                                "\n" + "3.Edit danh sách" + "\n" + "4.Delete danh sách" + "\n" + "5.Search danh sách"
                                + "\n" + "6.Return lại menu");
                        int choice1 = Integer.parseInt(sc.nextLine());
                        switch (choice1) {
                            case 1:
                                heThongQuanLyUngVien.add();
                                break;
                            case 2:

                                heThongQuanLyUngVien.show();
                                break;
                            case 3:
                                heThongQuanLyUngVien.edit();
                                break;
                            case 4:
                                heThongQuanLyUngVien.delete();
                                break;
                            case 5:
                                System.out.println(" Nhập vào mã ứng viên cần hiển thị thông tin của ứng viên đó");
                                int id = Integer.parseInt(sc.nextLine());
                                heThongQuanLyUngVien.search(id);
                                break;
                            case 6:
                                flag1 = false;
                                break;
                            default:
                                System.err.println("Invalid,try again !");
                                break;
                        }
                    }
                    break;
                }
                case 2: {
                    boolean flag2 = true;
                    while (flag2) {
                        System.out.println("2. fresher" + "\n" + "1.add danh sách fresher" + "\n" +
                                "2.show danh sách fresher" + "\n" + "3.Edit danh sách fresher" + "\n" +
                                "4.Search danh sách fresher" + "\n" + "5. delete danh sách fresher " + "\n" +
                                "6.Return main menu");
                        int choice1 = Integer.parseInt(sc.nextLine());
                        switch (choice1) {
                            case 1:
                                fresherService.add();
                                break;
                            case 2:
                                fresherService.show();
                                break;
                            case 3:
                                fresherService.edit();
                                break;
                            case 4:
                                System.out.println(" Nhập vào mã ứng viên cần hiển thị thông tin của ứng viên đó");
                                int id = Integer.parseInt(sc.nextLine());
                                fresherService.search(id);
                                break;
                            case 5:
                                fresherService.delete();
                                break;
                            case 6:
                                flag2 = false;
                                break;
                            default:
                                System.err.println("Invalid,try again !");
                        }
                    }
                    break;
                }

                case 3: {
                    boolean flag3 = true;
                    while (flag3) {
                        System.out.println("3. thực tập" + "\n" + "1.add danh sách thực tập " + "\n" +
                                "2.show  danh sách thực tập" + "\n" + "3. edit danh sách thực tập" + "\n"
                                + "4.search danh sách thực tập " + "\n" + "5.delete danh sách thực tập" + "\n"
                                + "6.Return main menu");
                        int choice1 = Integer.parseInt(sc.nextLine());
                        switch (choice1) {
                            case 1:
                                thucTapService.add();
                                break;
                            case 2:
                                thucTapService.show();
                                break;
                            case 3:
                                thucTapService.edit();
                                break;
                            case 4:
                                System.out.println(" Nhập vào mã ứng viên cần hiển thị thông tin của ứng viên đó");
                                int id = Integer.parseInt(sc.nextLine());
                                thucTapService.search(id);
                                break;
                            case 5:
                                thucTapService.delete();
                                break;
                            case 6:
                                flag3 = false;
                                break;
                            default:
                                System.err.println("Invalid,try again !");
                        }
                    }
                    break;
                }
                case 4:
                    return;
            }
        }

    }
}
