package com.day4;

import java.util.Scanner;

public class NestedTernaryOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Date : ");
        int day = scan.nextInt();
        String message = (day == 4) ? "Day 4 Training Completed Today" : (day <= 4) ? "Day 4 Training is not Completed" : "Day 4 Training Already Completed";
        System.out.println(message);
    }
}
