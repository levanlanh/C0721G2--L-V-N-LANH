package services;

import interface_services.FacilityService;
import models.Facility;
import models.House;
import models.Room;
import models.Villa;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements FacilityService {
    static Map<Facility, Integer> list = new LinkedHashMap<>();
    static Scanner sc = new Scanner(System.in);
    Integer key = 0;

//    static {
//        list.put(new Villa("villa", 230, 230000, 3, Villa.NGAY
//                , "A", 23, 3), 0);
//        list.put(new House("house", 430, 7730000, 2, House.THANG
//                , "A", 4), 0);
//        list.put(new Room("room", 500, 6630000, 5, Room.NGAY
//                , "free"), 0);
//    }

    public String kieuThue() {

        while (true) {
            System.out.println("Nhập loại kiểu thuê : " + "\n" + "1.GIO" + "\n" + "2.NGAY" + "\n" + "3.THANG" + "\n" + "4.NAM");
            String choice = sc.nextLine();
            switch (choice) {
                case "1":
                    return Facility.GIO;
                case "2":
                    return Facility.NGAY;
                case "3":
                    return Facility.THANG;
                case "4":
                    return Facility.NAM;
                default:
                    System.out.println("nhập lại.");
            }
        }
    }

    public static void showFacility() {
        for (Facility facility : list.keySet()) {
            Integer value = list.get(facility);
            System.out.println(facility + "có key là : " + value);
        }
    }


    public void show() {
        for (Map.Entry<Facility, Integer> entry : list.entrySet()) {
            Facility facility = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(facility + "=" + value);
        }
    }

    public void add() {
        int login = 1;
        do {
            System.out.println("Service");
            System.out.println("1.\tAdd New Villa");
            System.out.println("2.\tAdd New House");
            System.out.println("3.\tAdd New Room");
            System.out.println("4.\tBack to menu");
            System.out.println("Nhập lựa chọn :");
            login = Integer.parseInt(sc.nextLine());
            switch (login) {
                case 1: // villa
                    System.out.println("nhập tên dịch vụ :");
                    String tenDichVuVilla = Validate.regex(Validate.REGEX_VILLA, "nhập theo mẫu  SVVL-YYYY Theo sau 4 số bất kì.");
                    System.out.println("nhập diện tích sữ dụng :");
                    double dienTichSuDungVilla = Double.parseDouble(Validate.regex(Validate.DIENTICHSUDUNG, "diện tích sữ dùng phải lớn hơn 30"));
                    System.out.println("nhập chi phí thuê :");
                    double chiPhiThueVilla = Double.parseDouble(Validate.regex(Validate.CHIPHITHUE, "Chi phí thuê phải là số dương"));
                    System.out.println("nhập số lượng người :");
                    int soLuongNguoiVilla = Integer.parseInt(Validate.regex(Validate.SOLUONG, "Số lượng người tối đa phải >0 và nhỏ hơn <20"));
                    System.out.println("nhập kiểu thuê :");
                    String kieuThueVilla = kieuThue();
                    System.out.println("nhập tiêu chuẩn phòng :");
                    String tieuChuanPhongVilla = Validate.regex(Validate.TIEUCHUANPHONG, "1 TRONG 4 TIÊU CHUẨN : ABCD");
                    System.out.println("nhập diện tích hồ bơi :");
                    double dienTichHoBoiVilla = Double.parseDouble(Validate.regex(Validate.DIENTICHHOBOI, "diện tích hồ bơi phải là số thực lớn hơn 30m2"));
                    System.out.println("nhập số tầng :");
                    int soTangVilla = Integer.parseInt(Validate.regex(Validate.SOTANG, "Số tầng phải là số nguyên dương"));
                    Facility villa = new Villa(tenDichVuVilla, dienTichSuDungVilla, chiPhiThueVilla, soLuongNguoiVilla,
                            kieuThueVilla, tieuChuanPhongVilla, dienTichHoBoiVilla, soTangVilla);
                    list.put(villa, key);
                    ReadAndWriteVilla.write(list);
                    break;
                case 2: //house
                    System.out.println("nhập tên dịch vụ :");
                    String tenDichVuHouse = Validate.regex(Validate.REGEX_HOUSE, "nhập theo mẫu  SVHO-YYYY Theo sau 4 số bất kì.");
                    System.out.println("nhập diện tích sữ dụng :");
                    double dienTichSuDungHouse = Double.parseDouble(Validate.regex(Validate.DIENTICHSUDUNG, "diện tích sữ dùng phải lớn hơn 30"));
                    System.out.println("nhập chi phí thuê :");
                    double chiPhiThueHouse = Double.parseDouble(Validate.regex(Validate.CHIPHITHUE, "Chi phí thuê phải là số dương"));
                    System.out.println("nhập số lượng người :");
                    int soLuongNguoiHouse = Integer.parseInt(Validate.regex(Validate.SOLUONG, "Số lượng người tối đa phải >0 và nhỏ hơn <20"));
                    System.out.println("nhập kiểu thuê :");
                    String kieuThueHouse = kieuThue();
                    System.out.println("nhập tiêu chuẩn phòng :");
                    String tieuChuanPhongHouse = Validate.regex(Validate.TIEUCHUANPHONG, "1 TRONG 4 TIÊU CHUẨN : ABCD");
                    System.out.println("nhập số tầng :");
                    int soTangHouse = Integer.parseInt(Validate.regex(Validate.SOTANG, "Số tầng phải là số nguyên dương"));
                    Facility house = new House(tenDichVuHouse, dienTichSuDungHouse, chiPhiThueHouse,
                            soLuongNguoiHouse, kieuThueHouse, tieuChuanPhongHouse, soTangHouse);
                    list.put(house, key);
                    ReadAndWriteHouse.write(list);
                    break;
                case 3://room
                    System.out.println("nhập tên dịch vụ :");
                    String tenDichVuRoom = Validate.regex(Validate.REGEX_ROOM, "nhập theo mẫu  SVRO-YYYY Theo sau 4 số bất kì.");
                    System.out.println("nhập diện tích sữ dụng :");
                    double dienTichSuDungRoom = Double.parseDouble(Validate.regex(Validate.DIENTICHSUDUNG, "diện tích sữ dùng phải lớn hơn 30"));
                    System.out.println("nhập chi phí thuê :");
                    double chiPhiThueRoom = Double.parseDouble(Validate.regex(Validate.CHIPHITHUE, "Chi phí thuê phải là số dương"));
                    System.out.println("nhập số lượng người :");
                    int soLuongNguoiRoom = Integer.parseInt(Validate.regex(Validate.SOLUONG, "Số lượng người tối đa phải >0 và nhỏ hơn <20"));
                    System.out.println("nhập kiểu thuê :");
                    String kieuThueRoom = kieuThue();
                    System.out.println("nhập dịch vụ miễn phí :");
                    String dichVuMienPhiRoom = sc.nextLine();
                    Facility room = new Room(tenDichVuRoom, dienTichSuDungRoom, chiPhiThueRoom, soLuongNguoiRoom
                            , kieuThueRoom, dichVuMienPhiRoom);
                    list.put(room, key);
                    ReadAndWriteRoom.write(list);
                    break;
            }
        } while (login != 4);
    }

    public static void maintenance() {
        for (Map.Entry<Facility, Integer> map : list.entrySet()) {
            if (map.getValue() >= 5) {
                System.out.println(map.getKey());
            } else {
                System.out.println("Không có dịch vụ nào cần bảo trì");
            }
        }
    }
}
 