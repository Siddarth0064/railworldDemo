package com.day5;

import java.util.Scanner;

public class TwoDArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = 3;
        int columns = 3;
        int[][] array = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter value for array[" + i + "][" + j + "]: ");
                array[i][j] = scanner.nextInt();
            }
        }

        System.out.println("2D Array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
