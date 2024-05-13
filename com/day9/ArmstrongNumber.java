package com.day9;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter A Number To Check Armstrong NUmber: ");
        int armstrongNumber = scan.nextInt();
        int originalNumber = armstrongNumber;
        int result = 0;

        while (originalNumber != 0) {
            int remainder = originalNumber % 10;
            result += (int)Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        boolean isArmstrong = armstrongNumber == result;
        if (isArmstrong){
            System.out.println( armstrongNumber + " is  an Armstrong: " );
        }else {
            System.out.println(armstrongNumber + " is Not an Armstrong: ");
        }
    }
}
