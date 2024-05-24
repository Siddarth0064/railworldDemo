package com.day7;

import java.util.Scanner;

public class TwoDArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number of Column:");
        int column = scan.nextInt();
        System.out.print("Enter Number of Rows:");
        int rows = scan.nextInt();
        int [][] arr = new int[rows][column];

        for (int i = 0 ; i<rows; i++){
            for (int j=0;j<column;j++){
                arr[i][j]= scan.nextInt();
            }
        }
        System.out.println("The Main and Leading Diagonal is: ");
        for (int i = 0 ; i<rows; i++){
            for (int j=0;j<column;j++){
                if (i==j || i+j==rows-1){
                    System.out.print(arr[i][j]);
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
//        for (int i = 0 ; i<rows; i++){
//            for (int j=0;j<column;j++){
//                if (i==j || i+j==rows-1){
//                    System.out.print(arr[i][j]);
//                }else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

    }
}
