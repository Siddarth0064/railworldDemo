package com.day11.dates;

import java.util.Scanner;

public class LeapYear {
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Year: ");
        int year = scan.nextInt();
        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }

        String input = "$2000";
        String incrementedString = incrementString(input);
        System.out.println("Incremented string: " + incrementedString);
    }
    public static String incrementString(String str) {
        String numericPart = str.substring(1);
        int numericValue = Integer.parseInt(numericPart);
        numericValue++;
        String incrementedString = "$" + numericValue;
        return incrementedString;
    }
}
