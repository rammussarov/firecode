package io.firecode;

import java.util.Arrays;

/**
 * You are given an m x n 2D image matrix where each integer represents a pixel. Flip it in-place along its horizontal axis.
 * <p>
 * Example:
 * <p>
 * Input image :
 * 1 1
 * 0 0
 * Modified to :
 * 0 0
 * 1 1
 */
public class HorizontalFlip {

    public static void main(String[] args) {
        int[][] testArray = new int[][]{{1, 1}, {0, 0}};
        flipHorizontalAxis(testArray);
        for (int[] arr : testArray) {
            System.out.println(Arrays.toString(arr));
        }
    }

    private static void flipHorizontalAxis(int[][] matrix) {
        if (matrix == null) return;

        int innerSize = matrix[0].length;
        int outerSize = matrix.length - 1;
        int swap;

        for (int i = 0; i < innerSize; i++) {
            for (int j = 0; j <= outerSize / 2; j++) {
                swap = matrix[j][i];
                matrix[j][i] = matrix[outerSize - j][i];
                matrix[outerSize - j][i] = swap;
            }
        }
    }

}
