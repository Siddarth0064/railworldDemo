package com.day3;

import java.util.Scanner;

public class SwapTwoNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Using Arithmetic Operator ");
        System.out.print("Enter num1 :");
        int num1 = scan.nextInt();
        System.out.print("Enter num2 :");
        int num2 = scan.nextInt();
        System.out.printf("befor swap : num1= %d    num2= %d\n",num1,num2);
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.printf("after swap : num1= %d    num2= %d\n",num1,num2);

        System.out.println("Using BitWise Operator  ");
        System.out.print("Enter num3 :");
        int num3 = scan.nextInt();
        System.out.print("Enter num4 :");
        int num4 = scan.nextInt();
        System.out.printf("befor swap : num3= %d    num4= %d\n",num3,num4);
        num3=num3^num4;
        num4=num3^num4;
        num3=num3^num4;
        System.out.printf("after swap : num3= %d    num4= %d",num3,num4);
    }
}
