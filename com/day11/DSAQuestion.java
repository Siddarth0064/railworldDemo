package com.day11;

import java.util.Scanner;

public class DSAQuestion {
    public static boolean isDisarium(int number) {
        String str = String.valueOf(number);
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            int digit = Character.getNumericValue(str.charAt(i));
            sum += (int)Math.pow(digit, i + 1);
        }
        return sum == number;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Number: ");
                int number = scan.nextInt();
                if (isDisarium(number)) {
                    System.out.println(number + " is a Disarium number");
                } else {
                    System.out.println(number + " is not a Disarium number");
               }
        }

    }

