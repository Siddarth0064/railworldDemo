package com.day6;

import java.util.Arrays;

public class SortNumberWise {
    public static void main(String[] args) {

        int[] array = {0, 0, 0, 1, 2, 2, 1};
        sortArray(array);
        System.out.println("Sorted array: " + Arrays.toString(array));
    }
    public static void sortArray(int[] array) {
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        for (int num : array) {
            if (num == 0) {
                count0++;
            } else if (num == 1) {
                count1++;
            } else if (num == 2) {
                count2++;
            }
        }
        int index = 0;
        while (count2 > 0) {
            array[index++] = 2;
            count2--;
        }
        while (count0 > 0) {
            array[index++] = 0;
            count0--;
        }
        while (count1 > 0) {
            array[index++] = 1;
            count1--;
        }
    }
}
