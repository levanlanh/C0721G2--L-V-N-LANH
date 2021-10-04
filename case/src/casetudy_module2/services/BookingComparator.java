package casetudy_module2.services;

import casetudy_module2.models.Booking;

import java.util.Comparator;

public class BookingComparator implements Comparator<Booking> {
    @Override
    public int compare(Booking o1, Booking o2) {
       if(o1.getNgayBatDauBoking().compareTo(o2.getNgayKetThucBoking())==0){
           return o1.getNgayBatDauBoking().compareTo(o2.getNgayKetThucBoking());
       }
       return o1.getNgayKetThucBoking().compareTo(o2.getNgayBatDauBoking());
    }
//        if (o1.getMaBooking() > o2.getMaBooking()) {
//            return 1;
//        }
//        return -1;
//    }
}
