package Subarrays;

import java.util.ArrayList;

public class SlidingWindow {
    public static void main(String[] args) {
        int[] arr = {3, -2, 4, -1, 2, 6};
        System.out.println(printAllSubarraySum(arr));
    }

    public static ArrayList<Integer> printAllSubarraySum(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; i++) {
                sum += arr[i];
                ans.add(sum);
            }
        }
        return ans;
    }

}
