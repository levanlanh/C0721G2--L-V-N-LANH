package casetudy_module2.services;

import casetudy_module2.models.Customer;
import casetudy_module2.models.Facility;
import casetudy_module2.utils.Utilities;
import casetudy_module2.models.Booking;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.TreeSet;

public class BookingServiceImpI implements BookingService {
    private static final TreeSet<Booking> bookingTreeSet = new TreeSet<>(new BookingComparator());
    private static FacilityServiceImpl facilityService = new FacilityServiceImpl();
    private static CustomerServiceImpl customerService = new CustomerServiceImpl();
    private static Utilities utilities = new Utilities();
    private static Scanner sc = new Scanner(System.in);

    static {

        Booking booking1 = new Booking(3, utilities.convertDate("14/08/2021"), utilities.convertDate("16/08/2021"),
                        CustomerServiceImpl.customerList.get(2), FacilityServiceImpl.getFacility("villa2"));
        Booking booking2 = new Booking(1,utilities.convertDate("06/10/2016") , utilities.convertDate("09/10/2016"),
                CustomerServiceImpl.customerList.get(0), FacilityServiceImpl.getFacility("villa"));
        Booking booking3 = new Booking(2, utilities.convertDate("12/09/2017"), utilities.convertDate("15/09/2017"),
                CustomerServiceImpl.customerList.get(1), FacilityServiceImpl.getFacility("villa1"));
        bookingTreeSet.add(booking1);
        bookingTreeSet.add(booking2);
        bookingTreeSet.add(booking3);

    }
    public static Queue<Booking> setToQueue(){
        Queue<Booking> queue = new ArrayDeque<>();
        for (Booking booking : bookingTreeSet) {
            queue.add(booking);
            System.out.println("booking ");

        }
        return queue;
    }
    public static Customer getCustomer(int maKh){ // lấy mã khách hàng
        for (Customer customer : CustomerServiceImpl.customerList) {
            if(customer.getMaKh() == maKh){
                return customer;
            }
        }
        System.out.println("không tìm thấy mã khách hàng ");
        return null;
    };
    public static Facility getFacility(String tenDichvu){ // lấy tên dịch vụ
        for (Facility facility: FacilityServiceImpl.facilityIntegerMap.keySet()) {
            if(facility.getNameDv().equals(tenDichvu)){
                return facility;
            }
        }
        System.out.println("không tìm thấy tên dịch vụ : ");
        return null;
    };
    public void show(){
        for (Booking o : bookingTreeSet) {
            System.out.println(o);
        }
    }
    public void add(){
        System.out.println("nhập mã booking : ");
        int maBooking = Integer.parseInt(sc.nextLine());
        System.out.println("Ngày bắt đầu booking : ");
        String ngayBatDauBoking = sc.nextLine();
        System.out.println("Ngày kết thúc booking : ");
        String ngayKetThucBooking = sc.nextLine();
        System.out.println(" nhập mã khách hàng : ");
        CustomerServiceImpl.show();
        int customer = Integer.parseInt(sc.nextLine());
        Customer customer1 = getCustomer(customer);
        System.out.println("Nhập tên dịch vụ : ");
       // FacilityServiceImpl.show();
        String facility = sc.nextLine();
        Facility facility1 = getFacility(facility);
        Booking booking = new Booking(maBooking,utilities.convertDate(ngayBatDauBoking),utilities.convertDate(ngayKetThucBooking),customer1,facility1);
        bookingTreeSet.add(booking);
    }

    @Override
    public void edit() {

    }

}
