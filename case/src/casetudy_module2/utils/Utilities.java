package casetudy_module2.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utilities {
    public static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
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
