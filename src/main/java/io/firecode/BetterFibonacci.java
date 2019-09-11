package io.firecode;

import static org.junit.Assert.assertEquals;

/**
 * The Fibonacci Sequence is the series of numbers: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ... The next number is found by adding up the two numbers before it.
 * <p>
 * Your goal is to write an optimal method - betterFibonacci that returns the nth Fibonacci number in the sequence.
 * n is 0 indexed, which means that in the sequence 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ..., n == 0 should return 0 and n == 3 should return 2.
 * Your method should exhibit a runtime complexity of O(n) and use constant O(1) space.
 * With this implementation, your method should be able to compute larger sequences where n > 40.
 */
public class BetterFibonacci {

    public static void main(String[] args) {
        assertEquals(betterFibonacci(0), 0);
        assertEquals(betterFibonacci(1), 1);
        assertEquals(betterFibonacci(2), 1);
        assertEquals(betterFibonacci(3), 2);
        assertEquals(betterFibonacci(9), 34);
    }

    private static int betterFibonacci(int n) {
        if (n == 0) return 0;

        int first = 0;
        int second = 1;
        int buffer;

        for (int i = 1; i < n; i++) {
            buffer = first;
            first = second;
            second += buffer;
        }

        return second;
    }
}
