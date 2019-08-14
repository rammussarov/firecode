package io.firecode;

/**
 * Write a method to compute the binary representation of a positive integer. The method should return a string with 1s and 0s.
 * <p>
 * computeBinary(6) ==> "110"
 * computeBinary(5) ==> "101"
 */
public class BinaryRepresentation {

    public static void main(String[] args) {
        System.out.println(computeBinary(6));
    }

    private static String computeBinary(int val) {
        if (val == 0 || val == 1) return String.valueOf(val);
        return computeBinary(val / 2) + val % 2;
    }
}
