package Subarrays;

import java.util.ArrayList;
import java.util.Arrays;

public class SubarraySum {

    public static void main(String[] args) {
        int[] arr = {3, -2, 4, -1, 2, 6};
        System.out.println(sumAll(arr));
    }

    /*
      *     sum of all subarray O(N^3)
     */
    public static ArrayList<Integer> sumAll(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {

            for (int j = i; j < n; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
                ans.add(sum);
            }

        }
        return ans;
    }
}
