package checkvalidate;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateFacility {
    private static Scanner sc = new Scanner(System.in);

    private static final String REGEX_VILLA = "^[S][V][V][L][-][0-9]{4}$";
    private static final String REGEX_HOUSE = "^[S][V][H][O][-][0-9]{4}$";
    private static final String REGEX_ROOM = "^[S][V][R][O][-][0-9]{4}$";

    private static final String VILLA = "^[V][i][l][l][a]$";
    private static final String HOUSE = "^[H][o][u][s][e]$";
    private static final String ROOM = "^[R][o][o][m]$";

    public static String villa() {
        while (true) {
            System.out.println("nhập tên dịch vụ : ");
            String villaName = sc.nextLine();
            if (Pattern.matches(VILLA, villaName)) {
                return villaName;
            } else {
                System.out.println("bạn nhập sai.");
                System.out.println("Tên dịch vụ phải bắt đầu bằng in hoa.");
            }
        }
    }

    public static String house() {
        while (true) {
            String houseName = sc.nextLine();
            if (Pattern.matches(HOUSE, houseName)) {
                return houseName;
            } else {
                System.out.println("bạn nhập sai.");
                System.out.println("Tên dịch vụ phải bắt đầu bằng in hoa.");
            }
        }
    }

    public static String room() {
        while (true) {
            String roomName = sc.nextLine();
            if (Pattern.matches(ROOM, roomName)) {
                return roomName;
            } else {
                System.out.println("bạn nhập sai.");
                System.out.println("Tên dịch vụ phải bắt đầu bằng in hoa.");
            }
        }
    }

    private static String maDichVuVilla() {
        while (true) {
            String villa = sc.nextLine();
            if (Pattern.matches(REGEX_VILLA, villa)) {
                return villa;
            }else {
                System.out.println("bạn nhập sai.");
                System.out.println("Mã dịch vụ phải đúng định dạng: SVXX-YYYY, với YYYY là các số từ 0-9");
        }
    }
}
private static String maDichVuHouse() {
        while (true) {
            String house = sc.nextLine();
            if (Pattern.matches(REGEX_HOUSE, house)) {
                return house;
            }else {
                System.out.println("bạn nhập sai.");
                System.out.println("Mã dịch vụ phải đúng định dạng: SVXX-YYYY, với YYYY là các số từ 0-9");
        }
    }
}
private static String maDichVuRoom() {
        while (true) {
            String room = sc.nextLine();
            if (Pattern.matches(REGEX_ROOM, room)) {
                return room;
            }else {
                System.out.println("bạn nhập sai.");
                System.out.println("Mã dịch vụ phải đúng định dạng: SVXX-YYYY, với YYYY là các số từ 0-9");
        }
    }
}

//    public static void main(String[] args) {
//        maDichVuHouse();
//
//    }

}
