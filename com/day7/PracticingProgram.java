package com.day7;

public class PracticingProgram {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        System.out.println("First element: " + numbers[0]);
        System.out.println("Second element: " + numbers[1]);

        numbers[2] = 10;
        System.out.println("Modified third element: " + numbers[2]);

        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println("Length of the array: " + numbers.length);

        int[] newArray = new int[3];
        newArray[0] = 10;
        newArray[1] = 20;
        newArray[2] = 30;

        System.out.println("New array elements:");
        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i]);
        }
    }
}
