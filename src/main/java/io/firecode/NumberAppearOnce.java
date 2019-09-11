package io.firecode;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * Write a method that returns a number that appears only once in an array.
 * Assume the array will surely have a unique value. The array will never be empty.
 */
public class NumberAppearOnce {

    public static void main(String[] args) {
        assertEquals(singleNumber(new int[]{1,2,3,4,1,2,4,3,5}), 5);
    }

    private static int singleNumber(int[] A) {
        Map<Integer, Integer> numberCount = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            numberCount.merge(A[i], 1, (a, b) -> (a + b));
        }

        for (Map.Entry<Integer, Integer> entry: numberCount.entrySet()) {
            if (entry.getValue() == 1) return entry.getKey();
        }

        return 0;
    }
}
