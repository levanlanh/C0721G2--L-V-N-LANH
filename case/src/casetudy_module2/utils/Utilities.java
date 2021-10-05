package casetudy_module2.utils;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Utilities implements Serializable {
    public static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
    protected static Scanner sc = new Scanner(System.in);

    public Date convertDate (String bookingDate){
        Date date = null;
        try {
            date = simpleDateFormat.parse(bookingDate);
        } catch (ParseException e) {
            e.printStackTrace();
            System.out.println("lỗi format");
        }
        return date;

    }
}
