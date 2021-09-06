package bai1_introduction_to_java.exercise;

import java.util.Scanner;

public class NumbersIntoLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số cần đọc : ");
        int number = scanner.nextInt();
        String result = "";


        if (number <= 10 && number >= 0) {
            switch (number) {
                case 0:
                    result += "zero";
                    break;

                case 1:
                    result += "One";
                    break;

                case 2:
                    result += "Two";
                    break;

                case 3:
                    result += "Three";
                    break;

                case 4:
                    result += "Four";
                    break;

                case 5:
                    result += "Five";
                    break;

                case 6:
                    result += "Six";
                    break;

                case 7:
                    result += "Seven";
                    break;

                case 8:
                    result += "Eight";
                    break;

                case 9:
                    result += "Nine";
                    break;

                case 10:
                    result += "ten";
                    break;


            }
        }
        if (number < 20 && number > 10) {
            switch (number) {
                case 11:
                    result += "eleven";
                    break;
                case 12:
                    result += "twelve";
                    break;
                case 13:
                    result += "thirteen";
                    break;
                case 14:
                    result += "fourteen";
                    break;
                case 15:
                    result += "fifteen";
                    break;
                case 16:
                    result += "sixteen";
                    break;
                case 17:
                    result += "seventeen";
                    break;
                case 18:
                    result += "eighteen";
                    break;
                case 19:
                    result += "nineteen";
                    break;

            }
        }
        if(number <1000 && number >100){
            int dozen = number%100/10;
            int unit = (number%100)%10;
            number/=100;

            switch (number){
                case 1:
                    result += "onehundreds";break;
                case 2:
                    result += "twohundreds";break;
                case 3:
                    result += "threehundreds";break;
                case 4:
                    result += "fourhundreds";break;
                case 5:
                    result += "fivehundreds";break;
                case 6:
                    result += "sixhundreds";break;
                case 7:
                    result += "sevenhundreds";break;
                case 8:
                    result += "eighthundreds";break;
                case 9:
                    result += "ninehundreds";break;
            }
            switch (dozen) {
                case 2:
                    result += "twenty";
                    break;
                case 3:
                    result += "thirty";
                    break;
                case 4:
                    result += "fourty";
                    break;
                case 5:
                    result += "fifty";
                    break;
                case 6:
                    result += "sixty";
                    break;
                case 7:
                    result += "seventy";
                    break;
                case 8:
                    result += "eighty";
                    break;
                case 9:
                    result += "ninety";
                    break;

            }
            switch (unit) {
                case 1:
                    result += " one";
                    break;

                case 2:
                    result += "two";
                    break;
                case 3:
                    result += "three";
                    break;
                case 4:
                    result += "four";
                    break;
                case 5:
                    result += "five";
                    break;
                case 6:
                    result += "six";
                    break;
                case 7:

                    result += "seven";
                    break;
                case 8:
                    result += "eight";
                    break;
                case 9:
                    result += "nine";
                    break;
            }
        System.out.println(result);
        }

    }

}





