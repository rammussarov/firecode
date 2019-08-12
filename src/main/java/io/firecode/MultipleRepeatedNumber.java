package io.firecode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Write a method duplicate to find the repeated or duplicate elements in an array.
 * This method should return a list of repeated integers in a string with the elements sorted in ascending order (as illustrated below).
 * <p>
 * duplicate({1,3,4,2,1}) --> "[1]"
 * <p>
 * duplicate({1,3,4,2,1,2,4}) --> "[1, 2, 4]"
 * <p>
 * Note: You may use toString() method to return the
 * standard string representation of most data structures, and
 * Arrays.sort() to sort your result.
 */
public class MultipleRepeatedNumber {

    public static void main(String[] args) {
        System.out.println(duplicate(new int[]{1, 3, 4, 2, 1, 2, 4}));
    }

    private static String duplicate(int[] numbers) {
        Map<Integer, Integer> numbersCount = new HashMap<>();
        for (int number : numbers) {
            numbersCount.merge(number, 1, (a, b) -> a + b);
        }

        List<Integer> repeatedNumbers = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : numbersCount.entrySet()) {
            if (entry.getValue() > 1) repeatedNumbers.add(entry.getKey());
        }

        return repeatedNumbers.toString();
    }
}
