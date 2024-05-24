package com.day14;

import java.util.Arrays;

public class LamdaProgrammes {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Arrays.stream(numbers)
                .filter(n -> n % 2 == 0)
                .forEach(n -> System.out.println("Even number: " + n));


        System.out.print("Greate Number then 5 : ");
        Arrays.stream(numbers)
                .filter(n -> n>5)
                .forEach(n -> System.out.print(n+" "));
    }
}
