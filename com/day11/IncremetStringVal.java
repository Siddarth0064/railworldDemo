package com.day11;

public class IncremetStringVal {


    public static void main(String[] args) {
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
