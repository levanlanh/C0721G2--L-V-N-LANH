package bai19_string_and_regex.exercise.phonevalidate;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberPhoneValidate {
    public static final String PHONE_REGEX = "^[\\d]{2}[-][0][\\d]{9}$";

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile(PHONE_REGEX);
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter number phone :");
            String input = scanner.nextLine();
            Matcher matcher = pattern.matcher(input);
            if (matcher.matches()) {
                System.out.println("Number phone oke ");
                break;
            } else {
                System.err.println("Number phone not oke ");
            }
        }
    }
}