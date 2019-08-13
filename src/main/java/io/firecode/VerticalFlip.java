package io.firecode;

import java.util.Arrays;

/**
 * You are given an m x n 2D image matrix where each integer represents a pixel. Flip it in-place along its vertical axis.
 * <p>
 * Example:
 * Input image :
 * 1 0
 * 1 0
 * <p>
 * Modified to :
 * 0 1
 * 0 1
 */
public class VerticalFlip {

    public static void main(String[] args) {
        int[][] array = new int[][]{{0, 0, 1}, {0, 0, 1}};
        flipItVerticalAxis(array);
        for (int[] arr : array) {
            System.out.println(Arrays.toString(arr));
        }
    }

    private static void flipItVerticalAxis(int[][] matrix) {
        int swap;
        int innerLength = matrix[0].length - 1;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j <= innerLength / 2; j++) {
                swap = matrix[i][j];
                matrix[i][j] = matrix[i][innerLength - j];
                matrix[i][innerLength - j] = swap;
            }
        }
    }
}
