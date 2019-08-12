package io.firecode;

import java.util.Arrays;

/**
 * Write a method that searches an Array of integers for a given integer using the
 * Binary Search Algorithm. If the input integer is found in the array, return true. Otherwise, return false.
 * You can assume that the given array of integers is already sorted
 * in ascending order.
 * Examples:
 * <p>
 * binarySearch({2,5,7,8,9},9) -> true
 * <p>
 * binarySearch({2,8,9,12},6) -> false
 * <p>
 * binarySearch({2},4) -> false
 * <p>
 * binarySearch({},9) -> false
 * <p>
 * {} -> [Empty] Array
 */
public class BinarySearch {

    public static void main(String[] args) {
        System.out.println(binarySearch(new int[]{2, 5, 7, 9, 12}, 2));
    }

    private static Boolean binarySearch(int[] arr, int n) {

        if (arr == null || arr.length == 0 || arr[arr.length - 1] < n || arr[0] > n) return false;

        int start = 0;
        int end = arr.length - 1;

        while (end >= start) {
            int middle = start + (end - start) / 2;

            if (arr[middle] == n) return true;

            if (arr[middle] > n) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }

        return false;
    }
}
