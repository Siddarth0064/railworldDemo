package com.day8;

import java.util.Scanner;

public class StringBuilderExp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        StringBuilder str1 = new StringBuilder("hello ");
        System.out.println("Original String: "+ str1);
        str1.append("world");
        System.out.println("Using Append Method: "+str1);

        str1.delete(5,11);
        System.out.println("Using Delete Metho: "+str1);

        str1.insert(0,"hi ");
        System.out.println("Using Insert Method: "+str1);

        System.out.print("Enter String Here: ");
        String str2 = scan.nextLine();
        for (int i =str2.length()-1; i>=0;i--){
            System.out.print(str2.charAt(i)+" ");
        }
        System.out.println();

        System.out.println("Length: "+str2.length() +" Capacity: "+ str1.capacity());



    }
}
