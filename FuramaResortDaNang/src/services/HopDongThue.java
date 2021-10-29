package services;

public class HopDongThue {
    private int soHopDong;
    private Booking maBooking;
    private double soTienCocTruoc;
    private double tongTienThanhToan;


    public HopDongThue(int soHopDong, Booking maBooking, double soTienCocTruoc, double tongTienThanhToan,
                       String maKhachHang) {
        this.soHopDong = soHopDong;
        this.maBooking = maBooking;
        this.soTienCocTruoc = soTienCocTruoc;
        this.tongTienThanhToan = tongTienThanhToan;

    }

    public int getSoHopDong() {
        return soHopDong;
    }

    public void setSoHopDong(int soHopDong) {
        this.soHopDong = soHopDong;
    }

    public Booking getMaBooking() {
        return maBooking;
    }

    public void setMaBooking(Booking maBooking) {
        this.maBooking = maBooking;
    }

    public double getSoTienCocTruoc() {
        return soTienCocTruoc;
    }

    public void setSoTienCocTruoc(double soTienCocTruoc) {
        this.soTienCocTruoc = soTienCocTruoc;
    }

    public double getTongTienThanhToan() {
        return tongTienThanhToan;
    }

    public void setTongTienThanhToan(double tongTienThanhToan) {
        this.tongTienThanhToan = tongTienThanhToan;
    }



    @Override
    public String toString() {
        return "HopDongThue{" +
                "soHopDong=" + soHopDong +
                ", maBooking=" + maBooking +
                ", soTienCocTruoc=" + soTienCocTruoc +
                ", tongTienThanhToan=" + tongTienThanhToan +
                 +
                '}';
    }
}
