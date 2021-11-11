package models;

public class Booking {
    private int maBooking;
    private String ngayBatDau;
    private String ngayKetThuc;
    private Customer customer;
    private Facility facility;

        public Booking(int maBooking, String ngayBatDau, String ngayKetThuc, Customer customer, Facility facility) {
        this.maBooking = maBooking;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.customer = customer;
        this.facility = facility;
    }

    public int getMaBooking() {
        return maBooking;
    }

    public void setMaBooking(int maBooking) {
        this.maBooking = maBooking;
    }

    public String getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(String ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public String getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(String ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
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
                "maBooking='" + maBooking + '\'' +
                ", ngayBatDau='" + ngayBatDau + '\'' +
                ", ngayKetThuc='" + ngayKetThuc + '\'' +
                ", customer=" + customer +
                ", facility=" + facility +
                '}';
    }
    public String booking(){
        return maBooking+","+ngayBatDau+","+ngayKetThuc+","+customer.customer()+","+facility.facility();
    }
}
