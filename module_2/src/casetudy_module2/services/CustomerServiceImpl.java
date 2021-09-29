package casetudy_module2.services;

import casetudy_module2.models.Customer;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    protected static List<Customer> customerList = new LinkedList<>();
    private static Scanner sc = new Scanner(System.in);

    static {
        Customer customer1 = new Customer("huy", "19/03/1999", true, 230123456, "0987654321", "abc@12.com", 1, "thanhvien", "DN");
        Customer customer2 = new Customer("Hao", "23/05/1998", true, 234562234, "0123456789", "zxc@12.com", 2, "vip", "HN");
        customerList.add(customer1);
        customerList.add(customer2);

    }

    public void Show() {
        for (Customer o : customerList) {
            System.out.println(o);
        }
    }

    public void addCustomer() {
        boolean flag = true;
        while (flag) {
            flag = false;
            try {
                System.out.println("nhập tên :");
                String name = sc.nextLine();
                System.out.println("nhập ngày sinh :");
                String ngaySinh = sc.nextLine();
                System.out.println("nhập giới tính :");
                boolean gioiTinh = Boolean.parseBoolean(sc.nextLine());
                System.out.println("nhập CMND : ");
                int soCMND = Integer.parseInt(sc.nextLine());
                System.out.println("nhập số điện thoại : ");
                String soDT = sc.nextLine();
                System.out.println("nhập email : ");
                String email = sc.nextLine();
                System.out.println("nhập mã khách hàng  :");
                int maKH = Integer.parseInt(sc.nextLine());
                System.out.println("nhập loại khách hàng :");
                String loaiKH = sc.nextLine();
                System.out.println("địa chỉ : ");
                String diaChi = sc.nextLine();
                Customer customer = new Customer(name, ngaySinh, gioiTinh, soCMND, soDT, email, maKH, loaiKH, diaChi);
                customerList.add(customer);
            } catch (Exception exception) {
                System.err.println("hiện tại ban nhập không đúng, xin nhập lại");
            }

        }
    }

    public void editCustomer() {
        Show();
        System.out.println("Nhập tên khách hàng cần chỉnh sửa : ");
        String name = sc.nextLine();
        for (Customer o : customerList) {
            if (o.getName().equals(name)) {
                boolean flag = true;
                while (flag) {
                    flag = false;
                    try {

                        System.out.println("1 Edit tên" + "\n" + "2 Edit ngày sinh" + "\n" + "3 Edit giới tính" + "\n" + "4 Edit CMND" + "\n" + "5 Edit soDT" + "\n" + "6 Edit email" + "\n" + "7 Edit maKH" + "\n" + "8 Edit loaiKH" + "\n" + "9 Edit địa chỉ" + "\n" + "10 Edit Customer ID" + "\n" + "11 Finish edit");
                        int choice = Integer.parseInt(sc.nextLine());
                        switch (choice) {
                            case 1:
                                System.out.println("Nhạp tên : ");
                                o.setName(sc.nextLine());
                                break;
                            case 2:
                                System.out.println("nhập ngày sinh :");
                                o.setNgaySinh(sc.nextLine());
                            case 3:
                                System.out.println("nhập giới tính :");
                                o.setGioiTinh(Boolean.parseBoolean(sc.nextLine()));
                                break;
                            case 4:
                                System.out.println("nhập CMND : ");
                                o.setSoCMND(Integer.parseInt(sc.nextLine()));
                                break;
                            case 5:
                                System.out.println("nhập số điện thoại : ");
                                o.setSoDT(sc.nextLine());
                                break;
                            case 6:
                                System.out.println("nhập email : ");
                                o.setEmail(sc.nextLine());
                            case 7:
                                System.out.println("nhập mã khách hàng  :");
                                o.setMaKh(Integer.parseInt(sc.nextLine()));
                            case 8:
                                System.out.println("nhập loại khách hàng :");
                                boolean flag1 = true;
                                while (flag1) {
                                    flag1 = false;
                                    try {
                                        System.out.println("Nhập loại khách hàng : " + "\n" + "1.Kim Cương" + "\n" + "2.bạch kim" + "\n" + "3.vàng" + "\n" + "4.bạc");
                                        int choice1 = Integer.parseInt(sc.nextLine());
                                        switch (choice1) {
                                            case 1:
                                                o.setLoaiKH(Customer.KIMCUONG);
                                                break;
                                            case 2:
                                                o.setLoaiKH(Customer.BACHKIM);
                                                break;
                                            case 3:
                                                o.setLoaiKH(Customer.VANG);
                                                break;
                                            case 4:
                                                o.setLoaiKH(Customer.BAC);
                                                break;
                                        }
                                    } catch (Exception e) {
                                        System.err.println("Đầu vào không hợp lệ, hãy thử lại");
                                        flag1 = true;
                                    }

                                }


                        }
                    } catch (Exception exception) {
                        System.out.println("Đâu vao không hợp lệ");
                    }
                }
            }
        }
    }
}
