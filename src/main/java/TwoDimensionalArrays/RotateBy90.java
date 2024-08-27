package TwoDimensionalArrays;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class RotateBy90 {
    public static void main(String[] args) {

        // * to rotate an array by 90 degree
        /*

              |-3 2 1 6 4 |         |
              |2 3 -1 6 2 |    ->   |
              |3 9 8 -1 2 |         |
              |3 -2 4 6 1 |         |
              |9 -3 1 2 -1|         |
         */
        // * first transpose the matrix and
        int [][] arr = {{-3, 2, 1, 6, 4},
                        {2, 3, -1, 6, 2},
                        {3, 9, 8, -1, 2},
                        {3, -2, 4, 6, 1},
                        {9, -3, 1, 2, -1}};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        print(arr);
        System.out.println();
        // * then reverse every row to get rotated matrix
        reverse(arr);
        print(arr);

    }


    public static void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void reverse(int[][] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int start = 0;
            int end = arr[i].length - 1;

            while (start < end) {
                int temp = arr[i][start];
                arr[i][start] = arr[i][end];
                arr[i][end] = temp;
                start++;
                end--;
            }

        }
    }


}
