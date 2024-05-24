package com.day9;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter A Number To Check Palindrome: ");
        int palindromeNumber = scan.nextInt();
        int reversedNumber = 0;
        int originalNumber = palindromeNumber;

        while (originalNumber != 0) {
            int remainder = originalNumber % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            originalNumber /= 10;
        }

        boolean isPalindrome = palindromeNumber == reversedNumber;
        System.out.println("The Number: " + palindromeNumber + ", isPalindrome: " + isPalindrome);
    }
}
