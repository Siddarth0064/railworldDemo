package com.day8;

public class ReversStringPalindrome {
    public static void main(String[] args) {

        String originalString = "hello";
        String reversedString = "";

        for (int i = originalString.length() - 1; i >= 0; i--) {
            reversedString += originalString.charAt(i);
        }

        System.out.println("Original string: " + originalString);
        System.out.println("Reversed string: " + reversedString);


        String palindromeString = "level";
        boolean isPalindrome = true;

        for (int i = 0; i < palindromeString.length() / 2; i++) {
            if (palindromeString.charAt(i) != palindromeString.charAt(palindromeString.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("String: " + palindromeString);
        System.out.println("Is palindrome: " + isPalindrome);
    }
}
