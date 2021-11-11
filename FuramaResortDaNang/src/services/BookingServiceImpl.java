package services;

import interface_services.BookingService;
import models.Booking;
import models.Customer;
import models.Facility;
import models.Villa;


import java.util.*;

public class BookingServiceImpl implements BookingService {
    public static CustomerServiceImpl customerService = new CustomerServiceImpl();
    public static Set<Booking> bookings = new TreeSet<>(new BookingComparator());
    static Scanner sc = new Scanner(System.in);


    public static Customer getmaKhachHang(String maKhachHang) { // lấy mã khách hàng.
        List<Customer> customers = ReadAndWriteCustomer.read();
        for (Customer o : customers) {
            if (o.getMaKhachHang().equals(maKhachHang)) {
                return o;
            }
        }
        System.out.println("Không tìm thấy mã khách hàng .");
        return null;
    }

    public static Facility getFacility(String tenDichVu) { // lấy tên dịch vụ house,villa,room

        for (Facility villa: ReadAndWriteVilla.read().keySet()) {
             if(villa.getTenDichVu().equals(tenDichVu)){
                 return villa;
             }
        }
        for (Facility house : ReadAndWriteHouse.read().keySet()) {
            if(house.getTenDichVu().equals(tenDichVu)){
                return house;
            }
        }
        for (Facility room: ReadAndWriteRoom.read().keySet()) {
            if(room.getTenDichVu().equals(tenDichVu)){
                return room;
            }
        }return null;
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
        customerService.show();
        String maKhachHang = sc.nextLine();
        Customer customer = getmaKhachHang(maKhachHang);
        System.out.println("nhập tên dịch vụ");
        FacilityServiceImpl.showFacility();
        String tenDichVu = sc.nextLine();
        Facility facility = getFacility(tenDichVu);
        Booking booking = new Booking(maBooking, ngayBatDau, ngayKetThuc, customer, facility);
        bookings.add(booking);
       // ReadAndWriteBooking.write(bookings);
    }
}



