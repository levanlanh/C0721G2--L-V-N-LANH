package casetudy_module2.services;

import casetudy_module2.utils.Utilities;
import casetudy_module2.models.Booking;

import java.util.Scanner;
import java.util.TreeSet;

public class BookingServiceImpI implements BookingService {
    private static final TreeSet<Booking> bookingTreeSet = new TreeSet<>(new BookingComparator());
    private static FacilityServiceImpl facilityService = new FacilityServiceImpl();
    private static CustomerServiceImpl customerService = new CustomerServiceImpl();
    private static Utilities utilities = new Utilities();
    private static Scanner sc = new Scanner(System.in);

    static {
        bookingTreeSet.add(new Booking(3, utilities.convertDate("14/08/2021"), utilities.convertDate("16/08/2021"),
                CustomerServiceImpl.customerList.get(2), FacilityServiceImpl.getFacility("villa3")));
        bookingTreeSet.add(new Booking(1,utilities.convertDate("06/10/2016") , utilities.convertDate("09/10/2016"),
                CustomerServiceImpl.customerList.get(0), FacilityServiceImpl.getFacility("Villa1")));
        bookingTreeSet.add(new Booking(2, utilities.convertDate("12/09/2017"), utilities.convertDate("15/09/2017"),
                CustomerServiceImpl.customerList.get(1), FacilityServiceImpl.getFacility("villa2")));

    }
    public void show(){
        for (Booking o : bookingTreeSet) {
            System.out.println(o);
        }
    }

}
