package io.firecode;

import java.util.Set;

import static org.junit.Assert.assertEquals;

/**
 * Given an Array containing 9 numbers ranging from 1 to 10, write a method to find the missing number.
 * Assume you have 9 numbers between 1 to 10 and only one number is missing.
 */
public class FindMissingNumber {

    public static void main(String[] args) {
        assertEquals(findMissingNumber(new int[]{1, 2, 4, 5, 6, 7, 8, 9, 10}), 3);
    }

    private static int findMissingNumber(int[] arr) {
        int sumOfNumbers = 55;
        int currentSum = 0;
        for (int i : arr) {
            currentSum += i;
        }
        return sumOfNumbers - currentSum;
    }
}
