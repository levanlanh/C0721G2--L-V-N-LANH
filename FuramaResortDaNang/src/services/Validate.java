package services;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Validate {
    protected static Scanner sc = new Scanner(System.in);

    public static final String REGEX_VILLA = "^[S][V][V][L][-][0-9]{4}$";
    public static final String REGEX_HOUSE = "^[S][V][H][O][-][0-9]{4}$";
    public static final String REGEX_ROOM = "^[S][V][R][O][-][0-9]{4}$";

    public static final String VILLA = "^[V][i][l][l][a]$";
    public static final String HOUSE = "^[H]o[u]s[e]$";
    public static final String ROOM = "^[R]o[o]m$";
    public static final String SOLUONG = "^[1-9]|[1][0-9]$";
    public static final String DIENTICHSUDUNG = "^[3-9][0-9]*$";
    public static final String DIENTICHHOBOI = "^[3-9][0-9]*$";
    public static final String CHIPHITHUE = "^[1-9]\\d*$";
    public static final String SOTANG = "^[1-9][0-9]?$";
    public static final String TIEUCHUANPHONG = "^[ABCD]$";

    public static String regex(String regex, String msg) {
        while (true) {
            System.out.println(msg);
            String input = sc.nextLine();
            if (Pattern.matches(regex, input)) {
                return input;
            } else {
                System.out.println("mời bạn nhập lại ");
            }
        }
    }


}
