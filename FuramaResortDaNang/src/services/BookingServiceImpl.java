package services;

import models.Booking;
import models.Customer;
import models.Facility;

import java.util.Scanner;
import java.util.TreeSet;

public class BookingServiceImpl implements BookingService {
    public static CustomerServiceImpl customerService = new CustomerServiceImpl();
    public static FacilityServiceImpl facilityService = new FacilityServiceImpl();
    public static TreeSet<Booking> bookings = new TreeSet<>();
    static Scanner sc = new Scanner(System.in);


    public static Customer getmaKhachHang(String maKhachHang) { // lấy mã khách hàng.
        for (Customer o : customerService.customers) {
            if (o.getMaKhachHang().equals(maKhachHang)) {
                return o;
            }
        }
        System.out.println("Không tìm thấy mã khách hàng .");
        return null;
    }

    public static Facility getFacility(String tenDichVu) { // lấy tên dịch vụ house,villa,room
        for (Facility o : FacilityServiceImpl.list.keySet()) {
            if (o.getTenDichVu().equals(tenDichVu)) {
                return o;
            }
        }
        System.out.println("không tìm thấy tên dịch vụ :");
        return null;
    }

    public void show() {
        for (Booking o : bookings) {
            System.out.println(o);
        }
    }

    public void add() {
        System.out.println("nhập mã booking :");
        int maBooking = Integer.parseInt(sc.nextLine());
        System.out.println("nhập ngày bắt đầu :");
        String ngayBatDau = sc.nextLine();
        System.out.println("nhập ngày kết thúc :");
        String ngayKetThuc = sc.nextLine();
        System.out.println("nhập mã khách hàng :");
        String maKhachHang = sc.nextLine();
        Customer customer = getmaKhachHang(maKhachHang);
        FacilityServiceImpl.showFacility();
        System.out.println("nhập tên dịch vụ");
        String tenDichVu = sc.nextLine();
        Facility facility = getFacility(tenDichVu);
        Booking booking = new Booking(maBooking, ngayBatDau, ngayKetThuc, customer, facility);
        bookings.add(booking);
    }
}



