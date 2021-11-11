package controllers;

import services.*;
import services.EmployeeServiceImpl;

import java.util.Scanner;

public class FuramaController {

    public static void main(String[] args) {
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        BookingServiceImpl bookingService = new BookingServiceImpl();
        Scanner sc = new Scanner(System.in);
        boolean flagMain = true;
        while (flagMain) {
            System.out.println("====||FURAMA RESORT SYSTEM||====" + "\n" + "1.Employee Management" + "\n"
                    + "2.Customer Management" + "\n" + "3.Facility Management" + "\n" + "4.Booking Management"
                    + "\n" + "5.Promotion Management" + "\n" + "6.Exit");
            try {


                int choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 1: {
                        boolean flag = true;
                        while (flag) {
                            System.out.println("====||EMPLOYEE SYSTEM||====" + "\n" + "1.Display list employee" + "\n" +
                                    "2.Add new employee" + "\n" + "3.Edit employee" + "\n" + "4.Return main menu");
                            int choice1 = Integer.parseInt(sc.nextLine());
                            switch (choice1) {
                                case 1:
                                    employeeService.show();
                                    break;
                                case 2:
                                    employeeService.add();
                                    break;
                                case 3:
                                    employeeService.edit();
                                    break;
                                case 4:
                                    flag = false;
                                    break;
                            }
                        }
                        break;
                    }
                    case 2: {
                        boolean flag = true;
                        while (flag) {
                            System.out.println("====||CUSTOMER SYSTEM||====" + "\n" + "1.Display list customer" + "\n" +
                                    "2.Add new customer" + "\n" + "3.Edit customer" + "\n" + "4.Return main menu");
                            int choice2 = Integer.parseInt(sc.nextLine());
                            switch (choice2) {
                                case 1:
                                    customerService.show();
                                    break;
                                case 2:
                                    customerService.add();
                                    break;
                                case 3:
                                    customerService.edit();
                                    break;
                                case 4:
                                    flag = false;
                                    break;
                            }
                        }
                        break;
                    }
                    case 3: {
                        boolean flag = true;
                        while (flag) {
                            System.out.println("====||FACILITIES SYSTEM||====" + "\n" + "1.Display list facility" + "\n" +
                                    "2.Add new facility" + "\n" + "3.Display maintenance list" + "\n" + "4.Return main menu");
                            int choice3 = Integer.parseInt(sc.nextLine());
                            switch (choice3) {
                                case 1:
                                    facilityService.show();
                                    break;
                                case 2:
                                    facilityService.add();
                                    break;
                                case 3:
                                    facilityService.showFacility();
                                    break;
                                case 4:
                                    flag = false;
                                    break;
                            }
                        }
                        break;
                    }
                    case 4: {
                        boolean flag = true;
                        while (flag) {
                            System.out.println("====||BOOKING SYSTEM||====" + "\n" + "1.Add new booking" + "\n" +
                                    "2.Display list booking" + "\n" + "3.Create new contracts" + "\n" + "4.Display list contracts" + "\n"
                                    + "5.Edit  contracts" + "\n" + "6.Return main menu");
                            int choice4 = Integer.parseInt(sc.nextLine());
                            switch (choice4) {
                                case 1:
                                    bookingService.add();
                                    break;
                                case 2:
                                    bookingService.show();
                                    break;
                                case 3:
                                    break;
                                case 4:
                                    break;
                                case 5:
                                    break;
                                case 6:
                                    flag = false;
                                    break;
                            }
                        }
                        break;
                    }
                    case 5: {
                        boolean flag = true;
                        while (flag) {
                            System.out.println("====||PROMOTION SYSTEM||====" + "\n" + "1. Display list customers use service" + "\n"
                                    + "2. Display list customers get voucher" + "\n" + "3. Return main menu");
                            int choice5 = Integer.parseInt(sc.nextLine());
                            switch (choice5) {
                                case 1:
                                    break;
                                case 2:
                                    break;
                                case 3:
                                    flag = false;
                                    break;
                            }
                        }
                        break;
                    }
                    case 6: {
                        flagMain = false;
                        break;
                    }
                    default: {
                        System.out.println("Không hợp lệ.");
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("mời bạn nhập lại .");
            }
        }
    }
}