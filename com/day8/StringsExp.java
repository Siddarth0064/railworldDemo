package com.day8;

import java.util.Arrays;

public class StringsExp {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = new String("hello");
        System.out.println("its Reference Equal: "+ str1==str2);
        System.out.println("its Value Equal :" +str1.equals(str2));

        String str3 = "hello";
        System.out.println("The String Character 'E' is replaced to 'A' :"+ str3.replace('e','a'));

        String str4 = "im Siddarth mp";
        System.out.println("The Original Stirng is :[ "+str4 +" ]and Splited into Substring");
        System.out.println(str4.substring(0,2));
        System.out.println(str4.substring(3,11));
        System.out.println(str4.substring(12,14));

        String str5 ="hello world";
        System.out.println(str5);

        str5+="from Java Programmer";
        System.out.println(str5);


        String str6 ="hello my name is siddarth";
        String str7[] =str6.split(" ");
        System.out.println(Arrays.toString(str7));



    }
}
