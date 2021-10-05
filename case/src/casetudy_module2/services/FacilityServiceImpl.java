package casetudy_module2.services;

import casetudy_module2.models.Facility;
import casetudy_module2.models.House;
import casetudy_module2.models.Room;
import casetudy_module2.models.Villa;
import checkvalidate.ValidateFacility;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FacilityServiceImpl implements FacilityService {
    protected static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
    private static Scanner sc = new Scanner(System.in);


    static {
        facilityIntegerMap.put(new Villa("villa","1",50,230000,
                4,Villa.DATE,"A",15,3), 0);
        facilityIntegerMap.put(new House("house", "2", 100,350000,4,
                House.DATE,"A",15), 0);
        facilityIntegerMap.put(new Villa("villa2", "3",120,4500000,3,
                Villa.MONTH,"A",20,4), 0);
    }


    public void show() {
        Set<Facility> facilitySet = facilityIntegerMap.keySet();
        for (Facility o : facilitySet) {
            System.out.println(o + " : times " + facilityIntegerMap.get(o));
        }
    }


    public static Facility getFacility(String nameDichVu) {
        for (Map.Entry<Facility, Integer> map : facilityIntegerMap.entrySet()) {
            if (map.getKey().getNameDv().contains(nameDichVu)) {
                map.setValue(map.getValue() + 1);
                return map.getKey();
            }
        }
        return null;
    }

    public void add() {
//            boolean flag = true;
//            while (flag) {
//
//                System.out.println("nhập tên dịch vụ : ");
//                String nameDv = ValidateFacility.villa();
//                System.out.println(" nhập diện tích : ");
//                int dienTichSuDung = Integer.parseInt(sc.nextLine());
//                System.out.println("nhập chi phí thuế : ");
//                double chiPhiThue = Double.parseDouble(sc.nextLine());
//                System.out.println("nhập số lượng người : ");
//                int soluongNguoi = Integer.parseInt(sc.nextLine());
//                System.out.println("nhập kiểu thuê : ");
//                String kieuThue = sc.nextLine();
//                try {
//                    System.out.println("Nhập số bạn cần chọn : "
//                            + "1.Add New Villa"
//                            + "2. Add New House"
//                            + " 3. Add New Room"
//                            + " 4. Back to menu"
//                    );
//
//                    int choice = Integer.parseInt(sc.nextLine());
//                    if (choice == 4 || choice > 4) break;
//                    switch (choice) {
//                        case 1:
//                            flag = true;
//                            while (flag) {
//                                flag = false;
//                                try {
//                                    System.out.println("nhập tiêu chuẩn phòng : ");
//                                    String tieuChuanPhong = sc.nextLine();
//                                    System.out.println("nhập diện tích hồ bơi : ");
//                                    double dienTichHoBoi = Double.parseDouble(sc.nextLine());
//                                    System.out.println(" nhập số tầng : ");
//                                    int soTang = Integer.parseInt(sc.nextLine());
//                                    Villa villa = new Villa(nameDv, dienTichSuDung, chiPhiThue, soluongNguoi, kieuThue, tieuChuanPhong, dienTichHoBoi, soTang);
//                                    facilityIntegerMap.put(villa, 0);
//                                } catch (Exception exception) {
//                                    System.out.println("Đâu vao không hợp lệ");
//                                    flag = true;
//                                }
//                            }
//                            break;
//                        case 2:
//                            flag = true;
//                            while (flag) {
//                                flag = false;
//                                try {
//                                    System.out.println("nhập tiêu chuẩn phòng : ");
//                                    String tieuChuanPhong = sc.nextLine();
//                                    System.out.println(" nhập số tầng : ");
//                                    int soTang = Integer.parseInt(sc.nextLine());
//                                    House house = new House(nameDv, dienTichSuDung, chiPhiThue, soluongNguoi, kieuThue, tieuChuanPhong, soTang);
//                                    facilityIntegerMap.put(house, 0);
//                                } catch (Exception e) {
//                                    System.out.println("Đầu vào không hợp lệ");
//                                    flag = true;
//                                }
//                            }
//                            break;
//                        case 3:
//                            flag = true;
//                            while (flag) {
//                                flag = false;
//                                try {
//                                    System.out.println(" nhập dịch vụ đi kèm : ");
//                                    String dichVuFreeDiKem = sc.nextLine();
//                                } catch (Exception e) {
//                                    System.out.println("Đầu vào không hợp lệ");
//                                    flag = true;
//                                }
//                            }
//                            break;
//                    }
//                } catch (Exception e) {
//                    System.out.println(" Đâu vao không hợp lệ!");
//                }
//            }
        int choice = 1;
        do {
            System.out.println("Service");
            System.out.println("1.\tAdd New Villa");
            System.out.println("2.\tAdd New House");
            System.out.println("3.\tAdd New Room");
            System.out.println("4.\tBack to menu");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    String nameVilla = ValidateFacility.villa();
                    System.out.println("mã dịch vụ ");
                    String maDichVuVilla = sc.nextLine();
                    System.out.println(" nhập diện tích : ");
                    int dienTichSuDungVilla = Integer.parseInt(sc.nextLine());
                    System.out.println("nhập chi phí thuế : ");
                    double chiPhiThueVilla = Double.parseDouble(sc.nextLine());
                    System.out.println("nhập số lượng người : ");
                    int soluongNguoi = Integer.parseInt(sc.nextLine());
                    System.out.println("nhập kiểu thuê : ");
                    String kieuThue = sc.nextLine();
                    System.out.println("nhập tiêu chuẩn phòng : ");
                    String tieuChuanPhong = sc.nextLine();
                    System.out.println("nhập diện tích hồ bơi : ");
                    double dienTichHoBoi = Double.parseDouble(sc.nextLine());
                    System.out.println(" nhập số tầng : ");
                    int soTang = Integer.parseInt(sc.nextLine());
                    Villa villa = new Villa(nameVilla,maDichVuVilla, dienTichSuDungVilla, chiPhiThueVilla, soluongNguoi, kieuThue,
                            tieuChuanPhong, dienTichHoBoi, soTang);
                    facilityIntegerMap.put(villa, 0);
                case 2:

                    String nameHouse = ValidateFacility.house();
                    String maDichVuHouse = sc.nextLine();
                    System.out.println(" nhập diện tích : ");
                    System.out.println(" nhập diện tích : ");
                    int dienTichSuDung = Integer.parseInt(sc.nextLine());
                    System.out.println("nhập chi phí thuế : ");
                    double chiPhiThue = Double.parseDouble(sc.nextLine());
                    System.out.println("nhập số lượng người : ");
                    int soluongNguoiHouse = Integer.parseInt(sc.nextLine());
                    System.out.println("nhập kiểu thuê : ");
                    String kieuThueHouse = sc.nextLine();
                    System.out.println("nhập tiêu chuẩn phòng : ");
                    String tieuChuanPhongHouse = sc.nextLine();
                    System.out.println("nhập diện tích hồ bơi : ");
                    double dienTichHoBoiHouse = Double.parseDouble(sc.nextLine());
                    System.out.println(" nhập số tầng : ");
                    int soTangHouse = Integer.parseInt(sc.nextLine());
                    Villa house = new Villa(nameHouse,maDichVuHouse, dienTichSuDung, chiPhiThue, soluongNguoiHouse, kieuThueHouse,
                            tieuChuanPhongHouse, dienTichHoBoiHouse, soTangHouse);
                    facilityIntegerMap.put(house, 0);
                case 3:

                    String nameRoom = ValidateFacility.room();
                    String maDichVuRoom = sc.nextLine();
                    System.out.println(" nhập diện tích : ");
                    System.out.println(" nhập diện tích : ");
                    int dienTichSuDungRoom = Integer.parseInt(sc.nextLine());
                    System.out.println("nhập chi phí thuế : ");
                    double chiPhiThueRoom = Double.parseDouble(sc.nextLine());
                    System.out.println("nhập số lượng người : ");
                    int soluongNguoiHouseRoom = Integer.parseInt(sc.nextLine());
                    System.out.println("nhập kiểu thuê : ");
                    String kieuThueHouseRoom = sc.nextLine();
                    System.out.println("nhập tiêu chuẩn phòng : ");
                    String tieuChuanPhongHouseRoom = sc.nextLine();
                    System.out.println("nhập diện tích hồ bơi : ");
                    double dienTichHoBoiHouseRoom = Double.parseDouble(sc.nextLine());
                    System.out.println(" nhập số tầng : ");
                    int soTangHouseRoom = Integer.parseInt(sc.nextLine());
                    Villa room = new Villa(nameRoom,maDichVuRoom, dienTichSuDungRoom, chiPhiThueRoom, soluongNguoiHouseRoom,
                            kieuThueHouseRoom, tieuChuanPhongHouseRoom, dienTichHoBoiHouseRoom, soTangHouseRoom);
                    facilityIntegerMap.put(room, 0);
            }
        } while (choice != 4);
    }

    @Override
    public void edit() {

    }

}


