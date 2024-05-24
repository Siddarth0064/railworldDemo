package com.day6;

import java.util.Arrays;
import java.util.Scanner;

public class FindPeakNumber {
    public static int findPeakElement(int[] array) {
      int peak =0;
       for ( int i = 0; i < array.length; i++){
           if (i==0){
               if(array[i]>array[i+1]) {
                   peak = array[i];
               }
           }else if (i== array.length-1){
               if(array[i]>array[i-1]){
                   peak=array[i];
               }
           }else{
               if(array[i]>array[i-1] && array[i]>array[i+1]){
                   peak=array[i];
               }
           }
       }
        return peak;
    }

    public static void main(String[] args) {
        System.out.print("Enter Length of an Array: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for (int i = 0 ; i<n;i++){
            System.out.printf("Enter value of %dth index: ",i);
            arr[i]=scan.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int peakNumber =findPeakElement(arr);
        System.out.println(peakNumber+" is the  Peak Number  ");
    }
}
