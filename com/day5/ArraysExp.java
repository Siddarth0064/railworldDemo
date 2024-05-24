package com.day5;

import java.util.Arrays;

public class ArraysExp {
    public static void main(String[] args) {
        int[] array = {5, 3, 8, 1, 2};

        int length = array.length;
        System.out.println("Length: " + length);

        int[] copiedArray = Arrays.copyOf(array, array.length);
        System.out.println("Copied array: " + Arrays.toString(copiedArray));

        Arrays.sort(array);
        System.out.println("Sorted array: " + Arrays.toString(array));

        int binarySearchResult = Arrays.binarySearch(array, 3);
        System.out.println("Index of 3 after binary search: " + binarySearchResult);

        int[] filledArray = new int[5];
        Arrays.fill(filledArray, 7);
        System.out.println("Filled array: " + Arrays.toString(filledArray));

        int[][] array2D = {{1, 2}, {3, 4}};
        String array2DString = Arrays.deepToString(array2D);
        System.out.println("2D array as string: " + array2DString);

        boolean arraysEquals = Arrays.equals(array, copiedArray);
        System.out.println("Arrays equal: " + arraysEquals);

        boolean deepArraysEquals = Arrays.deepEquals(array2D, new int[][]{{1, 2}, {3, 4}});
        System.out.println("2D arrays deep equals: " + deepArraysEquals);

        Arrays.fill(array, 0);
        System.out.println("Array filled with 0: " + Arrays.toString(array));

        int[] arrayToList = {1, 2, 3, 4, 5};
        System.out.println("Array to list: " + Arrays.toString(arrayToList));
    }
}
