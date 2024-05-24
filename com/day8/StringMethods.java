package com.day8;

public class StringMethods {
    public static void main(String[] args) {
        String str = "Hello, World!";

        int length = str.length();
        System.out.println("Length: " + length);

        char charAt3 = str.charAt(3);
        System.out.println("Character at index 3: " + charAt3);

        String concat = str.concat(" Welcome to Java.");
        System.out.println("Concatenated String: " + concat);

        boolean equals = str.equals("Hello, World!");
        System.out.println("Equals 'Hello, World!': " + equals);

        boolean equalsIgnoreCase = str.equalsIgnoreCase("hello, world!");
        System.out.println("EqualsIgnoreCase 'hello, world!': " + equalsIgnoreCase);

        int compareTo = str.compareTo("Hello, World!");
        System.out.println("CompareTo 'Hello, World!': " + compareTo);

        int compareToIgnoreCase = str.compareToIgnoreCase("hello, world!");
        System.out.println("CompareToIgnoreCase 'hello, world!': " + compareToIgnoreCase);

        boolean contains = str.contains("World");
        System.out.println("Contains 'World': " + contains);

        boolean startsWith = str.startsWith("Hello");
        System.out.println("Starts with 'Hello': " + startsWith);

        boolean endsWith = str.endsWith("!");
        System.out.println("Ends with '!': " + endsWith);

        int indexOfW = str.indexOf('W');
        System.out.println("Index of 'W': " + indexOfW);

        int lastIndexOfO = str.lastIndexOf('o');
        System.out.println("Last index of 'o': " + lastIndexOfO);

        String substring = str.substring(7);
        System.out.println("Substring from index 7: " + substring);

        String substringRange = str.substring(7, 12);
        System.out.println("Substring from index 7 to 12: " + substringRange);

        String lowerCase = str.toLowerCase();
        System.out.println("Lowercase: " + lowerCase);

        String upperCase = str.toUpperCase();
        System.out.println("Uppercase: " + upperCase);

        String replaceOwithA = str.replace('o', 'a');
        System.out.println("Replace 'o' with 'a': " + replaceOwithA);

        String[] split = str.split(", ");
        System.out.println("Split by ', ': " + split[0] + " and " + split[1]);

        String trimStr = "  Hello, World!  ";
        String trimmed = trimStr.trim();
        System.out.println("Trimmed string: '" + trimmed + "'");

        String interned = str.intern();
        System.out.println("Interned string: " + interned);
    }
}
