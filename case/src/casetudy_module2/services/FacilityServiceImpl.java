package casetudy_module2.services;

import casetudy_module2.models.Facility;
import casetudy_module2.models.House;
import casetudy_module2.models.Room;
import casetudy_module2.models.Villa;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FacilityServiceImpl implements FacilityService {
    private static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
    private static Scanner sc = new Scanner(System.in);


    static {
        facilityIntegerMap.put(new Villa("villa", 70, 100000, 2, Villa.DATE, "A", 10, 9), 0);
        facilityIntegerMap.put(new Villa("villa1", 100, 750000, 3, Villa.MONTH, "A", 15, 12), 0);
        facilityIntegerMap.put(new Villa("villa2", 80, 250000, 2, Villa.HOURS, "A", 10, 15), 0);
    }

    public void show() {
        Set<Facility> facilitySet = facilityIntegerMap.keySet();
        for (Facility o : facilitySet) {
            System.out.println(o + " : times " + facilityIntegerMap.get(o));
        }
    }

    public static Facility getFacility(String serviceName) {
        for (Map.Entry<Facility, Integer> map : facilityIntegerMap.entrySet()) { 
            if (map.getKey().getNameDv().contains(serviceName)) {
                map.setValue(map.getValue() + 1);
                return map.getKey();
            }
        }
        return null;
    }

        public void addFacility () {
            boolean flag = true;
            while (flag) {

                System.out.println("nhập tên dịch vụ : ");
                String nameDv = sc.nextLine();
                System.out.println(" nhập diện tích : ");
                int dienTichSuDung = Integer.parseInt(sc.nextLine());
                System.out.println("nhập chi phí thuế : ");
                double chiPhiThue = Double.parseDouble(sc.nextLine());
                System.out.println("nhập số lượng người : ");
                int soluongNguoi = Integer.parseInt(sc.nextLine());
                System.out.println("nhập kiểu thuê : ");
                String kieuThue = sc.nextLine();
                try {
                    System.out.println("Nhập số bạn cần chọn : "
                            + "1.Add New Villa"
                            + "2. Add New House"
                            + " 3. Add New Room"
                            + " 4. Back to menu"
                    );

                    int choice = Integer.parseInt(sc.nextLine());
                    if (choice == 4 || choice > 4) break;
                    switch (choice) {
                        case 1:
                            flag = true;
                            while (flag) {
                                flag = false;
                                try {
                                    System.out.println("nhập tiêu chuẩn phòng : ");
                                    String tieuChuanPhong = sc.nextLine();
                                    System.out.println("nhập diện tích hồ bơi : ");
                                    double dienTichHoBoi = Double.parseDouble(sc.nextLine());
                                    System.out.println(" nhập số tầng : ");
                                    int soTang = Integer.parseInt(sc.nextLine());
                                    Villa villa = new Villa(nameDv, dienTichSuDung, chiPhiThue, soluongNguoi, kieuThue, tieuChuanPhong, dienTichHoBoi, soTang);
                                    facilityIntegerMap.put(villa, 0);
                                } catch (Exception exception) {
                                    System.out.println("Đâu vao không hợp lệ");
                                    flag = true;
                                }
                            }
                            break;
                        case 2:
                            flag = true;
                            while (flag) {
                                flag = false;
                                try {
                                    System.out.println("nhập tiêu chuẩn phòng : ");
                                    String tieuChuanPhong = sc.nextLine();
                                    System.out.println(" nhập số tầng : ");
                                    int soTang = Integer.parseInt(sc.nextLine());
                                    House house = new House(nameDv, dienTichSuDung, chiPhiThue, soluongNguoi, kieuThue, tieuChuanPhong, soTang);
                                    facilityIntegerMap.put(house, 0);
                                } catch (Exception e) {
                                    System.out.println("Đầu vào không hợp lệ");
                                    flag = true;
                                }
                            }
                            break;
                        case 3:
                            flag = true;
                            while (flag) {
                                flag = false;
                                try {
                                    System.out.println(" nhập dịch vụ đi kèm : ");
                                    String dichVuFreeDiKem = sc.nextLine();
                                } catch (Exception e) {
                                    System.out.println("Đầu vào không hợp lệ");
                                    flag = true;
                                }
                            }
                            break;
                    }
                } catch (Exception e) {
                    System.out.println(" Đâu vao không hợp lệ!");
                }
            }
        };

    }


