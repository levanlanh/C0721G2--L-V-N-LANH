package services;

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
                    String tenDichVuVilla = sc.nextLine();
                    System.out.println("nhập diện tích sữ dụng :");
                    double dienTichSuDungVilla = Double.parseDouble(sc.nextLine());
                    System.out.println("nhập chi phí thuê :");
                    double chiPhiThueVilla = Double.parseDouble(sc.nextLine());
                    System.out.println("nhập số lượng người :");
                    int soLuongNguoiVilla = Integer.parseInt(sc.nextLine());
                    System.out.println("nhập kiểu thuê :");
                    String kieuThueVilla = sc.nextLine();
                    System.out.println("nhập tiêu chuẩn phòng :");
                    String tieuChuanPhongVilla = sc.nextLine();
                    System.out.println("nhập diện tích hồ bơi :");
                    double dienTichHoBoiVilla = Double.parseDouble(sc.nextLine());
                    System.out.println("nhập số tầng :");
                    int soTangVilla = Integer.parseInt(sc.nextLine());
                    Villa villa = new Villa(tenDichVuVilla, dienTichSuDungVilla, chiPhiThueVilla, soLuongNguoiVilla,
                            kieuThueVilla, tieuChuanPhongVilla
                            , dienTichHoBoiVilla, soTangVilla);
                    list.put(villa, key);
                    break;
                case 2: //house
                    System.out.println("nhập tên dịch vụ :");
                    String tenDichVuHouse = sc.nextLine();
                    System.out.println("nhập diện tích sữ dụng :");
                    double dienTichSuDungHouse = Double.parseDouble(sc.nextLine());
                    System.out.println("nhập chi phí thuê :");
                    double chiPhiThueHouse = Double.parseDouble(sc.nextLine());
                    System.out.println("nhập số lượng người :");
                    int soLuongNguoiHouse = Integer.parseInt(sc.nextLine());
                    System.out.println("nhập kiểu thuê :");
                    String kieuThueHouse = sc.nextLine();
                    System.out.println("nhập tiêu chuẩn phòng :");
                    String tieuChuanPhongHouse = sc.nextLine();
                    System.out.println("nhập số tầng :");
                    int soTangHouse = Integer.parseInt(sc.nextLine());
                    House house = new House(tenDichVuHouse, dienTichSuDungHouse, chiPhiThueHouse, soLuongNguoiHouse,
                            kieuThueHouse, tieuChuanPhongHouse, soTangHouse);
                    list.put(house, key);
                    break;
                case 3://room
                    System.out.println("nhập tên dịch vụ :");
                    String tenDichVuRoom = sc.nextLine();
                    System.out.println("nhập diện tích sữ dụng :");
                    double dienTichSuDungRoom = Double.parseDouble(sc.nextLine());
                    System.out.println("nhập chi phí thuê :");
                    double chiPhiThueRoom = Double.parseDouble(sc.nextLine());
                    System.out.println("nhập số lượng người :");
                    int soLuongNguoiRoom = Integer.parseInt(sc.nextLine());
                    System.out.println("nhập kiểu thuê :");
                    String kieuThueRoom = sc.nextLine();
                    System.out.println("nhập dịch vụ miễn phí :");
                    String dichVuMienPhiRoom = sc.nextLine();
                    Room room = new Room(tenDichVuRoom, dienTichSuDungRoom, chiPhiThueRoom, soLuongNguoiRoom, kieuThueRoom,
                            dichVuMienPhiRoom);
                    list.put(room, key);
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
 