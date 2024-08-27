package TwoDimensionalArrays;

import java.util.Arrays;

public class Transpose {
    public static void main(String[] args) {
        int[][] arr = {{-1, 3, 2},
                        {4, 5, 9},
                        {7, 1, 6}};
        int n = arr.length;
        int m = arr[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < m; j++) {
                // * we will not touch our diagonal elements, swap only upper triagle with lower triangle
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
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
}
