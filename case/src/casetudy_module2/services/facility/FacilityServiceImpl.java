package casetudy_module2.services.facility;

import casetudy_module2.models.Facility;
import casetudy_module2.models.Villa;
import casetudy_module2.services.facility.FacilityService;
import checkvalidate.CheckFacility;
import checkvalidate.ValidateFacility;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FacilityServiceImpl implements FacilityService {
    public static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
    private static Scanner sc = new Scanner(System.in);


    static {
        facilityIntegerMap.put(new Villa("villa", "1", 50, 230000,
                4, Villa.DATE, "A", 15, 3), 0);
        facilityIntegerMap.put(new Villa("villa1", "2", 100, 350000, 4,
                Villa.DATE, "A", 12,5), 0);
        facilityIntegerMap.put(new Villa("villa2", "3", 120, 4500000, 3,
                Villa.MONTH, "A", 20, 4), 0);
    }


    @Override
    public void show() {

    }

    public static void showFaclitySet() {
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
                    String nameVilla = ValidateFacility.checkValidate(ValidateFacility.VILLA, "Nhập kiểu là Villa");
                    System.out.println("nhập mã dịch vụ : ");
                    String maDichVuVilla = ValidateFacility.checkValidate(ValidateFacility.REGEX_VILLA, ValidateFacility.mess("MÃ DỊCH VỤ LÀ SVVL THEO SAU LÀ 4 CHỮ SỐ"));
                    System.out.println(" nhập diện tích : ");
                    int dienTichSuDungVilla = Integer.parseInt(CheckFacility.dienTich());
                    System.out.println("nhập chi phí thuế : ");
                    double chiPhiThueVilla = Double.parseDouble(CheckFacility.chiPhi());
                    System.out.println("nhập số lượng người : ");
                    int soluongNguoi = Integer.parseInt(CheckFacility.soLuong());
                    System.out.println("nhập kiểu thuê : ");
                    String kieuThue = sc.nextLine();
                    System.out.println("nhập tiêu chuẩn phòng : ");
                    String tieuChuanPhong = CheckFacility.tieuChuanPhong();
                    System.out.println("nhập diện tích hồ bơi : ");
                    double dienTichHoBoi = Double.parseDouble(CheckFacility.dienTich());
                    System.out.println(" nhập số tầng : ");
                    int soTang = Integer.parseInt(CheckFacility.soTang());
                    Villa villa = new Villa(nameVilla, maDichVuVilla, dienTichSuDungVilla, chiPhiThueVilla, soluongNguoi, kieuThue,
                            tieuChuanPhong, dienTichHoBoi, soTang);
                    facilityIntegerMap.put(villa, 0);
                    break;
                case 2:

                    String nameHouse = ValidateFacility.checkValidate(ValidateFacility.HOUSE, "nhập kiểu là House");
                    System.out.println("nhập mã dịch vụ : ");
                    String maDichVuHouse = ValidateFacility.checkValidate(ValidateFacility.REGEX_HOUSE,
                            ValidateFacility.mess("MÃ DỊCH VỤ LÀ SVHO THEO SAU LÀ 4 CHỮ SỐ"));
                    System.out.println(" nhập diện tích : ");
                    int dienTichSuDung = Integer.parseInt(CheckFacility.dienTich());
                    System.out.println("nhập chi phí thuế : ");
                    double chiPhiThue = Double.parseDouble(CheckFacility.chiPhi());
                    System.out.println("nhập số lượng người : ");
                    int soluongNguoiHouse = Integer.parseInt(CheckFacility.soLuong());
                    System.out.println("nhập kiểu thuê : ");
                    String kieuThueHouse = sc.nextLine();
                    System.out.println("nhập tiêu chuẩn phòng : ");
                    String tieuChuanPhongHouse = CheckFacility.tieuChuanPhong();
                    System.out.println("nhập diện tích hồ bơi : ");
                    double dienTichHoBoiHouse = Double.parseDouble(CheckFacility.dienTich());
                    System.out.println(" nhập số tầng : ");
                    int soTangHouse = Integer.parseInt(CheckFacility.soTang());
                    Villa house = new Villa(nameHouse, maDichVuHouse, dienTichSuDung, chiPhiThue, soluongNguoiHouse, kieuThueHouse,
                            tieuChuanPhongHouse, dienTichHoBoiHouse, soTangHouse);
                    facilityIntegerMap.put(house, 0);
                    break;
                case 3:
                    String nameRoom = ValidateFacility.checkValidate(ValidateFacility.ROOM, "nhập kiểu là Room");
                    System.out.println("nhập mã dịch vụ : ");
                    String maDichVuRoom = ValidateFacility.checkValidate(ValidateFacility.REGEX_ROOM, ValidateFacility.mess("MÃ DỊCH VỤ LÀ SVRO THEO SAU LÀ 4 CHỮ SỐ"));
                    System.out.println(" nhập diện tích : ");
                    int dienTichSuDungRoom = Integer.parseInt(CheckFacility.dienTich());
                    System.out.println("nhập chi phí thuế : ");
                    double chiPhiThueRoom = Double.parseDouble(CheckFacility.chiPhi());
                    System.out.println("nhập số lượng người : ");
                    int soluongNguoiHouseRoom = Integer.parseInt(CheckFacility.soLuong());
                    System.out.println("nhập kiểu thuê : ");
                    String kieuThueHouseRoom = sc.nextLine();
                    System.out.println("nhập tiêu chuẩn phòng : ");
                    String tieuChuanPhongHouseRoom = CheckFacility.tieuChuanPhong();
                    System.out.println("nhập diện tích hồ bơi : ");
                    double dienTichHoBoiHouseRoom = Double.parseDouble(CheckFacility.dienTich());
                    System.out.println(" nhập số tầng : ");
                    int soTangHouseRoom = Integer.parseInt(CheckFacility.soTang());
                    Villa room = new Villa(nameRoom, maDichVuRoom, dienTichSuDungRoom, chiPhiThueRoom, soluongNguoiHouseRoom,
                            kieuThueHouseRoom, tieuChuanPhongHouseRoom, dienTichHoBoiHouseRoom, soTangHouseRoom);
                    facilityIntegerMap.put(room, 0);
                    break;
            }
        } while (choice != 4);
    }

    @Override
    public void edit() {

    }

}


