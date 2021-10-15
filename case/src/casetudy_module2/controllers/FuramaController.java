package casetudy_module2.controllers;

import casetudy_module2.services.booking.BookingServiceImpI;
import casetudy_module2.services.contract.ContractServiceImpI;
import casetudy_module2.services.customer.CustomerServiceImpl;
import casetudy_module2.services.employee.EmployeeServiceImpl;
import casetudy_module2.services.facility.FacilityServiceImpl;

import java.util.Scanner;


public class FuramaController {
    public static void main(String[] args) {
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        BookingServiceImpI bookingService = new BookingServiceImpI();
        ContractServiceImpI contractService = new ContractServiceImpI();

        Scanner sc = new Scanner(System.in);
        int selection;
        do {
            System.out.println("1.Employee Management");
            System.out.println("2.Customer Management");
            System.out.println("3.Facility Management ");
            System.out.println("4.Booking Management");
            System.out.println("5.Promotion Management");
            System.out.println("6.Exit");
            System.out.println("Choose: ");
            selection = sc.nextInt();
            switch (selection) {
                case 1:
                    System.out.println("1.display");
                    System.out.println("2.Add new employee");
                    System.out.println("3.Edit employee");
                    System.out.println("4.return main menu ");
                    int selection1 = sc.nextInt();
                    switch (selection1) {
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
                            System.out.println("return lại menu");
                            break;
                    }
                case 2:
                    System.out.println("1. Display list customers");
                    System.out.println("2. add new customers");
                    System.out.println("3. Edit customer");
                    System.out.println("4. Return main menu");
                    selection1 = sc.nextInt();
                    sc.nextLine();
                    switch (selection1) {
                        case 1:
                            customerService.show();
                            break;

                        case 2:
                            customerService.add();
                            break;

                        case 3:
                            String name1 = sc.nextLine();
                            customerService.edit();
                            break;

                        case 4:
                            break;
                    }
                    break;
                case 3:
                    System.out.println("1 Display list facility");
                    System.out.println("2 Add new facility");
                    System.out.println("3 Display list facility maintenance");
                    System.out.println("4 Return main menu");
                    selection1 = sc.nextInt();
                    sc.nextLine();
                    switch (selection1) {
                        case 1:
                            System.out.println("1 Display list facility");
                            facilityService.show();
                            break;

                        case 2:
                            System.out.println("2 Add new facility");
                            facilityService.add();
                            break;

                        case 3:
                            System.out.println("3 Display list facility maintenance");
                            break;

                        case 4:
                            System.out.println("4 Return main menu");
                            break;
                    }
                    break;
                case 4:
                    System.out.println("1. Add new booking");
                    System.out.println("2. Display list booking");
                    System.out.println("3. Create new constracts");
                    System.out.println("4. Display list contracts");
                    System.out.println("5. Edit contracts");
                    System.out.println("6. Return main menu");
                    selection1 = sc.nextInt();
                    sc.nextLine();
                    switch (selection1) {
                        case 1:
                            System.out.println("1. Add new booking");
                             bookingService.add();
                            break;

                        case 2:
                            System.out.println("2. Display list booking");
                            bookingService.show();
                            break;

                        case 3:
                            System.out.println("3. Create new constracts");
                            contractService.add();
                            break;

                        case 4:
                            System.out.println("4. Display list contracts");
                            contractService.show();
                            break;
                        case 5:
                            System.out.println("5. Edit contracts");
                            contractService.edit();
                            break;
                        case 6:
                            System.out.println("6. Return main menu");
                            break;
                    }
                    break;
                case 5:
                    System.out.println("1. Display list customers use service");
                    System.out.println("2. Display list customers get voucher");
                    System.out.println("3. Return main menu");
                    selection1 = sc.nextInt();
                    sc.nextLine();
                    switch (selection1) {
                        case 1:
                            System.out.println("1. Display list customers use service");

                            break;

                        case 2:
                            System.out.println("2. Display list customers get voucher");

                            break;

                        case 3:

                            break;
                    }
                case 6:
                    System.out.println("exit");
                    break;
            }
        } while (selection != 6);
    }
};