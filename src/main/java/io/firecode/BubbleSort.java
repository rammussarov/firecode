package io.firecode;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * Write a method that takes in an array of ints and uses the Bubble Sort algorithm to sort the array 'in place' in ascending order.
 * The method should return the same, in-place sorted array.
 * <p>
 * Note: Bubble sort is one of the most inefficient ways to sort a large array of integers. Nevertheless, it is an interview favorite.
 * Bubble sort has a time complexity of O(n2).
 * However, if the sample size is small, bubble sort provides a simple implementation of a classic sorting algorithm.
 */
public class BubbleSort {

    public static void main(String[] args) {
        assertEquals(Arrays.toString(bubbleSortArray(new int[]{5, 4, 3})), "[3, 4, 5]");
        assertEquals(Arrays.toString(bubbleSortArray(new int[]{3})), "[3]");
    }

    private static int[] bubbleSortArray(int[] arr) {

        if (arr == null || arr.length == 0) return arr;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int a = arr[j];
                    arr[j] = arr[i];
                    arr[i] = a;
                }
            }
        }
        return arr;
    }
}
