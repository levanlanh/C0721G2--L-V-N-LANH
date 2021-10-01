package casetudy_module2.models;

import javax.xml.crypto.Data;
import java.util.Date;

public class Booking {
    private int maBooking;
    private Date ngayBatDauBoking;
    private Date ngayKetThucBoking;
    private Customer customer;
    private Facility facility;

    public Booking(int maBooking, Date ngayBatDauBoking, Date ngayKetThucBoking, Customer customer, Facility facility) {
        this.maBooking = maBooking;
        this.ngayBatDauBoking = ngayBatDauBoking;
        this.ngayKetThucBoking = ngayKetThucBoking;
        this.customer = customer;
        this.facility = facility;
    }

    public int getMaBooking() {
        return maBooking;
    }

    public void setMaBooking(int maBooking) {
        this.maBooking = maBooking;
    }

    public Date getNgayBatDauBoking() {
        return ngayBatDauBoking;
    }

    public void setNgayBatDauBoking(Date ngayBatDauBoking) {
        this.ngayBatDauBoking = ngayBatDauBoking;
    }

    public Date getNgayKetThucBoking() {
        return ngayKetThucBoking;
    }

    public void setNgayKetThucBoking(Date ngayKetThucBoking) {
        this.ngayKetThucBoking = ngayKetThucBoking;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Facility getFacility() {
        return facility;
    }

    public void setFacility(Facility facility) {
        this.facility = facility;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "maBooking=" + maBooking +
                ", ngayBatDauBoking=" + ngayBatDauBoking +
                ", ngayKetThucBoking=" + ngayKetThucBoking +
                ", customer=" + customer +
                ", facility=" + facility +
                '}';
    }
}
