package Subarrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RotateKelements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int k = 4;
        int n = arr.length;
        k = k % arr.length;
        System.out.println(n-k-1);

        reverse(arr, 0, n - 1 - k); // 2 1 3 4 5 6
        reverse(arr, n-k, n-1);//  2 1 6 5 4 3
        reverse(arr, 0, n-1);// 3 4 5 6 1 2

        System.out.println(Arrays.toString(arr));
    }

    public static void reverse(int[] arr, int l, int r) {
        while(l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
}
