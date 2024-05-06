package com.day3;
import java.util.Arrays;
import java.util.Scanner;

public class ArraysQuestion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size of array");
        int size = scan.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.printf("Enter the %dth of the array:",i);
            arr[i] = scan.nextInt();
        }
        int highest = arr[0];
        int secondHighest = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > highest) {
                secondHighest = highest;
                highest = num;
            } else if (num > secondHighest && num < highest) {
                secondHighest = num;
            }
        }
        System.out.println("Arr: " + Arrays.toString(arr));
        System.out.println(secondHighest+" is the Second highest number");
    }
}
