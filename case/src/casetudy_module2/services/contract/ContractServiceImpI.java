package casetudy_module2.services.contract;

import casetudy_module2.models.*;
import casetudy_module2.services.booking.BookingServiceImpI;
import casetudy_module2.services.contract.ContractService;


import java.util.ArrayDeque;

import java.util.Queue;
import java.util.Scanner;

public class ContractServiceImpI implements ContractService {
    private static final String FILE_CONTRACT = "src\\data\\contract.csv";
    private static Queue<Contract> queue = new ArrayDeque<>();
    static Scanner sc = new Scanner(System.in);
    private static Queue<Booking> bookingQueue = BookingServiceImpI.setToQueue();

    public void add() {
        for (Booking booking : bookingQueue) {
            System.out.println(booking);
            if (booking.getFacility() instanceof Villa || booking.getFacility() instanceof House) {
                System.out.println("số hợp đồng : ");
                int soHopDong = Integer.parseInt(sc.nextLine());
                System.out.println("Nhập mã hợp đồng : ");
                int maHopDong = Integer.parseInt(sc.nextLine());
                System.out.println(" số tiền cọc trước : ");
                double soTienCoc = Double.parseDouble(sc.nextLine());
                System.out.println("số tiền thanh toán : ");
                double soTienThanhToan = Double.parseDouble(sc.nextLine());
                System.out.println("mã khách hàng : ");
                int maKhachHang = Integer.parseInt(sc.nextLine());
                Contract contract = new Contract(soHopDong, maHopDong, soTienCoc, soTienThanhToan, maKhachHang);
                queue.add(contract);

            }
        }
    }

    public void edit() {
        System.out.println("số hợp đồng : ");
        int soHopDong = Integer.parseInt(sc.nextLine());
        for (Contract contract : queue) {
            if (contract.getSoHD() == soHopDong) {
                System.out.println("Nhập mã hợp đồng : ");
                int maHopDong = Integer.parseInt(sc.nextLine());
                System.out.println(" số tiền cọc trước : ");
                double soTienCoc = Double.parseDouble(sc.nextLine());
                System.out.println("số tiền thanh toán : ");
                double soTienThanhToan = Double.parseDouble(sc.nextLine());
                System.out.println("mã khách hàng : ");
                int maKhachHang = Integer.parseInt(sc.nextLine());
                contract.setmHD(maHopDong);
                contract.setTienCocTruoc(soTienCoc);
                contract.setTongTienThanhToan(soTienThanhToan);
                contract.setMaKH(maKhachHang);
            } else {
                System.out.println("không tìm thấy. ");
            }
        }
    }


    @Override
    public void show() {
        for (Contract booking : queue) {
            System.out.println(booking);
        }
    }
}
